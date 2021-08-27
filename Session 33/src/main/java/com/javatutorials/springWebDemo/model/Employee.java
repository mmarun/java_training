package com.javatutorials.springWebDemo.model;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String designation;
    private String department;

    //Big-decimal is better when you use amount..
    // double it has a lot of precision..
    // 10000.00 - 1.0 may lead to 9999.0000001

    //Bigdecimal you can specify scale. 2 decimal points, if you 5 decimal points..
    //The rounding issues above dont exist with BigDecimal..
    private BigDecimal salary;
}
