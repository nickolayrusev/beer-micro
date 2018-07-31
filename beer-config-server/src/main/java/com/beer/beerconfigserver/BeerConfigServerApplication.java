package com.beer.beerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BeerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeerConfigServerApplication.class, args);
	}
}
