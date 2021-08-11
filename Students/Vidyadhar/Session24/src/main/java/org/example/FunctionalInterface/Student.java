package org.example.FunctionalInterface;

public interface Student {

    public String studentInfo();

    static String studentName(String name)
    {
        return name;
    }

    static String collegeName()
    {
     return " From MVJCE College";
    }

    default Integer collegeFee()
    {
        return 80000;
    }

    static Integer add(Integer a,Integer b)
    {
        return a+b;
    }

}
