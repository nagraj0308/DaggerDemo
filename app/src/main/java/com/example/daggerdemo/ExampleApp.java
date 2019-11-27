package com.example.daggerdemo;

import android.app.Application;

import com.example.daggerdemo.carparts.CarComponents;
import com.example.daggerdemo.carparts.DaggerCarComponents;

public class ExampleApp extends Application {
    private CarComponents carComponents;
    @Override
    public void onCreate() {
        super.onCreate();
        carComponents= DaggerCarComponents.builder()
                .horsePower(200)
                .engineCapacity(400).build();
    }

    public CarComponents getCarComponents() {
        return carComponents;
    }

    public void setCarComponents(CarComponents carComponents) {
        this.carComponents = carComponents;
    }
}
