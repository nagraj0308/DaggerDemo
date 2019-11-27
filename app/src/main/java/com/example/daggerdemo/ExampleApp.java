package com.example.daggerdemo;

import android.app.Application;

import com.example.daggerdemo.carparts.ActivityComponent;
import com.example.daggerdemo.carparts.DaggerActivityComponent;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public AppComponent getComponent() {
        return component;
    }

}
