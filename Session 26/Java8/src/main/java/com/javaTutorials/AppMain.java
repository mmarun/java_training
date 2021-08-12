package com.javaTutorials;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppMain  {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(15);
        list.add(28);
        list.add(46);
        list.add(78);
        list.add(89);

        List<Integer> evenListOld = new ArrayList<>();
        //Iterate the list
        for(Integer i : list){
            if (i % 2 == 0){
                evenListOld.add(i);
            }
        }

        for(Integer i: evenListOld){
            System.out.println(i);
        }

        //If I want to get only a list of even elements..
        List<Integer> evenList = list.stream().filter(k -> k % 2 == 0).collect(Collectors.toList());
        evenList.stream().forEach(k-> System.out.println(k));

        List<Double> multipliedList = list.stream().map( k-> k * 1000.00).collect(Collectors.toList());
        multipliedList.stream().forEach(k -> System.out.println(k));
        multipliedList.stream().forEach(System.out::println);

        //reduce - It performs aggregate operations - average, sum, percentage, minimum, maximum
        System.out.println(list.stream().reduce(0, Integer::max));

        list.stream().filter(k -> k % 2 == 0).collect(Collectors.toList());
        evenList.stream().forEach(k-> System.out.println(k));

        list.stream().map(k -> k+1).filter(k -> k % 2 ==0).forEach(System.out::println);

    }
}
