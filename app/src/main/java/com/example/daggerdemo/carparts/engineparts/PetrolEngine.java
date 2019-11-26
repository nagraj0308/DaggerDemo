package com.example.daggerdemo.carparts.engineparts;

import android.util.Log;

import com.example.daggerdemo.carparts.Engine;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private int horsePower;
    private int engineCapacity;
    @Inject public PetrolEngine(@Named("horse power") int horsePower,@Named("engine capacity") int engineCapacity){
        this.horsePower=horsePower;
        this.engineCapacity=engineCapacity;
    }
    @Override
    public void start() {
        Log.e("MSG","Petrol engine started..."+"\nHorsePower: "+horsePower+"\nEngineCapacity : "+engineCapacity);
    }
}
