package com.sapient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class HelloSpringboot {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringboot.class, args);
	}

	@GetMapping("/api/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return String.format("Hello, %s!", name);
	}

}
