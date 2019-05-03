package com.vkthe1.gittestproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vkthe1.firstlib.Demo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Demo.useToToast(this);
    }
}
