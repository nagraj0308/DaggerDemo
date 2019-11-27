package com.example.daggerdemo;

import android.app.Application;

import com.example.daggerdemo.carparts.driverparts.DriverModule;


public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component =DaggerAppComponent.factory().create(new DriverModule("Prateek"));
    }

    public AppComponent getComponent() {
        return component;
    }

}
