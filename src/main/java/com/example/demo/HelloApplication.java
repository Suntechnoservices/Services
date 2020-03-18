package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {
@RequestMapping("/hello")
public String test()
{
	return "hello";
}
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
		
		HelloApplication g=new HelloApplication();
		g.test();
	}

}
