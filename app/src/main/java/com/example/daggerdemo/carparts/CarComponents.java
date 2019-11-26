package com.example.daggerdemo.carparts;

import com.example.daggerdemo.Car;
import com.example.daggerdemo.MainActivity;
import com.example.daggerdemo.carparts.wheelparts.WheelModule;

import dagger.Component;

@Component (modules = WheelModule.class)
public interface CarComponents {
    Car getCar();

    void inject(MainActivity mainActivity);

}
