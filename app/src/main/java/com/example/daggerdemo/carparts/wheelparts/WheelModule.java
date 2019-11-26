package com.example.daggerdemo.carparts.wheelparts;

import com.example.daggerdemo.carparts.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels providesWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
