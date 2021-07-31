package com.session9;

import java.util.Objects;

public class Employee
{
    private String firstName;
    private String lastName;
    private Integer empId;
    private Integer deptId;

    public Employee()
    {
        super();
    }
    public  Employee(String firstName,String lastName,Integer empId,Integer deptId)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.empId=empId;
        this.deptId=deptId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empId=" + empId +
                ", deptId=" + deptId +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if(obj instanceof Employee)
        {
            Employee employee=(Employee) obj;
            if(this.getFirstName().equals(employee.getFirstName())==false)
            {
                return false;
            }
            if(this.getLastName().equals(employee.getLastName())==false)
            {
                return false;
            }
            if(this.getEmpId().equals(employee.getEmpId())==false)
            {
                return false;
            }
            if(this.getDeptId().equals(employee.getDeptId())==false)
            {
                return false;
            }

            return true;
        }
        return false;
    }

}
