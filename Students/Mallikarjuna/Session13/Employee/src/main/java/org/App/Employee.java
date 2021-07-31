package org.App;

public class Employee extends Object
{
    private String firstNAME;
    private String lastNAME;
    private String empID;
    private String dptID;


    public Employee ()
    {
        super();
    }

    public Employee(String firstNAME, String lastNAME, String empID, String dptID)
    {

        this.firstNAME = firstNAME;
        this.lastNAME = lastNAME;
        this.empID = empID;
        this.dptID = dptID;
    }

    public String getFirstNAME()
    {
        return this.firstNAME;
    }

    public String getLastNAME()
    {
        return this.lastNAME;
    }

    public String getEmpID() {
        return this.empID;
    }


    public String getDptID() {
        return this.dptID;
    }


    public void setFirstNAME(String firstNAME){
        this.firstNAME = firstNAME;
    }
    public void setLastNAME(String lastNAME){
        this.lastNAME = lastNAME;
    }
    public void setEmpID(String empID){
        this.empID = empID;
    }
    public void setDptID(String dptID){
        this.dptID = dptID;
    }
    @Override
    public String toString() {
        return "FIRST NAME: " + this.getFirstNAME() + " LAST NAME: " + this.getLastNAME() + " EMPLOYEE ID: " + this.getEmpID() + " DEPARTMENT ID: " + this.getDptID();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof Employee){
            Employee otherEmployee = (Employee) obj;
            if (this.getFirstNAME().equals(otherEmployee.getFirstNAME()) == false)
                return false;
            if (this.getLastNAME().equals(otherEmployee.getLastNAME()) == false)
                return false;
            if (this.getEmpID().equals(otherEmployee.getEmpID()) == false)
                return false;
            if (this.getDptID().equals(otherEmployee.getDptID()) == false)
                return false;


            return true;
        }
        return false;
    }
}
