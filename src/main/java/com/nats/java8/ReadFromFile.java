package com.nats.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;

public class ReadFromFile {
	
	public static void main(String[] args) throws IOException {
		System.out.println("done");
		Predicate<String> p1 = e->e.contains("Nataraja");
		String filePath = "/Users/nataraja.maruthi/Documents/GlobalGit/JavaCodies/resources/Sample.txt";
		List<String> readAllLines = Files.readAllLines(Paths.get(filePath));
//		for (String string : readAllLines) {
////			System.out.println(string);
//		}
		
		 System.out.println(Files.newBufferedReader(Paths.get(filePath)).lines().count());
//		 Files.newBufferedReader(Paths.get(filePath)).lines().forEach((n)->System.out.println(n));
		 //Files.newBufferedReader(Paths.get(filePath)).lines().filter(p->p.contains("Nataraja")).forEach((n)->System.out.println(n));
		 System.out.println(Files.newBufferedReader(Paths.get(filePath)).lines().allMatch(p1));
		 System.out.println(Files.newBufferedReader(Paths.get(filePath)).lines().anyMatch(p1));
		 System.out.println(Files.newBufferedReader(Paths.get(filePath)).lines().noneMatch(p1));
//		 Files.newBufferedReader(Paths.get(filePath)).lines().fl;
		
	}

}
