package com.nitish;



import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.nitish.resources.HelloResource;

@Configuration
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig() {
		register(HelloResource.class);
		
	}

}
