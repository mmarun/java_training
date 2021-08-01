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
    private String lastName;
    private Integer empId;
    private Integer deptId;
    private Integer salary;

    @Override
    public int compareTo(Employee otherEmployee) {
        return this.getFirstName().compareTo(otherEmployee.getFirstName());
    }
}
