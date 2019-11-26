package com.example.daggerdemo.carparts.engineparts;

import com.example.daggerdemo.carparts.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {
    @Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;
    }
}
