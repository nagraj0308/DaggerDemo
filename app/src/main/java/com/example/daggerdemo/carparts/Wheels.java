package com.example.daggerdemo.carparts;

import com.example.daggerdemo.carparts.wheelparts.Rims;
import com.example.daggerdemo.carparts.wheelparts.Tires;

public class Wheels {
    Rims rims;
    Tires tires;
   public Wheels(Rims rims, Tires tires){
        this.rims=rims;
        this.tires=tires;
    }
}
