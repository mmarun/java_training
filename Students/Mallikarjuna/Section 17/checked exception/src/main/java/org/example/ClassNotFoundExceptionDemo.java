package org.example;

public class ClassNotFoundExceptionDemo
{
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

    public static void main(String[]  args) throws Exception{
        System.out.println("Trying to load MySQL JDBC driver");
        Class.forName(DRIVER_CLASS);
    }
}