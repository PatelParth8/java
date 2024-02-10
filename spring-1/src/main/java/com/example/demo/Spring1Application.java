package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring1Application implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee("1", "Henil", "Patel");
		Employee e2 = new Employee("2", "Utsav", "Patel");
		Employee e3 = new Employee("3", "Devarsh", "Patel");
		
		employeeRepository.save(e1);
		employeeRepository.save(e2);
		employeeRepository.save(e3);
		
		List<Employee> employees = employeeRepository.findAll();
		
		for(Employee e : employees) {
			System.out.print(e.toString());
		}
	}

}
