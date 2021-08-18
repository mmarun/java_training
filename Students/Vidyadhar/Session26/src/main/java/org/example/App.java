package org.example;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

//Implementing Consumer Interface
        Consumer<Integer> evenNum = (num)->{
            if( num%2==0)
            {
                System.out.println("Printing evenNumber Using Consumer : "+num);
            }
        };

        ArrayList<String > names = new ArrayList<String>();
        names.add("Anand");
        names.add("Nitesh");
        names.add("Omkar");
        names.add("Varun");
        names.add("Nitin");
        names.add("Akash");
        names.add("Varun");
        names.add("Omkar");


        Function<String,String > printName = (name)->
        {
            return "Hi Arun This is : "+name;
        };

        Predicate<String> nameStartwith = name ->
        {
            if(name.startsWith("A"))
                return true;
            return false;
        };


        ArrayList<Integer> number = new ArrayList<>();
        for (int i=1;i<=10;i++)
        {
            number.add(i);
        }
        System.out.println(number);

        //Printing names starts with A using predicte and Arraylist
        System.out.println("Printing names starts with A");
        names.stream().filter(nameStartwith).forEach(n-> System.out.println("The given Name starts with A: "+n));

        System.out.println("names Printing with msg");
        names.stream().forEach(n-> System.out.println(printName.apply(n)));

        List<Integer> OddNumMultiplication = number.stream().filter(k->k%2==1).map(n->n*9) .collect(Collectors.toList());
        OddNumMultiplication.forEach(System.out::println);

        //Printing EvenNumber from the Arraylist using Consumer method
        number.forEach(evenNum);

        System.out.println(Stream.of("Anand","B","P").reduce("Name :",(String a,String b)->a+" "+b));

        names.forEach(n-> System.out.println(n));
        System.out.println("Arraylist Names displaying in sorted order using sorted");
        System.out.println("-------------------------------------------------------");
        names.stream().sorted().forEach(n-> System.out.println(n));

        System.out.println("removing duplicates from the list by converting list into set ");
        names.stream().collect(Collectors.toSet()).forEach(n-> System.out.println(n));

        names.stream().filter(n->n.endsWith("n")).map(n->n+" He's from Dehli").collect(Collectors.toList()).forEach(n-> System.out.println(n));

    }

}
