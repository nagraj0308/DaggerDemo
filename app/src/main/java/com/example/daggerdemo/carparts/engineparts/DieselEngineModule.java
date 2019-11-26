package com.example.daggerdemo.carparts.engineparts;

import com.example.daggerdemo.carparts.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
