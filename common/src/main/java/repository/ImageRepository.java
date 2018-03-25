package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image,Long>{
 
	List<Image> getImagesById(Long id);
	Image getImageById(Long imageId);
	
}
