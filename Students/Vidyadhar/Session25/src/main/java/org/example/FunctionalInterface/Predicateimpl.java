package org.example.FunctionalInterface;

import java.util.function.Predicate;

public class Predicateimpl<T> implements Predicate<T> {
     public static boolean checkAge(Integer a)
    {
        if(a>18)
            return true;
        return false;
    }

    public static boolean divisible(Integer n)
    {
        if(n % 5 == 0)
            return true;
        return false;
    }

    @Override
    public boolean test(T t) {
        return false;
    }
}
