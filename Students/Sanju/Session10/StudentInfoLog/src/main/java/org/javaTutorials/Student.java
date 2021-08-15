package org.javaTutorials;

public class Student extends Object {
    private Integer rollNumber;
    private String studentName;
    private String location;

    public Student(Integer rollNumber,String studentName,String location){
         this.rollNumber=rollNumber;
         this.studentName=studentName;
         this.location=location;
    }

    public Student() {
    super();
    }

    public Integer getRollNumber(){

        return this.rollNumber;
    }

    public String getStudentName(){

        return this.studentName;
    }

    public String getLocation(){

        return this.location;
    }

    @Override
    public String toString(){
    return "Name: "+this.getStudentName() + "Roll No: "+this.getRollNumber() +"Location: " +this.getLocation();
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;

        if (obj instanceof Student){
            Student otherStudent=(Student) obj;
            if(this.getRollNumber().equals(otherStudent.getRollNumber())==false)
                return false;

            if(this.getStudentName().equals(otherStudent.getStudentName())==false)
                return false;

            if(this.getLocation().equals(otherStudent.getLocation())==false)
                return false;

            return true;
        }
        return false;
    }
}


