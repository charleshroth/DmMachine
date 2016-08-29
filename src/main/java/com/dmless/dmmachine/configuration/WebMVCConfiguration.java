package com.dmless.dmmachine.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charles on 8/27/2016.
 */
@Configuration
public class WebMVCConfiguration extends WebMvcConfigurationSupport {

	@Autowired
	ObjectMapper defaultObjectMapper;

	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> messageConverters) {
		messageConverters.addAll(buildMessageConverters());
	}

	@Override
	protected void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.defaultContentType(MediaType.APPLICATION_JSON);
		configurer.favorPathExtension(false);
	}

	@Bean
	public List<HttpMessageConverter<?>> buildMessageConverters() {
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		MappingJackson2HttpMessageConverter jackson2Converter = new MappingJackson2HttpMessageConverter();
		jackson2Converter.setObjectMapper(defaultObjectMapper);
		messageConverters.add(jackson2Converter);
		return messageConverters;
	}

	@Bean
	public DataSource dataSource() {
		// no need shutdown, EmbeddedDatabaseFactoryBean will take care of this
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder
				  .setType(EmbeddedDatabaseType.H2)
				  .setName("causedb")
				  .addScript("create-causedb.sql")
				  .addScript("insert-cause-data.sql")
				  .build();
		return db;
	}

//	@Bean
//	public ServletRegistrationBean h2serviceRegistration(){
//		ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
//		registration.addUrlMappings("/console/*");
//		return  registration;
//	}

}
