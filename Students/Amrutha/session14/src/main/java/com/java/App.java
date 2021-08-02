package com.java;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {


        Map<Integer,Employee> mapList=new HashMap<>();
        mapList.put(1031,new Employee("Sudheesh","S",108,2,25000));
        mapList.put(1023,new Employee("Saari","S",105,2,35000));
        mapList.put(473,new Employee("Seethal","Binu",106,2,15000));
        mapList.put(204,new Employee("Amrutha","Sudheesh",110,2,27000));
        for(Employee emp: mapList.values()){
            System.out.println(emp);
        }

    }
}
