package com.example.d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Java
// эта строчка нам не нужна
        setContentView(R.layout.activity_main);
        Draw2D draw2D = new Draw2D(this);
        setContentView(draw2D);

    }
}