package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image,String>{
 
	List<Image> getImagesById(int id);
	Image getImageById(int imageId);
	
}
