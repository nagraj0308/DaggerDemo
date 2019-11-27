package com.example.daggerdemo.carparts.driverparts;

import com.example.daggerdemo.carparts.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {
    private String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Provides
    @Singleton
    Driver provideDriver(){
        return  new Driver(driverName);
    }
}
