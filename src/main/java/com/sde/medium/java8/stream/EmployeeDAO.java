package com.sde.medium.java8.stream;



import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public static List<Employee> getEmployees(){
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(13, "John", "IT", 100000));
        employeesList.add(new Employee(8, "Jane", "R&D", 200000));
        employeesList.add(new Employee(33, "Mike", "DRDO", 500000));
        employeesList.add(new Employee(14, "Mary", "AVIATION", 405000));
        employeesList.add(new Employee(25, "Sarah", "AGRO&FOOD", 350000));
        return  employeesList;
    }
}
