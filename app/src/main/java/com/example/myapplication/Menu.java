package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class Menu extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;

    @Override
    public void onBackPressed() {
        if (backPressedTime + 0.01 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Don't Press Button", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Bundle bundle = getIntent().getExtras();
        int number = bundle.getInt("MyX");


       TextView text = (TextView)findViewById(R.id.textView3);
       text.setText("people :"+number);


<<<<<<< Updated upstream
=======
        Button Button2 = (Button) findViewById(R.id.button);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //finish();
                Intent i =new Intent(Menu.this,MainActivity.class);
                startActivity(i);
            }
        });




>>>>>>> Stashed changes
    }
}
