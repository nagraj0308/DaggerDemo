package com.example.daggerdemo.carparts.engineparts;

import android.util.Log;

import com.example.daggerdemo.carparts.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    @Inject public DieselEngine(){


    }
    @Override
    public void start() {
        Log.e("MSG","Diesel engine started...");
    }
}
