package com.example.demo.personel;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;

public class CustomHealthIndicator extends AbstractHealthIndicator{
	 
   
	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
		// TODO Auto-generated method stub
		builder.up().withDetail("app", "app-builder").withDetail("error", "error-app-builder");
	}
}
