package com.example.daggerdemo.carparts.driverparts;

import com.example.daggerdemo.carparts.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {
    @Provides
    @Singleton
    static Driver provideDriver(){
        return  new Driver();
    }
}
