package com.example.OrderFoodProject.employeeRepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OrderFoodProject.customers.Hotel_Employees;

@Repository
public interface Employee_Repository extends JpaRepository<Hotel_Employees, Integer> {

	Hotel_Employees findBycode(int code);
	 
}
