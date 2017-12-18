package com.nats.java8;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.Setter;

public class CollectionEx {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
	
		
	}

	public static void print(String x) {
		System.out.println(x);
	}
	
	
  
}

@Data
@Setter
class Employee {
	
	Set<String> name;
	String empId;
	public void addName(String name) {
		if (this.name==null) {
			this.name = new HashSet<String>();
		}
		this.name.add(name);
	}
	
	
}
