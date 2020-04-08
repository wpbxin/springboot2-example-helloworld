package com.wpbxin;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloWorldExample {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldExample.class, args);
	}
}