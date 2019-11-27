package com.example.daggerdemo.carparts;

import com.example.daggerdemo.Car;
import com.example.daggerdemo.MainActivity;
import com.example.daggerdemo.PerActivity;
import com.example.daggerdemo.carparts.engineparts.DieselEngineModule;
import com.example.daggerdemo.carparts.wheelparts.WheelModule;

import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelModule.class, DieselEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    /*@Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent appComponent);

        ActivityComponent build();
    }*/

}
