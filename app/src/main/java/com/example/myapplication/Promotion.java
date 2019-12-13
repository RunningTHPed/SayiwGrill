package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.PeriodicSync;
import android.os.Bundle;
import android.view.View;

public class Promotion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion);
    }

    public void openOrder(View v){
        finish();
        Intent intent = new Intent(Promotion.this, Order.class);
        startActivity(intent);
    }
    public void openMenu(View v){
        finish();
        /*Intent intent = new Intent(Promotion.this, Menu.class);
        startActivity(intent);*/
    }
    public void openCheckout(View v){
        finish();
        Intent intent = new Intent(Promotion.this, Checkout.class);
        startActivity(intent);
    }
}
