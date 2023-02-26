package com.sde.medium.java8.csp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierApply {



    public static void main(String[] args) {
        //Supplier<String> supplier=new SupplierApply();
        //System.out.println(supplier.get());

        //Supplier<String> supplier=()->"Deepspace";
        //System.out.println(supplier.get());

        List<String> list= Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(()->"Deepspace"));

    }
}
