package com.javaTutorials;

import lombok.*;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Student implements Comparable<Student>{

    private String name;

    private Integer rollNumber;

    @Setter
    private Integer standard;

    private Character division;


    @Override
    public int compareTo(Student otherStudent) {
        return this.getName().compareTo(otherStudent.getName());
    }

}
