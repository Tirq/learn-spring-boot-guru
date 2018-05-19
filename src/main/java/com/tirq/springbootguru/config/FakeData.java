package com.tirq.springbootguru.config;

public class FakeData {

    private String user;
    private String city;

    public FakeData() {
    }

    public FakeData(String user, String city) {
        this.user = user;
        this.city = city;
    }

    public String getUser() {
        return user;
    }

    public String getCity() {
        return city;
    }
}
