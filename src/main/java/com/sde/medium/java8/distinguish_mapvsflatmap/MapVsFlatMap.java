package com.sde.medium.java8.distinguish_mapvsflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = EshopifyDAO.getAll();
        //System.out.println(customers);

        //for getting emails
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        //System.out.println("Emails: " + emails);
        customers.stream().map(customer -> customer.getEmail()).forEach(System.out::println);

        //for getting phoneNumbers
        //one to many mapping in List<List<String>>
        List<List<String>> phones=customers.stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println("Phones: " + phones);

       // customers.stream().map(customer -> customer.getPhoneNumbers()).forEach(System.out::println);

        //for one to many mapping in List<String>
        //input as stream of stream
        List<String> collectphones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println("Phones: " + collectphones);

    }
}
