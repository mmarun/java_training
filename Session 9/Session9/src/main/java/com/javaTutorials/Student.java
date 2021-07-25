package com.javaTutorials;

public class Student extends Object {

    private Integer rollNumber;
    private String name;
    private String currentLocation;

    public Student () {
        super();
    }

    public Student(Integer rollNumber, String name, String currentLocation){

        this.name = name;
        this.rollNumber = rollNumber;
        this.currentLocation = currentLocation;
    }

    public Integer getRollNumber() {
        return this.rollNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getCurrentLocation() {
        return this.currentLocation;
    }

    public void setCurrentLocation(String currentLocation){
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " Roll number: " + this.getRollNumber() + " Current Location: " + this.getCurrentLocation();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof Student){
            Student otherStudent = (Student) obj;
            if (this.getName().equals(otherStudent.getName()) == false)
                return false;

            if (this.getRollNumber().equals(otherStudent.getRollNumber()) == false)
                return false;

            if (this.getCurrentLocation().equals(otherStudent.getCurrentLocation()) == false)
                return false;

            return true;
        }
        return false;
    }
}
