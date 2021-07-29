package com.listCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExam
{
    public static void main(String[] args)
    {
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(23);
        arrayList.add(75);
        arrayList.add(93);
        arrayList.add(52);
        arrayList.add(6);
        arrayList.add(null);

        System.out.println("Printing Created ArrayList of "+arrayList.size()+" size..........");
        for(Integer i :arrayList)
        {
            System.out.print(i+" , ");
        }

        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(35);
        treeSet.add(67);
        treeSet.add(103);
        treeSet.add(3);
        //treeSet.add(null);
        treeSet.add(87);

        System.out.println("Printing Created TreeSet of "+ treeSet.size()+" size..........");
        for(Integer j :treeSet)
        {
            System.out.print(j+" , ");
        }



    }
}
