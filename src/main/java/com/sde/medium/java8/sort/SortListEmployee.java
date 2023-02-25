package com.sde.medium.java8.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListEmployee {
    public static void main(String[] args) {
        List<Integer> numberList=new ArrayList<>();
        numberList.add(12);
        numberList.add(2);
        numberList.add(36);
        numberList.add(24);
        numberList.add(50);

        //Collections.sort(numberList);//Ascending order
        //Collections.reverse(numberList);//Descending order
        //System.out.println(numberList);

        //through stream api
        //numberList.stream().sorted().forEach(s -> System.out.println(s));//ascending order
       // numberList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));//descending order

        List<Employee> employees=Database.getEmployees();
        System.out.println("2.employees " + employees);

        //Anonymous inner class
       /* Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                System.out.println("3.comparing process begins at " + o1.getSalary() + " and " + o2.getSalary());
                return (int) (o1.getSalary()-(o2.getSalary()));
            }

        });
        System.out.println("Final Employees O/P " +employees);*/

        //Anonymous inner class replaced with lambda
        Collections.sort(employees, (o1, o2) ->  (int) (o1.getSalary()-(o2.getSalary())));
        System.out.println("Collections.sort way Final Employees O/P " +employees);


        //employees.stream().sorted((o1, o2) ->  (int) (o1.getSalary()-(o2.getSalary()))).forEach(s -> System.out.println(s));

        //employees.stream().sorted((o1, o2) ->  (int) (o1.getSalary()-(o2.getSalary()))).forEach(System.out::println);

        employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
        //employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
    }
}

/*
class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        System.out.println("3.comparing process begins at " + o1.getSalary() + " and " + o2.getSalary());
        return (int) (o1.getSalary()-(o2.getSalary()));
    }
}
*/
