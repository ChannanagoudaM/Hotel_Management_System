package com.example.OrderFoodProject.customersRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.OrderFoodProject.employee.Hotel_Customer;

public interface Customer_Repository extends JpaRepository<Hotel_Customer, Integer> {

}
