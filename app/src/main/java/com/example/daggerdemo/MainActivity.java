package com.example.daggerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.daggerdemo.carparts.ActivityComponent;
import com.example.daggerdemo.carparts.engineparts.DieselEngineModule;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    TextView tvStart,tvDrive;
    @Inject Car car1,car2;
    ActivityComponent activityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvStart=findViewById(R.id.tv_start);
        tvDrive=findViewById(R.id.tv_drive);

       activityComponent=((ExampleApp)getApplication()).getComponent().getActivityComponentBuilder().horsePower(100).engineCapacity(200).build();
       activityComponent.inject(this);

        tvStart.setText("Tv Start");
        tvDrive.setText("Tv Drive");
        car1.driveCar();
        car2.driveCar();


    }
}
