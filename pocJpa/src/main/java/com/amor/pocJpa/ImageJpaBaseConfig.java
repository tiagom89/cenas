package com.amor.pocJpa;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.amor.pocJpa.integration.ImageCloudStream;
import config.CommonsConfiguration;

@Configuration
@EnableBinding(ImageCloudStream.class)
@Import(CommonsConfiguration.class)
@EnableConfigurationProperties
public class ImageJpaBaseConfig {

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
