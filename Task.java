package com.Himanshu.ProblemPractice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task{	
	 private int id;
	 private int deptId;
	 private String name;
	 private int salary;

	 public Task(int id, int deptId, String name, int salary) {
	  super();
	  this.id = id;
	  this.deptId = deptId;
	  this.name = name;
	  this.salary = salary;
	 }
	 public int getId() {
	  return id;
	 }
	 public String getName() {
	  return name;
	 }
	 public int getSalary() {
	  return salary;
	 }
	 public int getDeptId() {
	  return deptId;
	 }

	 public static void main(String[] args) {
	  List < Task > employees = Arrays.asList(new Task(1, 1000, "Chandra Shekhar", 6000), new Task(1, 1000, "Rajesh", 8000), new Task(1, 1004,
	    "Rahul", 9000), new Task(1, 1001, "Suresh", 12000),
	   new Task(1, 1004, "Satosh", 8500));

	  int total = 0;
	  for(Task e: employees){
		  total+=e.getSalary();
		  }
	  
	  System.out.println("The total Salary of all the employees are:-"+total);
	  
	 }

	}


