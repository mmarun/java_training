package com.javaTutorials;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Car  {
    private String company;
    private String variant;
    private Double cost;

    @Override
    public void finalize(){
        System.out.println(this + " is being deleted");
        Car car = null;
        System.out.println(car.toString());

    }
}
