package com.amor.pocScheduler;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@EnableConfigurationProperties
public class ImageSchedulerBaseConfig {
	
	@Value("${dataSourceUsername}")
	private String dataSourceUsername;
	@Value("${dataSourceDriverName}")
	private String dataSourceDriverName;
	@Value("${dataSourceUrl}")
	private String dataSourceUrl;
	@Value("${dataSourcePassword}")
	private String dataSourcePassword;
	
	@Bean
	public DataSource getDataSource(){
		
		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName(dataSourceDriverName);
		dataSource.setUrl(dataSourceUrl);
		dataSource.setUsername(dataSourceUsername);
		dataSource.setPassword(dataSourcePassword);
		return dataSource;
	}
	

}
