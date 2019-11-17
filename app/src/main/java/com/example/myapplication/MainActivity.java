package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class   MainActivity extends AppCompatActivity {


    int number = 0;


    public void popup(){

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("")
                .setMessage("คุณมา"+number+"คน?")
                .setPositiveButton("ใช่",null)
                .setNegativeButton("ไม่ใช่",null)
                .show();

        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"Not closing",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Menu.class);
                intent.putExtra("MyX", number);
                //startActivity(new Intent(MainActivity.this, Menu.class));
                startActivity(intent);
            }
        });
    }

    private int[] mImages = new int[]{
            R.drawable.image_1,R.drawable.image_2
    };

    private String[] mImageTitle = new String[]{
            "Bear","Cat"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);









        Button Button1 = (Button) findViewById(R.id.button1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = 1;
                popup();

            }
        });

        Button Button2 = (Button) findViewById(R.id.button2);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = 2;
                popup();
            }
        });

        Button Button3 = (Button) findViewById(R.id.button3);
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = 3;
                popup();
            }
        });

        Button Button4 = (Button) findViewById(R.id.button4);
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = 4;
                popup();
            }
        });
    }
}
