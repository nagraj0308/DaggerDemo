package com.example.daggerdemo;

import com.example.daggerdemo.carparts.Driver;
import com.example.daggerdemo.carparts.driverparts.DriverModule;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
