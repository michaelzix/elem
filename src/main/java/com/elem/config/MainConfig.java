package com.elem.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.elem.service.IndexService;
import com.mchange.v2.c3p0.jboss.C3P0PooledDataSource;

@Configuration
public class MainConfig {

	
	@Bean
	public  IndexService  indexService(){
		return new IndexService();
	}
	
	@Bean(destroyMethod="close")
	@ConfigurationProperties(prefix="app.datasource")
	public C3P0PooledDataSource dataSource() {
		C3P0PooledDataSource dataSource = new C3P0PooledDataSource();
		System.out.println(dataSource.getDriverClass());
		System.out.println(dataSource.getUser());
		return dataSource;
	}
}
