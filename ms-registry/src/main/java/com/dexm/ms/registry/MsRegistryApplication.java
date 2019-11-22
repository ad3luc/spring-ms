package com.dexm.ms.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRegistryApplication.class, args);
	}

}
