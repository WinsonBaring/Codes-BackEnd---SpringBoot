package com.JeepCode.jeepcode.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jeep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String jeep;
    private int number;



    public Jeep() {
    }

    public Jeep(String jeep, int number) {
        this.jeep = jeep;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJeep() {
        return jeep;
    }

    public void setJeep(String jeep) {
        this.jeep = jeep;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
