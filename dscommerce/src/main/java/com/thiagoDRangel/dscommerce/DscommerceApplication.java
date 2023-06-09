package com.thiagoDRangel.dscommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DscommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DscommerceApplication.class, args);
		System.out.println("Server on PORT 8080");
	}

}
