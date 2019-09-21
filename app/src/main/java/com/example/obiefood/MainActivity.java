package com.example.obiefood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {

    private Button kimsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kimsButton = findViewById(R.id.kimsButton);
        kimsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        RestaurantMenu.class);
                startActivity(myIntent);
            }
        });
    }
}
