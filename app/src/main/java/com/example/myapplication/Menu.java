package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

import java.util.List;


public class Menu extends AppCompatActivity {

    private EditText addBox;
    private Button addButt;
    private ListView dataView;
    private MySQLConnect mySQLConnect;
    private List<String>items;

    private int[] mImages = new int[]{
            R.drawable.image_1,R.drawable.image_2
    };

    private String[] mImageTitle = new String[]{
            "Bear","Cat"
    };

    public void scrollToTop(View v) { //if click botton
        Toast.makeText(this, "Show some text on the screen.", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) //Ad on top
     {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

            CarouselView carouselView = findViewById(R.id.carousel);
            carouselView.setPageCount(mImages.length);
            carouselView.setImageListener(new ImageListener(){
                @Override
                public void setImageForPosition(int position, ImageView imageView){
                    imageView.setImageResource(mImages[position]);
                }
            });
            carouselView.setImageClickListener(new ImageClickListener() {
                @Override
                public void onClick(int position) {
                    Toast.makeText(Menu.this, mImageTitle[position], Toast.LENGTH_SHORT).show();
                }
            });

        Bundle bundle = getIntent().getExtras();
        int number = bundle.getInt("MyX");




        init();
        update();

    }

    public void update(){
        items = mySQLConnect.getData();
        dataView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
    }

    public void init(){
        addBox = (EditText)findViewById(R.id.addBox);
        addButt = (Button)findViewById(R.id.addButt);
        dataView = (ListView)findViewById(R.id.dataView);
        mySQLConnect = new MySQLConnect(Menu.this);
    }
}
