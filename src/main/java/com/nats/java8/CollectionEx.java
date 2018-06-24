package com.nats.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.Setter;

public class CollectionEx {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.addName("nats");
		e1.addName("maruthi");
		e1.addName("king");
		e1.setEmpId("2072");
		
		Employee e2 = new Employee();
		e2.addName("nats");
		e2.addName("maruthi");
		e2.addName("king");
		e2.setEmpId("2073");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		
		empList.stream().forEach(x->x.setEmpId("3333"));
//		empList.stream().forEach(x->x.getName().stream().distinct().forEach(y->System.out.println(y)));
//		empList.stream().map(x->x.getName()).distinct().collect(Collectors.toList()).forEach(System.out::println);;
	
		
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
	public void setEmpId(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
