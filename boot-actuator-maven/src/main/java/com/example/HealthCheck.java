package com.example;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck implements HealthIndicator{

	@Override
	public Health health() {
		boolean isCheck = check();
		if (isCheck) {
			int errorCode = 404;
			return Health.down().withDetail("Error Code", errorCode).build();
		}
		return Health.up().build();
	}
	
	 public boolean check() {
		return false;
	}
}
