package com.huntercodexs.servicediscoveryexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryExampleApplication.class, args);
	}

}
