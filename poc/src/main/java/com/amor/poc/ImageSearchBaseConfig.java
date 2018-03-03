package com.amor.poc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.client.RestTemplate;

import converters.ImgurImageAlbumDTOToImageConverter;

import java.util.HashSet;
import java.util.Set;

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
	
	@Bean
	public ConversionService getConversionService(){
		
		ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
		bean.setConverters(getConverters());
		bean.afterPropertiesSet();
		
		return bean.getObject();
		
	}
	
	@SuppressWarnings("rawtypes")
	private Set<Converter> getConverters(){
		Set<Converter> converters = new HashSet<>();
		converters.add( new ImgurImageAlbumDTOToImageConverter());
		
		return converters;
	}
	

}
