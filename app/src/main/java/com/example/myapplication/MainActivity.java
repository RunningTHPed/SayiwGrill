package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class   MainActivity extends AppCompatActivity {

    int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Button1 = (Button) findViewById(R.id.button1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Menu.class));
                number = 1;
                Intent intent = new Intent(MainActivity.this, Menu.class);
                intent.putExtra("MyX", number);
                startActivity(intent);
            }
        });

        Button Button2 = (Button) findViewById(R.id.button2);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Menu.class));
                number = 2;
                Intent intent = new Intent(MainActivity.this, Menu.class);
                intent.putExtra("MyX", number);
                startActivity(intent);
            }
        });

        Button Button3 = (Button) findViewById(R.id.button3);
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Menu.class));
                number = 3;
                Intent intent = new Intent(MainActivity.this, Menu.class);
                intent.putExtra("MyX", number);
                startActivity(intent);
            }
        });

        Button Button4 = (Button) findViewById(R.id.button4);
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Menu.class));
                number = 4;
                Intent intent = new Intent(MainActivity.this, Menu.class);
                intent.putExtra("MyX", number);
                startActivity(intent);
            }
        });
    }
}
