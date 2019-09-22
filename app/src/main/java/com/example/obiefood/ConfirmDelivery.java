package com.example.obiefood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmDelivery extends AppCompatActivity {


    private Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_delivery);

        // Switch `Activity` to `RestaurantMenu`
//        confirmButton = findViewById(R.id.);
//        confirmButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                // Start NewActivity.class
//                Intent myIntent = new Intent(ConfirmDelivery.this,
//                        DeliveryMap.class);
//                startActivity(myIntent);
//            }
//        });
    }
}
