package com.example.cassandra.springdatacassandra.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/neurai-data-lake")
@RestController
public class ServiceResource {

	private static final Logger LOGGER = LogManager.getLogger(ServiceResource.class);

	@GetMapping
	public String helloWorld() {
		LOGGER.traceEntry();
		return LOGGER.traceExit("Data Lake Servie is running !..");
	}
}
