package org.example;

public class Employee extends Object{

    private String firstName = "Varun";
    private String lastName = "HR";
    private Integer employeeId = 101;
    private String  employeeDeptId = "CSE123";

    public Employee()
    {
        super();
    }

    public Employee(String firstName, String lastName, Integer employeeId, String employeeDeptId)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.employeeDeptId = employeeDeptId;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(String employeeName)
    {
        this.firstName = employeeName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public void setLastName(String employeeLastname)
    {
        this.lastName = employeeLastname;
    }

    public Integer getEmployeeId()
    {
        return this.employeeId;
    }

    public void setEmployeeId(Integer employeeId)
    {
        this.employeeId=employeeId;
    }

    public String getEmployeeDeptId()
    {
        return this.employeeDeptId;
    }

    public void setDept_Id(String employeeDeptId)
    {
        this.employeeDeptId=employeeDeptId;
    }

    @Override
    public String toString()
    {
        return "EmployeeFirstName: "+this.getFirstName() +"EmployeeLastname: " + this.getLastName()+
                "EmployeeId: "+ this.getEmployeeId() + "EmployeeDeptId: "+this.getEmployeeDeptId();
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(obj instanceof Employee)
        {
            Employee otherEmp = (Employee) obj;

            if(this.getFirstName().equals(otherEmp.getFirstName()) == false)
                return false;

            if(this.getLastName().equals(otherEmp.getLastName()) == false)
                return false;

            if(this.getEmployeeId().equals(otherEmp.getEmployeeId()) == false)
                return false;

            if(this.getEmployeeDeptId().equals(otherEmp.getEmployeeDeptId()) == false)
                return false;

            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public int hashcode()
    {
        return 10*(this.getFirstName().hashCode()+this.getLastName().hashCode()
                +this.getEmployeeId().hashCode()+this.employeeDeptId.hashCode()) + 37;
    }
}
