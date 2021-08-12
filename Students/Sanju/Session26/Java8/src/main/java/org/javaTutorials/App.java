package org.javaTutorials;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Introduction to Functional Interfaces like Predicate, Function, Consumer, Supplier
 *
 */

public class App
{

    public static void main( String[] args ) {

        // Consumer in Arraylist

        String str= "sanju";
        List<String> consumerlist=new ArrayList<>();
        for(int i=0;i<str.length();i++) {
            consumerlist.add(Character.toString(str.charAt(i)));
        }

        consumerlist.forEach(t-> System.out.println("Hi Arun -- "+t));


       List<Integer> list=new ArrayList<>();
        list.add(87);
        list.add(46);
        list.add(19);
        list.add(56);
        list.add(99);
        list.add(14);
        list.add(34);

        List<Integer> evenMultiply=list.stream().filter(k->k%2==0).map(k->k*100).collect(Collectors.toList());
        evenMultiply.forEach(System.out::println);

       // List<String> bifunctionlist=new ArrayList<>();
        System.out.println(Stream.of("Sanju","Mathew").reduce("Name--",(String a, String b)->a +"-"+b));


        List<String> employee=new ArrayList<>();
        employee.add("Sanju");
        employee.add("Amith");employee.add("Jovina");
        employee.add("Mathew");
        employee.add("Kripa");
        employee.add("Alphonsa");
        employee.add("Jocelyn");

        //default method of sorting
        List<String> employeefilter=employee.stream().sorted().collect(Collectors.toList());
        employeefilter.forEach(System.out::println);
























    }
}
