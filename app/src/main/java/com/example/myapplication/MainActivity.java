package com.example.myapplication;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class   MainActivity extends AppCompatActivity {


    int number = 0;
    Dialog myDialog;

    public void popup() {

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("")
                .setMessage("คุณมา" + number + "คน?")
                .setPositiveButton("ใช่", null)
                .setNegativeButton("ไม่ใช่", null)
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // LANDSCAPE ONLY


        myDialog = new Dialog(this);


        Button Button1 = (Button) findViewById(R.id.btn1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = 1;
                ShowPopup();



            }
        });

        Button Button2 = (Button) findViewById(R.id.btn2);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = 2;
                ShowPopup();
            }
        });

        Button Button3 = (Button) findViewById(R.id.btn3);
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = 3;
                ShowPopup();
            }
        });

        Button Button4 = (Button) findViewById(R.id.btn4);
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = 4;
                ShowPopup();
            }
        });
    }


    public void ShowPopup() {
        TextView txtclose,btnFollow;
        myDialog.setContentView(R.layout.custompopup);
        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        TextView textVideoName = myDialog.findViewById(R.id.textVideoName);
        textVideoName.setText("คุณมา "+ number +" คนใช่หรือไม่");
        btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Menu.class);
                intent.putExtra("MyX", number);
                //startActivity(new Intent(MainActivity.this, Menu.class));
                startActivity(intent);
            }
        });
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }









}
