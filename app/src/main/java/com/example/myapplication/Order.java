package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


    }

    public void openMenu(View v){

        /*Intent intent1 = new Intent(this, Menu.class);
        startActivity(intent1);*/
        finish();
    }
    public void openPromotion(View v){
        finish();
        Intent intent = new Intent(Order.this, Promotion.class);
        startActivity(intent);
    }
    public void openCheckout(View v){
        finish();
        Intent intent = new Intent(Order.this, Checkout.class);
        startActivity(intent);
    }
}
