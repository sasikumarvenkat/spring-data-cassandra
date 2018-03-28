package com.example.cassandra.springdatacassandra.delegate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ServiceDelegate {

	private static final Logger LOGGER = LogManager.getLogger(ServiceDelegate.class);
	
	public void getDemoData() {
		LOGGER.traceEntry();
		LOGGER.traceExit();
	}
}
