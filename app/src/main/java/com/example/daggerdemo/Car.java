package com.example.daggerdemo;

import android.util.Log;
import android.widget.TextView;

import com.example.daggerdemo.carparts.Driver;
import com.example.daggerdemo.carparts.Engine;
import com.example.daggerdemo.carparts.Remote;
import com.example.daggerdemo.carparts.Wheels;

import javax.inject.Inject;
@PerActivity
public class Car {
    Engine engine;
    Wheels wheels;
    Driver driver;

    @Inject
    Car(Engine engine, Wheels wheels, Driver driver) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    void startCar() {
        Log.e("MSG","Car is stated");
    }

    void driveCar() {
        engine.start();
        Log.e("MSG", driver +" "+driver.getDriverName()+ "is driving " + this);
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.remoteOn(this);
    }
}


