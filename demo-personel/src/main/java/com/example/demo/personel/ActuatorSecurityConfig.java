package com.example.demo.personel;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.boot.actuate.context.ShutdownEndpoint;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class ActuatorSecurityConfig extends WebSecurityConfigurerAdapter {
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().requestMatchers(EndpointRequest.to(ShutdownEndpoint.class)).hasRole("role_admin")
				.requestMatchers(EndpointRequest.toAnyEndpoint()).permitAll()
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll().antMatchers("/")
				.permitAll().antMatchers("/**").authenticated().and().httpBasic();
	}
}
