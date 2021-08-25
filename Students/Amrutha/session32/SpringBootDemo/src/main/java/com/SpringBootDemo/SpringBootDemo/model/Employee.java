package com.SpringBootDemo.SpringBootDemo.model;

import lombok.*;


import java.math.BigDecimal;
import java.util.List;
//@data
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
    private BigDecimal salary;
    private List<Employee> list;
}
