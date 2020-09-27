package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
//	@Column(name = "age")
//	private int age;
//	
//	@Column(name = "salary")
//	private double salary;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//TODO: will be active when security layer is presented.
	
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		if(age <= 18 || age >= 75) {
//			throw new IllegalArgumentException("Person too young or too old to be in a working state!");
//		}		
//		this.age = age;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		if(salary < 0.0) {
//			throw new IllegalArgumentException("Salary cannot be a negative number!");
//		}
//		this.salary = salary;
//	}
	
	
	
	
}
