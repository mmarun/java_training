package com.collection;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Employee implements Comparable<Employee>
{
    private Integer empid;
    private String empName;
    private String empDept;
    private Double empSalary;
    private String empCity;

    @Override
    public int compareTo(Employee o) {
        return this.getEmpid()-o.getEmpid();
    }
}
