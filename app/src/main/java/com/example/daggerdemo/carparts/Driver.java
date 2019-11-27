package com.example.daggerdemo.carparts;

//we dont own this class so we don't annotate
public class Driver {
    private String driverName;
    public Driver(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }
}
