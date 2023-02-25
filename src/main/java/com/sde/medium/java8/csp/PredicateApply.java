package com.sde.medium.java8.csp;

import java.util.function.Predicate;

public class PredicateApply implements Predicate<Integer> {

    @Override
    public boolean test(Integer num) {
        if(num%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = new PredicateApply();
        System.out.println(predicate.test(2));
    }
}
