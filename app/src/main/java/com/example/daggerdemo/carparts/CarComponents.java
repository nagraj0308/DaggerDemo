package com.example.daggerdemo.carparts;

import com.example.daggerdemo.Car;
import com.example.daggerdemo.MainActivity;

import dagger.Component;

@Component
public interface CarComponents {
 Car getCar();
 void inject(MainActivity mainActivity);
}
