package com.sde.medium.java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachApply {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Senani");
        list.add("Siddharth");
        list.add("Pankaj");
        list.add("Lakshmi");
        list.add("Mishra");

       // System.out.println(list);

       /* for(String name : list) {
            System.out.println(name);
        }*/
       /* for(String name : list) {
            if(name.startsWith("S")) {
               System.out.println(name);
            }
        }*/

       // list.stream().filter(t -> t.startsWith("S")).forEach(System.out::println);
        //list.stream().forEach(t-> System.out.println(t));

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

       // map.forEach((k,v)-> System.out.println(k + " " + v));
        //map.entrySet().stream().forEach(obj-> System.out.println(obj));
        map.entrySet().stream().filter(k-> k.getKey()%2==0).forEach(obj-> System.out.println(obj.getKey() + " = " + obj.getValue()));

       // Consumer<String> consumer=(t)-> System.out.println(t);
        //consumer.accept("abc");
    }
}
