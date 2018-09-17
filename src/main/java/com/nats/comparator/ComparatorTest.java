package com.nats.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student s1 = new Student(28, "Nats", 1012);
		Student s2 = new Student(32, "ARaj", 1013);
		Student s3 = new Student(23, "King", 1014);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list, new NameComparator());
		list.forEach(x->System.out.println(x.getAge()));
		Collections.sort(list,new AgeComparator());
		list.forEach(x->System.out.println(x.getAge()));
//		list.stream().sorted(new AgeComparator()).forEach(System.out::println);
//		list.stream().parallel().forEach(System.out::println);
	}
}
