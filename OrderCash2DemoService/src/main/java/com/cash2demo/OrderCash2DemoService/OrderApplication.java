package com.cash2demo.OrderCash2DemoService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication {
	private static final Logger logger = LogManager.getLogger(OrderApplication.class);

	// @Autowired
	// private DemoService demoService;

	public static void main(String[] args) {

		SpringApplication.run(OrderApplication.class, args);

		/*
		 * DemoService demoService = new DemoService();
		 * 
		 * logger.trace("Trace Message!"); logger.debug("Demo debug");
		 * logger.info("Demo info"); logger.error("demo error");
		 * 
		 * demoService.testString();
		 */

	}

}
