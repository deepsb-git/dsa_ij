package com.sde.medium.java8.sort;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Employee> getEmployees(){
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(13, "John", "IT", 1000));
        employeesList.add(new Employee(8, "Jane", "R&D", 200));
        employeesList.add(new Employee(33, "Mike", "DRDO", 100));
        employeesList.add(new Employee(14, "Mary", "AVIATION", 405));
        employeesList.add(new Employee(25, "Sarah", "AGRO&FOOD", 350));
        System.out.println("1.DAO employeesList: " + employeesList);
        return  employeesList;
    }
}
