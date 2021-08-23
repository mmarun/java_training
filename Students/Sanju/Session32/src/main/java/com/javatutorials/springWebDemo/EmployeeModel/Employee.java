package com.javatutorials.springWebDemo.EmployeeModel;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Employee {
    private Integer employeeId;
    private String empName;
    private String empDept;
    private BigDecimal salary;

}
