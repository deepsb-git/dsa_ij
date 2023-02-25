package com.sde.medium.java8.csp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApply {



    public static void main(String[] args) {
             //Consumer<Integer> consumer=num -> System.out.println("show :"+ num);
             //consumer.accept(10);

             List<Integer> list= Arrays.asList(1,3,5,7,9,11,15);

             list.stream().forEach(num -> System.out.println("show :"+ num));
    }
}
