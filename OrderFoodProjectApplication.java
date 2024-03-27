package com.example.OrderFoodProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.OrderFoodProject.customersRepository.Customer_Repository;
import com.example.OrderFoodProject.employeeRepositories.Employee_Repository;

@SpringBootApplication
public class OrderFoodProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderFoodProjectApplication.class, args);
		System.out.println("Namaste");
	}

}
