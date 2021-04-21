package com.example.junitdemo.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class Address {
    String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
