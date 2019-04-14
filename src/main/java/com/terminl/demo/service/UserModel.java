package com.terminl.demo.service;

import com.terminl.demo.iata.model.IataResponse;
import com.terminl.demo.iata.model.Response;

import java.util.List;

public class UserModel {

    int id;
    String name;
    List<Response> airports;

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

    public List<Response> getAirports() {
        return airports;
    }

    public void setAirports(List<Response> airports) {
        this.airports = airports;
    }
}
