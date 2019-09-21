package com.example.obiefood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class RestaurantMenu extends AppCompatActivity {

    double total = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_menu);
    }


    public void bowlIncrement(){
        total += 5;
    }

    public void bowlDecrement(){
        total -= 5;
    }
}
