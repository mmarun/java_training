package org.javaTutorials;


public class Employee extends Object {
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String deptId;

    public Employee(Integer employeeId,String firstName,String lastName,String deptId){
        this.employeeId=employeeId;
        this.firstName=firstName;
        this.lastName= lastName;
        this.deptId=deptId;
    }
    public  Employee(){
        super();
    }

    public Integer getEmployeeId(){
        return this.employeeId;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getDeptId(){
        return this.deptId;
    }

    @Override
    public String toString(){
        return "Employee ID: "+ this.getEmployeeId()+
                "First Name: "+this.getFirstName()+
                "Last Name: "+this.getLastName()+
                "Department: "+this.getDeptId();
    }

    /**
     * Overriding equals method to check 2 objects equal
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj instanceof Employee){
            Employee other_Employee=(Employee) obj;
            if(this.getEmployeeId().equals(other_Employee.getEmployeeId())==false)
                return false;

            if (this.getFirstName().equals(other_Employee.getFirstName())==false)
                return false;

            if(this.getLastName().equals(other_Employee.getLastName())==false)
                return false;

            if(this.getDeptId().equals(other_Employee.getDeptId())==false)
                return false;

            return true;
        }
        return false;
    }

    /**
     * Overriding hashcode method
     * @return
     */
    @Override
    public int hashCode()
    {
        return 13 *(this.getEmployeeId().hashCode()
                +this.getFirstName().hashCode()
                +this.getLastName().hashCode()
                +this.getDeptId().hashCode())+37;
    }
}
