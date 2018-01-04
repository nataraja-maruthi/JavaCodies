package com.nats.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by nataraja.maruthi on 1/4/18.
 */
public class FlatMapExample {

    public static void main(String[] args) {
        new FlatMapExample().testing();
    }

    public void testing () {
        List<Developer> ifcList = new ArrayList<>();
        Developer ifcQA = new Developer("IFC-QA");
        ifcQA.add("Nats");
        ifcQA.add("Sudheer");
        ifcQA.add("Mahesh");
        ifcQA.add("Venkat");
        ifcQA.add("Vaibhav");

        Developer ifcDev = new Developer("IFC-DEV");
        ifcDev.add("Sanjay");
        ifcDev.add("Bal");

        ifcList.add(ifcDev);
        ifcList.add(ifcQA);

        List<List<String>> collect = ifcList.stream().map(d -> d.getLanguages()).collect(Collectors.toList());
        System.out.println(collect);
        String collect1 = ifcList.stream().map(d -> d.getLanguages()).flatMap(l -> l.stream()).collect(Collectors.joining());
        System.out.println(collect1);
        List<String> collect2 = ifcList.stream().map(d -> d.getLanguages()).flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println(collect2);
        List<String> collect3 = ifcList.stream().map(d -> d.getLanguages()).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(collect3);
    }

}
class Developer {
    private String name;
    private List<String> languages;

    public Developer(String name) {
        this.name = name;
        this.languages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void add(String language) {
        this.languages.add(language);
    }


}
