package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Employee implements Comparable<Employee>{

    private String firstName;
    private Integer empId;
    private String empDeptId;
    private Integer empSalary;

    @Override
    public int compareTo(Employee otherEmployee) {
    return this.getFirstName().compareTo(otherEmployee.getFirstName());
    }
}
