package com.rocky.modular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rocky.arouter_annotation.ARouter;
import com.rocky.arouter_annotation.Parameter;
import com.rocky.arouter_api.ParameterManager;


@ARouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Parameter
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ParameterManager.getInstance().loadParameter(this);


    }
}