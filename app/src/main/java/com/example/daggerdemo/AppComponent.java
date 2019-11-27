package com.example.daggerdemo;

import com.example.daggerdemo.carparts.ActivityComponent;
import com.example.daggerdemo.carparts.driverparts.DriverModule;
import com.example.daggerdemo.carparts.engineparts.DieselEngineModule;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
}
