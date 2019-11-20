package com.example.myapplication;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Order extends AppCompatActivity {
    public void openPromotion(View v) {
        setContentView(R.layout.promotion_page);
    }
    public void openOrder(View v) {
        setContentView(R.layout.order_page);
    }
    public void openCheckout(View v) {
        setContentView(R.layout.checkout_page);
    }
}
