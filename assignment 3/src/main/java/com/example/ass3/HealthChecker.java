package com.example.ass3;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class HealthChecker implements HealthIndicator {
	
	private static int i = 0;

	@Override
	public Health health() {
		int error = check();
		if(error!=0) {
			return Health.down().build();
		}
		return Health.up().build();
	}
	
	private int check() {
		
		//returning up and down on as odd and even access.
		if(i%2==0) {
			++i;
			return 0;
		}
		else {
			++i;
			return 1;
		}
	}
}
