package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Employee {

    public Employee( String name) {
        this.name = name;
    }

    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}