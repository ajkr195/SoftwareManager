package com.springboot.license.manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.springboot.license.manager.model.AppSoftware;

@Configuration
public class RestRepoConfig {

	@Bean
	RepositoryRestConfigurer repositoryRestConfigurer() {
		return RepositoryRestConfigurer
				.withConfig(repositoryRestConfiguration -> repositoryRestConfiguration.exposeIdsFor(AppSoftware.class));
	}

	//@Bean
	RepositoryRestConfigurer configureRepositoryRestConfiguration() {
		return RepositoryRestConfigurer
				.withConfig(repositoryRestConfiguration -> repositoryRestConfiguration.disableDefaultExposure());
	}
	
	@Bean
	RepositoryRestConfigurer getMetadataConfiguration() {
		return RepositoryRestConfigurer
				.withConfig(repositoryRestConfiguration -> repositoryRestConfiguration.getMetadataConfiguration().setAlpsEnabled(false));
	}
}