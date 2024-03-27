package com.example.OrderFoodProject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.OrderFoodProject.TotalOrders;
import com.example.OrderFoodProject.customers.Hotel_Employees;
import com.example.OrderFoodProject.customersRepository.Customer_Repository;
import com.example.OrderFoodProject.employee.Hotel_Customer;
import com.example.OrderFoodProject.employeeRepositories.Employee_Repository;
import com.example.OrderFoodProject.foodRepo.FoodRepos;
import com.example.OrderFoodProject.foods.Food_Menu;
import com.example.OrderFoodProject.totalRepo.TotalRepo;

@Controller
public class FrontController {

	@Autowired
	Employee_Repository erepo;


	@Autowired
	Customer_Repository crepo;


	@Autowired
	FoodRepos frepo;


	@Autowired
	TotalRepo trepo;
	
	
	@RequestMapping("/")
	public String open()
	{
		return "welcome.jsp";
	}

	@RequestMapping("employee")
	public String addEmployees(Hotel_Employees emp)
	{
		erepo.save(emp);
		return "welcome.jsp";
	}


	@RequestMapping("customer")
	public String addCustomers(Hotel_Customer cus)
	{
		crepo.save(cus);
		return "welcome.jsp";
	}


	@RequestMapping("addFoods")
	public String addFoods(@RequestParam("code")int code,Model model)
	{
		Hotel_Employees h=erepo.findBycode(code);
		System.out.println(h);
		if(h!=null)
		{
			String name=h.getName();
			model.addAttribute("name",name);
			return "addtomenu.jsp";
		}
		else
		{
			model.addAttribute("object",h);
		}
		return "welcome.jsp";

	}
	//	 @PostMapping("/sendNotification")
	//	public ResponseEntity<String> errorMsg(@ModelAttribute("object")Hotel_Employees emp)
	//	{
	//		if(emp==null)
	//		{
	//			ResponseEntity.ok("Enter Valide Code");
	//		}
	//		return ResponseEntity.ok("");
	//	}

	@RequestMapping("addfoodstomenu")
	public ModelAndView insertFoods(Food_Menu menu,@ModelAttribute("name")String name)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcome.jsp");
		mv.addObject("name",name);
		frepo.save(menu);
		return mv;
	}


	@RequestMapping("menu")
	@ResponseBody
	public String menu()
	{
		List<Food_Menu>f=frepo.findAll();
		return f.toString();
	}


	@RequestMapping("order")
	public String orderFood(Model model,@RequestParam("id") int id)
	{
		Optional<Food_Menu>f=frepo.findById(id);
		Food_Menu m=f.get();
		String name=m.getFood_name();
		model.addAttribute("name",name);
		//		System.out.println(name);
		return "placed.jsp";

	}

	@RequestMapping("placed")
	public ModelAndView orderPlaced(@ModelAttribute("name") String fname,Model model)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("name",fname);
		System.out.println(fname);
		mv.setViewName("placed.jsp");
		model.addAttribute("name",fname);

		return mv;
	}


	@RequestMapping("total")
	public ModelAndView totalOrders(@ModelAttribute("name")String name,Model model)
	{
		ModelAndView mv=new ModelAndView();
		TotalOrders t=new TotalOrders();
		t.setFname(name);
		mv.setViewName("totalOrders.jsp");
		System.out.println(name);
		model.addAttribute("totalOrders", t);
		trepo.save(t);
		System.out.println(t);
		return mv;
	}
}
