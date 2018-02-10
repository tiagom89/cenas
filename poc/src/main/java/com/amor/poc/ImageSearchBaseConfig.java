package com.amor.poc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;
import org.apache.tomcat.jdbc.pool.DataSource;

@EnableConfigurationProperties
@Configuration
public class ImageSearchBaseConfig {
	
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
	
	@Bean
	@Scope(value="prototype")
	public RestTemplate getRestTemplate(){
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
	
	

}
