package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        oddList.stream().filter(isPrime).forEach(k->System.out.println(k));

        //printing perfect numbers from list
        list.stream().filter(isPerfect).forEach(System.out::println);

        //getting max number from list using reduce
        System.out.println(list.stream().reduce(0,Integer::max));

    }
}
