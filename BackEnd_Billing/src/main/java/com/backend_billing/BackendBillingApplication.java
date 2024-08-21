package com.backend_billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BackendBillingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendBillingApplication.class, args);
		System.out.println("Started BackendBilling microservices");
	}

}
