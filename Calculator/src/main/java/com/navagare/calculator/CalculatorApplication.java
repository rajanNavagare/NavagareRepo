package com.navagare.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		System.out.println("Application Started"+10);
		SpringApplication.run(CalculatorApplication.class, args);
	}
}
