package com.dmless.dmmachine.configuration;

import com.dmless.dmmachine.data.SimpleCauseDao;
import com.dmless.dmmachine.service.causes.SimpleCauseService;
import com.dmless.dmmachine.service.causes.SimpleCauseServiceJdbcImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by Charles on 8/27/2016.
 */
@Component
public class CauseConfiguration {

	@Autowired
	SimpleCauseDao causeDao;

	@Bean
	public SimpleCauseService simpleCauseService(){
//		return new SimpleCauseServiceMockImpl();
		return new SimpleCauseServiceJdbcImpl(causeDao);
	}
}
