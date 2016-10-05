package com.workbox.sd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ChanelAngle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    final String gost = "дярс 8240-89"; //standards

    private String name; //mark of profile
    private double weight; //weight kg by meter
    private double length; //length of one unite of profile
    private int entireWeight; //entire weight of profile in shop
    private double entierLength;
    private double price; //price of meter of material

    @ManyToMany
    @JoinTable(name = "order_chanel",
            joinColumns = @JoinColumn(name = "id_chanel"),
            inverseJoinColumns = @JoinColumn(name = "id_order"))
    private List<Orders> orders;

    ChanelAngle() {

    }

    public ChanelAngle(String name, double weight, double length, int entireWeight, double price){
        this.name = name;
        this.weight = weight;
        this.length = length;
        this.entireWeight = entireWeight;
        this.entierLength = (double)entireWeight/weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getEntireWeight() {
        return entireWeight;
    }

    public void setEntireWeight(int entireWeight) {
        this.entireWeight = entireWeight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getEntierLength() {
        return entierLength;
    }

    public void setEntierLength(double entierLength) {
        this.entierLength = entierLength;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "ChanelAngle{" +
                "price=" + price +
                ", id=" + id +
                ", gost='" + gost + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", entireWeight=" + entireWeight +
                ", entierLength=" + entierLength +
                '}';
    }
}
