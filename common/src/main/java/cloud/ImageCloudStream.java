package cloud;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ImageCloudStream {
	
	String inputImgurChannel = "ImgurQueue1";
	
	String imgurOutputExchange = "imgurExchangeAlbum";

	@Input(inputImgurChannel)
	SubscribableChannel getImgurImages();
	
	@Output(imgurOutputExchange)
	MessageChannel sendImgurImages();
	
}
