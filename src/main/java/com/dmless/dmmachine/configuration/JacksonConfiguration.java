package com.dmless.dmmachine.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Charles on 8/27/2016.
 */
@Configuration
public class JacksonConfiguration {

	@Bean
	public ObjectMapper defaultObjectMapper() {
		return new ObjectMapper();
	}
}
