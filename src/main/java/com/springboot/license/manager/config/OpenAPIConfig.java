package com.springboot.license.manager.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
	
	@Bean
	//@Profile("!prod")
	GroupedOpenApi profileApi() {
	    return GroupedOpenApi.builder().group("SpringDataRESTProfile")
	            //.pathsToMatch("/profile/**")
	            .pathsToExclude("/profile/**")
	            //.pathsToExclude("/softwares/**")
	            .build();
	}

}
