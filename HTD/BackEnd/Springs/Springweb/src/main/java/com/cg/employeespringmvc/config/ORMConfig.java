package com.cg.employeespringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class ORMConfig {
@Bean
public LocalEntityManagerFactoryBean geLocalEntityManagerFactoryBean() {
	LocalEntityManagerFactoryBean bean=
			new LocalEntityManagerFactoryBean();
	bean.setPersistenceUnitName("employee-unit");
	return bean;
}
}
