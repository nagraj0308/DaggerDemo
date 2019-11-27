package com.example.daggerdemo.carparts;

import com.example.daggerdemo.AppComponent;
import com.example.daggerdemo.Car;
import com.example.daggerdemo.MainActivity;
import com.example.daggerdemo.PerActivity;
import com.example.daggerdemo.carparts.engineparts.PetrolEngineModule;
import com.example.daggerdemo.carparts.wheelparts.WheelModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder

    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        ActivityComponent build();
    }

}
