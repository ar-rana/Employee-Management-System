package com.regal.EmployeeProject;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
@ComponentScan(basePackages= {"com.regal.EmployeeProject.web.EmployeeProject.*"})
public class EmployeeProjectApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectApplication.class, args);
	}
 
}