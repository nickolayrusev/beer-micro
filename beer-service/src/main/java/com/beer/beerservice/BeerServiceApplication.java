package com.beer.beerservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class MessageController{

	private final String message;

	MessageController(@Value("${hello}") String message) {
		this.message = message;
	}

	@GetMapping("/hello")
	public String hello(){
		return this.message;
	}
}
@SpringBootApplication
public class BeerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeerServiceApplication.class, args);
	}
}
