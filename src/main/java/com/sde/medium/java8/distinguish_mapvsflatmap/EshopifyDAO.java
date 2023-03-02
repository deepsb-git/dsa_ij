package com.sde.medium.java8.distinguish_mapvsflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EshopifyDAO {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(23,"John","smith@gmail.com", Arrays.asList("8895666789","9777652243")),
                new Customer(43,"Soya","soya@gmail.com", Arrays.asList("4895666759","6777652243")),
                new Customer(23,"Zoan","zoan@gmail.com", Arrays.asList("5895666789","4777652243")),
                new Customer(23,"Poohn","poohn@gmail.com", Arrays.asList("9895666789","1777652243")),
                new Customer(23,"Lohn","lohn@gmail.com", Arrays.asList("1895666789","2777652243"))
        ).collect(Collectors.toList());
    }
}
