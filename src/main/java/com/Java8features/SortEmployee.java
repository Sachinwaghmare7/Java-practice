package com.Java8features;

import java.util.ArrayList;
import java.util.List;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class SortEmployee {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "sachin", 30000));
		list.add(new Employee(2, "ajay", 40000));
		list.add(new Employee(3, "moglaji", 50000));
		list.add(new Employee(4, "akshay", 60000));
		list.add(new Employee(5, "aniket", 70000));

		list.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
		list.forEach(e -> System.out.println(e.name + "   " + e.salary));
	}

}
