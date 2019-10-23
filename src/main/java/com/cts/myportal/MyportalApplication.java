package com.cts.myportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins="http://localhost:9000")
public class MyportalApplication {

	@GetMapping(value = "/greet")
	public String greeting() {
		return "welcome to paypal";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyportalApplication.class, args);
	}

}
