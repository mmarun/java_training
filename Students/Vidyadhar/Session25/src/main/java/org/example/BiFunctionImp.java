package org.example;

import java.util.function.BiFunction;

public class BiFunctionImp implements BiFunction<Double,Double,Double> {
    @Override
    public Double apply(Double a, Double b) {
        return a*b;
    }
}
