package com.example.daggerdemo;

import android.widget.TextView;

import com.example.daggerdemo.carparts.Engine;
import com.example.daggerdemo.carparts.Remote;
import com.example.daggerdemo.carparts.Wheels;

import javax.inject.Inject;

public class Car {
    Engine engine;
    Wheels wheels;

    @Inject
    Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
    void startCar(TextView textView){
        textView.setText("Car is starting...");
    }
    void driveCar(TextView textView){
        textView.setText("Car is driving...");
    }

    @Inject public void enableRemote(Remote remote){
        remote.remoteOn(this);
    }
}


