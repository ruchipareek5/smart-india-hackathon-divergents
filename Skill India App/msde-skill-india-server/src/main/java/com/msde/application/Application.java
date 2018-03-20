package com.msde.application;

import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages={"com.msde.sih"})
@EnableAutoConfiguration
@EnableScheduling

public class Application {

	/** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
    
    /** The Constant APPLICATION_PID. referenced in the Linux script appAdmin.sh for start/stop/restart */
  //  private static final String APPLICATION_PID = "/apps/qrencia/application.pid"; 
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
        SpringApplication app = builder.application();
        
     //   app.addListeners(new ApplicationPidFileWriter(APPLICATION_PID));
        app.run(args);
        LOGGER.info("Time Zone set to {} ....", TimeZone.getDefault().getDisplayName());

	}

}
