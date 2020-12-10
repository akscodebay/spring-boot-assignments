package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.pojo.Employee;
import com.example.repository.EmployeeRepository;

@Controller
public class RequestMapper {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("employee", new Employee());
		return "index";
	}
	
	@PostMapping("/")
	public String submit(@ModelAttribute("employee") Employee emp, Model model){
		System.out.println(emp);
		employeeRepository.save(emp);
		model.addAttribute("employee", new Employee());
		model.addAttribute("message", "Data SuccessFully Inserted");
		return "index";
	}
	
	@GetMapping("/displayAll")
	public String displayAllData(Model model) {
		model.addAttribute("employee", employeeRepository.findAll());
		return "database";
	}
	
	@GetMapping("/display/{id}")
	public String employeeDetail(@PathVariable("id") int id, Model model) {
		if(employeeRepository.findById(id).isPresent()) {
			model.addAttribute("employee", employeeRepository.findById(id).get());
		}
		else {
			model.addAttribute("message", "Data not Found");
		}
		return "employeeDetail";
	}

}
