package com.example.daggerdemo.carparts;

import android.util.Log;

import com.example.daggerdemo.Car;

import javax.inject.Inject;

public class Remote {
    @Inject
    public Remote() {

    }

    public void remoteOn(Car car) {
        Log.e("MSG", "Remote is on..");
    }
}
