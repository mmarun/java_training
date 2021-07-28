package com.java;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer empId;
    private Integer deptId;

    public Employee() {
       super();
    }

    public Employee(String firstName, String lastName, int empId, int deptId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
        this.deptId = deptId;
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

    /**
     * overriden method to check object are equal
     * @param emp
     * @return
     */
    @Override
    public boolean equals(Object emp) {
        if (this == emp) 
            return true;
        if(emp instanceof Employee)
        {
            Employee employeeObj = (Employee) emp;
            if(this.getFirstName().equals(employeeObj.getFirstName())==false)
                return false;
            if(this.getLastName().equals(employeeObj.getLastName())==false)
                return false;
            if(this.getEmpId().equals(employeeObj.getEmpId())==false)
                return false;
            if(this.getDeptId().equals(employeeObj.getDeptId())==false)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method to return hashcode
     * @return
     */
   @Override
    public int hashCode()
    {
        return 20*(this.getFirstName().hashCode()+this.getLastName().hashCode()+this.getEmpId().hashCode()+this.getDeptId().hashCode())+35;
    }
}
