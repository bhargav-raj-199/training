package com.csv.bean;

public class Employee {
private String name;
private String city;
private int salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String name, String city, int salary) {
	super();
	this.name = name;
	this.city = city;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
}
