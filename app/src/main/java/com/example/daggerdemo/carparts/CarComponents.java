package com.example.daggerdemo.carparts;

import com.example.daggerdemo.Car;

import dagger.Component;

@Component
public interface CarComponents {
 Car getCar();
}
