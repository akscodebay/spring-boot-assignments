package com.example;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestMapper {
	
	Map<Integer, Employee> employeeMap = new HashMap<>();
	
	@PostConstruct
	private void insertData() {
		employeeMap.put(1, new Employee(1, "Aayush", "aayush@wipro.com", "Hyderabad"));
		employeeMap.put(2, new Employee(2, "Aniket", "aniket@wipro.com", "Bangalore"));
		employeeMap.put(3, new Employee(3, "Umbrella", "umbrella@wipro.com", "Chennai"));
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAllDetails(){
		if(employeeMap.isEmpty()) {
			return new ResponseEntity<>("No Records Found",HttpStatus.OK);
		}
		return new ResponseEntity<>(employeeMap.entrySet(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDetails(@PathVariable("id") int id) {
		if(!employeeMap.containsKey(id)) {
			return new ResponseEntity<>("Record Not Found", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(employeeMap.get(id), HttpStatus.OK);
		
	}
	
	@PostMapping("/")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
		if(employeeMap.containsKey(employee.getId())) {
			return new ResponseEntity<String>("ID Already Exists", HttpStatus.BAD_REQUEST);
		}
		try {
			employeeMap.put(employee.getId(), new Employee(employee.getId(),
					employee.getName(), employee.getEmail(), employee.getLocation()));
			return new ResponseEntity<>("Data Created Successfully",HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<>("Data not Created. Something went Wrong.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/")
	public ResponseEntity<String> update(@RequestBody Employee emp){
		if(!employeeMap.containsKey(emp.getId())) {
			return new ResponseEntity<>(" Employye ID not Found", HttpStatus.BAD_REQUEST);
		}
		employeeMap.replace(emp.getId(), new Employee(emp.getId(), 
				emp.getName(), emp.getEmail(), emp.getLocation()));
		return new ResponseEntity<>("Record Updated", HttpStatus.OK);
	}
		
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id){
		if(!employeeMap.containsKey(id)) {
			return new ResponseEntity<>("Employee ID not Found",HttpStatus.BAD_REQUEST);
		}
		employeeMap.remove(id);
		return new ResponseEntity<>("Deleted", HttpStatus.OK);
	}
}
