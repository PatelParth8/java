package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer c1 = new Customer("1","Parth","Patel");
		
		Customer c2 = new Customer("2","Devarsh","Patel");

		Customer c3 = new Customer("3","Utsav","Patel");
		
		Customer c4 = new Customer("4","Krish","Patel");
		
		customerRepository.save(c1);

		customerRepository.save(c2);

		customerRepository.save(c3);

		customerRepository.save(c4);
		
		System.out.print("**********************");
		
		List<Customer> customers = customerRepository.findAll();
		
		for(Customer c : customers) {
			System.out.print(c.toString());
		}

		// TODO Auto-generated method stub
		
	}

}
