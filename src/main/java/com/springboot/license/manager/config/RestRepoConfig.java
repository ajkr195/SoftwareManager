package com.springboot.license.manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.springboot.license.manager.model.AppSoftware;


@Configuration
public class RestRepoConfig  {

	 @Bean
	    RepositoryRestConfigurer repositoryRestConfigurer() {
	        return RepositoryRestConfigurer.withConfig(repositoryRestConfiguration ->
	            repositoryRestConfiguration.exposeIdsFor(AppSoftware.class)
	        );
	    }
}