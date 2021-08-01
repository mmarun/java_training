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

}
