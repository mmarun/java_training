package com.javaTutorials.interfaces;

import java.util.function.BiFunction;

public class BiFunctionImpl implements BiFunction<Integer,Integer,Integer> {
    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return integer + integer2;
    }
}