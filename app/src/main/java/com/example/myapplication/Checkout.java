package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
    }

    public void openOrder(View v){
        finish();
        Intent intent = new Intent(Checkout.this, Order.class);
        startActivity(intent);
    }
    public void openPromotion(View v){
        finish();
        Intent intent = new Intent(Checkout.this, Promotion.class);
        startActivity(intent);
    }
    public void openMenu(View v){
        finish();
        /*Intent intent = new Intent(Checkout.this, Menu.class);
        startActivity(intent);*/
    }
}
