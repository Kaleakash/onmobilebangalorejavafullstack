package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDetails {

	@Bean(name = "ll")
	public Location getEmployeeInstance() {
		return new Location();
	}
}
