package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Predicate<Integer> chkEven =(noInput)->{
            return noInput % 2==0;
        };

        Predicate<String> chkString =(strInput)->{
            return strInput.length()>8;
        };

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

        Function<Integer,Integer> getCube=cubeNo->{
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

        BiFunction<Integer,Integer,Boolean> isSame=(no1,no2)->{
            return (no1==no2);
        };
        System.out.println(isSame.apply(13,13));

        System.out.println(getFact.apply(5));

        for (int noPerfect=1;noPerfect<=10000;noPerfect++)
        {
            if(isPerfect.test(noPerfect)==true)
            {
                System.out.println(noPerfect + " Is a Perfect no");
            }
        }


        System.out.println("Is 153 perfect no : " + isPerfect.test(153));

        for (int no =2;no <= 50;no ++)
        {
            if(isPrime.test(no)==true)
            System.out.println( no +" is Prime no ");
        }

        System.out.println("Is 63 Even No: " + chkEven.test(63));
        System.out.println("Is Shreesh can be Password : " +chkString.test("Shreesh"));

        Function<Integer,String> convertInt=inputInt->
          inputInt.toString();

        System.out.println(convertInt.apply(13));

        Function<Integer,Double> convert2Double= inInt->
                inInt.doubleValue();
        System.out.println("Double value For Integer 41 is :" +convert2Double.apply(41));

        BiFunction<Integer,Integer,Integer> multiplication=(no1,no2)->no1*no2;

        System.out.println("Multiplication of 46 and 13 is :" + multiplication.apply(46,13));

        BiFunction<Integer,Double,Float>simple =(intNo,douNo)-> intNo.floatValue()+douNo.floatValue();

        System.out.println("Adding int and double and showing result as float :" + simple.apply(13,46.6));

    }
}
