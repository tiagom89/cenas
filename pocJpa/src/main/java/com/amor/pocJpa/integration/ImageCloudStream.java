package com.amor.pocJpa.integration;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ImageCloudStream {
	
	String INPUT = "input";
	
	@Input(INPUT)
	SubscribableChannel getImgurImages();
	
}
