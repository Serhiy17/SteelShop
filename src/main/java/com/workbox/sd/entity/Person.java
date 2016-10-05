package com.workbox.sd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String surName;
    private String password;
    private String email;
    private double balanse;

    @OneToMany(mappedBy = "user")
    private List<Orders> orders;

    @ManyToMany
    @JoinTable(name = "person_address",
            joinColumns = @JoinColumn(name = "id_address"),
            inverseJoinColumns = @JoinColumn(name = "id_person"))
    private List<Address> addresses;

    public Person() {

    }

    public Person(String name, String surName, String email, String password, double balanse) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.balanse = balanse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalanse() {
        return balanse;
    }

    public void setBalanse(double balanse) {
        this.balanse = balanse;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", balanse=" + balanse +
                '}';
    }
}
