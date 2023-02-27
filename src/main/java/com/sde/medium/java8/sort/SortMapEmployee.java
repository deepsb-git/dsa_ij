package com.sde.medium.java8.sort;

import java.util.*;

public class SortMapEmployee {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(3, "John");
        map.put(9, "Aary");
        map.put(7, "Kike");
        map.put(1, "Jodan");
        map.put(8, "Salike");

        //List<Map.Entry<Integer,String>> entries=new ArrayList<>(map.entrySet());
        //critical logic@v.0
      /*  Collections.sort(entries, new Comparator<Map.Entry<Integer,String>>() {

            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });*/

        //critical logic@v.1
       /* Collections.sort(entries, ( o1, o2)->o1.getKey().compareTo(o2.getKey()));
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/

        //through stream api@v.2
        //map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        //System.out.println("---------------------------------------------------");
        //map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        //map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out::println);

        //-------------------------------------------------------------------------------------------------------

        //without lambda@v.0
        /*Map<Employee,Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });*/

        //with lambda@v.1
        Map<Employee,Integer> employeeMap = new TreeMap<>((o1, o2)->
                (int) (o1.getSalary() - o2.getSalary()));



        employeeMap.put(new Employee(13, "John", "IT", 500000),89);
        employeeMap.put(new Employee(8, "Jane", "R&D", 200000),76);
        employeeMap.put(new Employee(33, "Mike", "DRDO", 100000),18);
        employeeMap.put(new Employee(14, "Mary", "AVIATION", 405000),40);
        employeeMap.put(new Employee(25, "Sarah", "AGRO&FOOD", 350000),35);

       // System.out.println(employeeMap);

        //using stream@v.2 ascending order
        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println);

        System.out.println("*****************************************************");
        ////using stream@v.2 descending order
        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(System.out::println);

    }


}
