package com.example.studentinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student_info")

public class student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;
    public String name;
    public String address;
    public String phone;
    public String email;
    public String course;
    public String department;
    public String semester;
    public String section;
    public String roll;
    public String password;
}
