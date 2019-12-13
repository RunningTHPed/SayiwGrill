package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
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

    public void openBeef(View v) {
        ImageView imageViewpic1=(ImageView)findViewById(R.id.pic1);
        ImageView imageViewpic2=(ImageView)findViewById(R.id.pic2);
        ImageView imageViewpic3=(ImageView)findViewById(R.id.pic3);
        ImageView imageViewpic4=(ImageView)findViewById(R.id.pic4);
        TextView textViewfood1 = (TextView)findViewById(R.id.food_name1);
        TextView textViewprice1 = (TextView)findViewById(R.id.price1);
        TextView textViewfood2 = (TextView)findViewById(R.id.food_name2);
        TextView textViewprice2 = (TextView)findViewById(R.id.price2);
        TextView textViewfood3 = (TextView)findViewById(R.id.food_name3);
        TextView textViewprice3 = (TextView)findViewById(R.id.price3);
        TextView textViewfood4 = (TextView)findViewById(R.id.food_name4);
        TextView textViewprice4 = (TextView)findViewById(R.id.price4);
        textViewfood1.setText("Brisket");
        textViewfood2.setText("Rib eye");
        textViewfood3.setText("Chuck eye");
        textViewfood4.setText("Wagyu");
        textViewprice1.setText("69 BATH");
        textViewprice2.setText("69 BATH");
        textViewprice3.setText("69 BATH");
        textViewprice4.setText("199 BATH");
        imageViewpic1.setImageResource(R.drawable.brisket);
        imageViewpic2.setImageResource(R.drawable.ribeye);
        imageViewpic3.setImageResource(R.drawable.shuckeye);
        imageViewpic4.setImageResource(R.drawable.vagil);



    }
    public void openPork(View v) {
        ImageView imageViewpic1=(ImageView)findViewById(R.id.pic1);
        ImageView imageViewpic2=(ImageView)findViewById(R.id.pic2);
        ImageView imageViewpic3=(ImageView)findViewById(R.id.pic3);
        ImageView imageViewpic4=(ImageView)findViewById(R.id.pic4);
        TextView textViewfood1 = (TextView)findViewById(R.id.food_name1);
        TextView textViewprice1 = (TextView)findViewById(R.id.price1);
        TextView textViewfood2 = (TextView)findViewById(R.id.food_name2);
        TextView textViewprice2 = (TextView)findViewById(R.id.price2);
        TextView textViewfood3 = (TextView)findViewById(R.id.food_name3);
        TextView textViewprice3 = (TextView)findViewById(R.id.price3);
        TextView textViewfood4 = (TextView)findViewById(R.id.food_name4);
        TextView textViewprice4 = (TextView)findViewById(R.id.price4);
        textViewfood1.setText("Beacon");
        textViewfood2.setText("Pork Neck");
        textViewfood3.setText("Sirloin");
        textViewfood4.setText("Tenderloin");
        textViewprice1.setText("20 BATH");
        textViewprice2.setText("30 BATH");
        textViewprice3.setText("30 BATH");
        textViewprice4.setText("30 BATH");
        imageViewpic1.setImageResource(R.drawable.becon);
        imageViewpic2.setImageResource(R.drawable.sunneck);
        imageViewpic3.setImageResource(R.drawable.sunout);
        imageViewpic4.setImageResource(R.drawable.sunin);
    }
    public void openChicken(View v) {
        ImageView imageViewpic1=(ImageView)findViewById(R.id.pic1);
        ImageView imageViewpic2=(ImageView)findViewById(R.id.pic2);
        ImageView imageViewpic3=(ImageView)findViewById(R.id.pic3);
        ImageView imageViewpic4=(ImageView)findViewById(R.id.pic4);
        TextView textViewfood1 = (TextView)findViewById(R.id.food_name1);
        TextView textViewprice1 = (TextView)findViewById(R.id.price1);
        TextView textViewfood2 = (TextView)findViewById(R.id.food_name2);
        TextView textViewprice2 = (TextView)findViewById(R.id.price2);
        TextView textViewfood3 = (TextView)findViewById(R.id.food_name3);
        TextView textViewprice3 = (TextView)findViewById(R.id.price3);
        TextView textViewfood4 = (TextView)findViewById(R.id.food_name4);
        TextView textViewprice4 = (TextView)findViewById(R.id.price4);
        textViewfood1.setText("ฺBreast");
        textViewfood2.setText("Nugget");
        textViewfood3.setText("Pepper Chiken");
        textViewfood4.setText("Fired Chiken");
        textViewprice1.setText("20 BATH");
        textViewprice2.setText("20 BATH");
        textViewprice3.setText("20 BATH");
        textViewprice4.setText("20 BATH");
        imageViewpic1.setImageResource(R.drawable.breast);
        imageViewpic2.setImageResource(R.drawable.nugget);
        imageViewpic3.setImageResource(R.drawable.blackpepper);
        imageViewpic4.setImageResource(R.drawable.kaitod);
    }
    public void openSeafood(View v) {
        ImageView imageViewpic1=(ImageView)findViewById(R.id.pic1);
        ImageView imageViewpic2=(ImageView)findViewById(R.id.pic2);
        ImageView imageViewpic3=(ImageView)findViewById(R.id.pic3);
        TextView textViewfood1 = (TextView)findViewById(R.id.food_name1);
        TextView textViewprice1 = (TextView)findViewById(R.id.price1);
        TextView textViewfood2 = (TextView)findViewById(R.id.food_name2);
        TextView textViewprice2 = (TextView)findViewById(R.id.price2);
        TextView textViewfood3 = (TextView)findViewById(R.id.food_name3);
        TextView textViewprice3 = (TextView)findViewById(R.id.price3);
        TextView textViewfood4 = (TextView)findViewById(R.id.food_name4);
        TextView textViewprice4 = (TextView)findViewById(R.id.price4);
        textViewfood1.setText("Squid");
        textViewfood2.setText("Dolly fish");
        textViewfood3.setText("Shrimp");
        textViewfood4.setText("Scallops");
        textViewprice1.setText("30 BATH");
        textViewprice2.setText("30 BATH");
        textViewprice3.setText("30 BATH");
        textViewprice4.setText("30 BATH");

    }
    public void openBeverage(View v) {
        ImageView imageViewpic1=(ImageView)findViewById(R.id.pic1);
        ImageView imageViewpic2=(ImageView)findViewById(R.id.pic2);
        ImageView imageViewpic3=(ImageView)findViewById(R.id.pic3);
        TextView textViewfood1 = (TextView)findViewById(R.id.food_name1);
        TextView textViewprice1 = (TextView)findViewById(R.id.price1);
        TextView textViewfood2 = (TextView)findViewById(R.id.food_name2);
        TextView textViewprice2 = (TextView)findViewById(R.id.price2);
        TextView textViewfood3 = (TextView)findViewById(R.id.food_name3);
        TextView textViewprice3 = (TextView)findViewById(R.id.price3);
        TextView textViewfood4 = (TextView)findViewById(R.id.food_name4);
        TextView textViewprice4 = (TextView)findViewById(R.id.price4);
        textViewfood1.setText("Plain water");
        textViewfood2.setText("Beer");
        textViewfood3.setText("Coke");
        textViewfood4.setText("Ice");
        textViewprice1.setText("10 BATH");
        textViewprice2.setText("50 BATH");
        textViewprice3.setText("20 BATH");
        textViewprice4.setText("10 BATH");
    }
    public void openVegetable(View v) {
        ImageView imageViewpic1=(ImageView)findViewById(R.id.pic1);
        ImageView imageViewpic2=(ImageView)findViewById(R.id.pic2);
        ImageView imageViewpic3=(ImageView)findViewById(R.id.pic3);
        TextView textViewfood1 = (TextView)findViewById(R.id.food_name1);
        TextView textViewprice1 = (TextView)findViewById(R.id.price1);
        TextView textViewfood2 = (TextView)findViewById(R.id.food_name2);
        TextView textViewprice2 = (TextView)findViewById(R.id.price2);
        TextView textViewfood3 = (TextView)findViewById(R.id.food_name3);
        TextView textViewprice3 = (TextView)findViewById(R.id.price3);
        TextView textViewfood4 = (TextView)findViewById(R.id.food_name4);
        TextView textViewprice4 = (TextView)findViewById(R.id.price4);
        textViewfood1.setText("Eringii ");
        textViewfood2.setText("Onion");
        textViewfood3.setText("Asparagus");
        textViewfood4.setText("Baby Corn");
        textViewprice1.setText("10 BATH");
        textViewprice2.setText("20 BATH");
        textViewprice3.setText("10 BATH");
        textViewprice4.setText("10 BATH");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) //Ad on top
     {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
         this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // LANDSCAPE ONLY

            /*CarouselView carouselView = findViewById(R.id.carousel);
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
            });*/

        Bundle bundle = getIntent().getExtras();
        int number = bundle.getInt("MyX");




        //init();
        //update();

    }

    public void update(){
        items = mySQLConnect.getData();
        dataView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
    }

    public void init(){
        //addBox = (EditText)findViewById(R.id.addBox);
        //addButt = (Button)findViewById(R.id.addButt);
        //dataView = (ListView)findViewById(R.id.dataView);
        mySQLConnect = new MySQLConnect(Menu.this);
    }
}
