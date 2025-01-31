package com.example.backandfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class BackandfrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackandfrontApplication.class, args);

	}

	@GetMapping("/")
	public  String Hello(){
		return ("Hello, this is a proof that the Server Side is correctly working");
	}
}
