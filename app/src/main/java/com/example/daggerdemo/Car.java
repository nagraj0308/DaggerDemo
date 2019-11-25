package com.example.daggerdemo;

import android.widget.TextView;

import com.example.daggerdemo.carparts.Engine;
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
    public void startCar(TextView textView){
        textView.setText("Car is starting...");
    }
    public void driveCar(TextView textView){
        textView.setText("Car is driving...");
    }


}
