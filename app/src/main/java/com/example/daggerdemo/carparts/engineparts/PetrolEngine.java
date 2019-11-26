package com.example.daggerdemo.carparts.engineparts;

import android.util.Log;

import com.example.daggerdemo.carparts.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    @Inject public PetrolEngine(){

    }
    @Override
    public void start() {
        Log.e("MSG","Petrol engine started...");
    }
}
