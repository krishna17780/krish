package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.UserClient;
import com.example.springfreign.UserResponse;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringFeignApplication {
	
	@Autowired
	private UserClient client;
	
	@GetMapping("/findAllUsers")
	public List<UserResponse> getAllUsers(){
		return client.getUsers();
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignApplication.class, args);
	}

}
