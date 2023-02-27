package com.sde.medium.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class GSTService {

    public static List<Employee> scaleTaxDeductionLimit(String input){
        //List<Employee> taxDeduction=EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() > 300000).collect(Collectors.toList());
        //return taxDeduction;
        return (input.equalsIgnoreCase("tax"))
                ? EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() > 300000).collect(Collectors.toList())
                : EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() <= 300000).collect(Collectors.toList());
        }


    public static void main(String[] args) {
        System.out.println(scaleTaxDeductionLimit("tax"));
    }
}
