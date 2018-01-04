package com.nats.ObjectOriented;

import java.util.HashMap;
import java.util.Map;

public class OverrideHashCode {

	public static void main(String[] args) {
		Student s1  = new Student(2072, "Nats");
		Student s2  = new Student(2072, "Nats");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Map<Student, String> map = new HashMap<Student,String>();
		map.put(new Student(2022, "Raj"), "Nataraja");
		System.out.println(map.get(new Student(2022, "Raj")));
	}
}

class Student {
	String name;
	int id;
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		if (obj==this) {
			return true;
		} else if (this.id==((Student)obj).id && this.name==((Student)obj).name) {
			return true;
		}
		return false;	
	}
	
	@Override
	public int hashCode() {
		int result = 0;
		result = this.id*10 + this.name.hashCode();
		return result;
	}
}
