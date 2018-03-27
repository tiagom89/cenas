package com.amor.pocScheduler.integration;

import javax.annotation.PostConstruct;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class PocGeneralStatistic {

	@PostConstruct
	public void init(){
		
	}
	
	@Scheduled(cron="${cronGetBaseStats}")
	public void getBaseStats(){
		
		
		
		
		
	}
	
	
	
}
