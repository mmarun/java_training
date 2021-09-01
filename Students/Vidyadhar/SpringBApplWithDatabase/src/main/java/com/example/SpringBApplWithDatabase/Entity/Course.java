package com.example.SpringBApplWithDatabase.Entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Course {

    @Id
    private Long courseId;

    private String title;
    private String description;

}
