package com.example.openaichat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.openaichat.client")
public class OpenaiChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenaiChatApplication.class, args);
	}
}
