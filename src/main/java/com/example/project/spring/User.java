package com.example.project.spring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name="User")
public class User {
    @Id
    private int id_user;
    private String name;
    private int years;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "User_Course",
            joinColumns = { @JoinColumn(name = "id_user") },
            inverseJoinColumns = { @JoinColumn(name = "id_group") }
    )
    private List<Course> courses = new ArrayList<>();

    public User() {}

    public User(int id_user, String name, int years) {
        this.id_user = id_user;
        this.name = name;
        this.years = years;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }


    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
}

