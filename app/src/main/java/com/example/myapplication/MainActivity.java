package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class   MainActivity extends AppCompatActivity {

    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("fuck")
                .setMessage("Message")
                .setPositiveButton("ok",null)
                .setNegativeButton("cancel",null)
                .show();






        Button Button1 = (Button) findViewById(R.id.button1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,"Not closing",Toast.LENGTH_SHORT).show();

                    }
                });
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
