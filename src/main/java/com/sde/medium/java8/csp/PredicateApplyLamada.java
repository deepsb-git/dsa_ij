package com.sde.medium.java8.csp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApplyLamada {


    public static void main(String[] args) {
       /* Predicate<Integer> predicate = num-> {
            if(num%2==0){
                return true;
            }
            return false;
        };*/
        Predicate<Integer> predicate=num->num%2==0;

       /* Predicate<Integer> predicate = new PredicateApply();
        System.out.println(predicate.test(2));*/
        System.out.println(predicate.test(2));

        List<Integer> list= Arrays.asList(1,2,3,5,7,8,9,11,14,15);

        list.stream().filter(num->num%2==0).forEach(num -> System.out.println("show even :"+ num));
    }
}
