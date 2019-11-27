package com.example.daggerdemo;

import com.example.daggerdemo.carparts.ActivityComponent;
import com.example.daggerdemo.carparts.driverparts.DriverModule;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory interface Factory{
        AppComponent create(DriverModule driverModule);
    }
}
