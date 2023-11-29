package com.cleberfeitosa.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogApplication {

	public String POST = System.getenv("PORT");

	public static void main(String[] args) {
		SpringApplication.run(CatalogApplication.class, args);
	}

}
