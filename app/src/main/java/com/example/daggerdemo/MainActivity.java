package com.example.daggerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.daggerdemo.carparts.ActivityComponent;
import com.example.daggerdemo.carparts.DaggerActivityComponent;

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

        activityComponent= DaggerActivityComponent.builder()
                .horsePower(200)
                .engineCapacity(400)
                .appComponent(((ExampleApp)getApplication()).getComponent())
                .build();
        activityComponent.inject(this);

        tvStart.setText("Tv Start");
        tvDrive.setText("Tv Drive");
        car1.driveCar();
        car2.driveCar();


    }
}
