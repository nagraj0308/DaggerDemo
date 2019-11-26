package com.example.daggerdemo.carparts.engineparts;

import android.util.Log;

import com.example.daggerdemo.carparts.Engine;

public class DieselEngine implements Engine {
    private int horsePower;
    public DieselEngine(int horsePower){
        this.horsePower=horsePower;
    }
    @Override
    public void start() {
        Log.e("MSG","Diesel engine started...HorsePower: "+horsePower);
    }
}
