package com.huntercodexs.serveradminexample;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAdminServer
@SpringBootApplication
@EnableAutoConfiguration
public class ServerAdminExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerAdminExampleApplication.class, args);
	}

}
