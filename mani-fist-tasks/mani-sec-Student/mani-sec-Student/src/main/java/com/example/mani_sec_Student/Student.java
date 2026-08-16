package com.example.mani_sec_Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double toltal;

    public Student() {
    }

    public Student(Integer id, String name, double toltal) {
        this.id = id;
        this.name = name;
        this.toltal = toltal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getToltal() {
        return toltal;
    }

    public void setToltal(double toltal) {
        this.toltal = toltal;
    }
}
