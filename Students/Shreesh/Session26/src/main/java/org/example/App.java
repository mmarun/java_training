package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Predicate<Integer> isPrime=(noCheck)->
        {
            Boolean flag=true;
            for(int i=2;i<=noCheck/2;i++)
            {
                if(noCheck%i==0)
                {
                    flag=false;
                    break;
                }
            }
            return flag;
        };

        Function<Integer,Integer> getCube= cubeNo->{
            Integer result=cubeNo;
            for(int i=1;i<=2;i++)
            {
                result=result*cubeNo;
            }
            return result;
        };
        Function<Integer,Integer> getFact = baseNo->{
            Integer fact=1;
            for(int i=baseNo;i>=1;i--)
            {
                fact=fact*i;
            }
            return fact;
        } ;

        Predicate<Integer> isPerfect=(noPerfect)->{
            Boolean flag=false;
            int no=noPerfect;
            int sumNo=0;
            for(int no1=no%10;no>0;no1=no%10)
            {
                sumNo=sumNo+ getCube.apply(no1);
                no=no/10;
            }
            if(sumNo==noPerfect)
            {
                flag=true;
            }
            return flag;
        };

        List<Integer> list=new ArrayList<>();
        for(Integer no=1;no<=1000;no++)
        {
            list.add(no);
        }
        //creating new list with only odd numbers from the list
        List<Integer> oddList=list.stream().filter(no->no%2==1).collect(Collectors.toList());

        //Printing only prime numbers from odd list
        //oddList.stream().filter(isPrime).forEach(k->System.out.println(k));

        //printing perfect numbers from list
        list.stream().filter(isPerfect).forEach(System.out::println);

        // creating new list with perfect numbers //having issue
        List<Integer> perfectList =list.stream().filter(isPerfect).collect(Collectors.toList());

        System.out.println("printing fact of every perfect number using map");
        perfectList.stream().map(getFact).forEach(System.out::println);     // how to print custom message in print

        //getting max number from list using reduce
        System.out.println(list.stream().reduce(0,Integer::max));

        // creating employee list
        List<String> empList =new ArrayList<>();
        empList.add("shreesh");
        empList.add("shripad");
        empList.add("sagar");
        empList.add("nishant");
        empList.add("vikrant");
        empList.add("amar");
        empList.add("akshay");
        empList.add("vinod");

        empList.stream().forEach(name->System.out.println("Hi Arun its " + name ));

        System.out.println(Stream.of("shreesh","shripad","joshi").reduce("Name--",(String a, String b)->a +"-"+b));

        empList.stream().sorted().forEach(System.out::println);


    }
}
