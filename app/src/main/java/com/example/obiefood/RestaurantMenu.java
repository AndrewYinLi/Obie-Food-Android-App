package com.example.obiefood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RestaurantMenu extends AppCompatActivity {

    private double total = 0.0;
    private Button bulgogiIncrement;
    private Button bulgogiDecrement;
    private Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_menu);

        order = findViewById(R.id.order);

        bulgogiIncrement = findViewById(R.id.bulgogi_plus);
        bulgogiIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                TextView bulgogiCount = findViewById(R.id.bulgogiCount);
                int bulgogiCountInt = Integer.parseInt(bulgogiCount.getText().toString());
                bulgogiCount.setText(String.valueOf(bulgogiCountInt+1));
                bowlIncrement();
                setTotal();
            }
        });

        bulgogiDecrement = findViewById(R.id.bulgogi_minus);
        bulgogiDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                TextView bulgogiCount = findViewById(R.id.bulgogiCount);
                int bulgogiCountInt = Integer.parseInt(bulgogiCount.getText().toString());
                if(bulgogiCountInt > 0) {
                    bulgogiCount.setText(String.valueOf(bulgogiCountInt - 1));
                    bowlDecrement();
                    setTotal();
                }
            }
        });
    }


    private void bowlIncrement(){
        total += 5;
    }

    private void bowlDecrement(){
        total -= 5;
    }

    private void setTotal(){
        String totalStr = String.valueOf(total);
        totalStr += "0";
        order.setText("Place Order | " + totalStr);
    }
}
