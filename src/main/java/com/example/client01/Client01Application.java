package com.example.client01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class Client01Application {
	@RequestMapping(method = RequestMethod.GET, value = "/customer")
	public String getClient01() {
		return "Sprintec3";
	}
	public static void main(String[] args) {
		SpringApplication.run(Client01Application.class, args);
	}

}
