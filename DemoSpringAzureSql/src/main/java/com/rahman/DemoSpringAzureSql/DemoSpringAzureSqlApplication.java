package com.rahman.DemoSpringAzureSql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringAzureSqlApplication {

	@Autowired
	private EmployeeRepository repo;
	
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		return repo.save(emp);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		
		return repo.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringAzureSqlApplication.class, args);
	}

}
