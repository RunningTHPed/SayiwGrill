package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Promotion extends AppCompatActivity {

    public void openPromotion(View v) {
        setContentView(R.layout.promotion_page);
    }
    public void openOrder(View v) {
        setContentView(R.layout.order_page);
    }
    public void openCheckout(View v) {
        setContentView(R.layout.checkout_page);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.promotion_page);
    }
}
