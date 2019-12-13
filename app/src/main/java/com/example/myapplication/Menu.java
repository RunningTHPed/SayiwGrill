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
    int location1 = 0,location2 = 0,location3 = 0,location4 = 0 ;
    int page;
    int brisket,ribeye,chuckeye,wagyu;
    int beacon,porkneck,sirlon,tenderloin;
    int breast,nugget,pepperchiken,firedchiken;
    int squid,dollydish,shrimp,scallops;
    int water,beer,coke,ice;
    int mushroom,onion,asparagus,babycorn;



    private int[] mImages = new int[]{
            R.drawable.image_1,R.drawable.image_2
    };

    private String[] mImageTitle = new String[]{
            "Bear","Cat"
    };



    public void ADDorder(View v){
        switch (page) {
            case 1 :
                brisket = location1;
                ribeye = location2;
                chuckeye = location3;
                wagyu = location4;
                break;

            case 2 :
                beacon = location1;
                porkneck = location2;
                sirlon = location3;
                tenderloin = location4;
                break;
            case 3 :
                breast = location1;
                nugget = location2;
                pepperchiken = location3;
                firedchiken = location4;
                break;
            case 4 :
                squid = location1;
                dollydish = location2;
                shrimp = location3;
                scallops = location4;
                break;
            case 5 :
                water = location1;
                beer = location2;
                coke = location3;
                ice = location4;
                break;
            case 6 :
                mushroom = location1;
                onion = location2;
                asparagus = location3;
                babycorn = location4;
                break;



        }
        location1 = location2 = location3 = location4 = 0;


    }

    public void openBeef(View v) {
        page = 1;
        location1 = location2 = location3 = location4 = 0;
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
    public void ominus1 (View v) {
        TextView textViewnum1 = (TextView)findViewById(R.id.num1);
        if(location1 != 0)
            location1 = location1 - 1;
        textViewnum1.setText(""+location1);


    }

    public void oplus1(View v){
        location1 = location1 + 1;
        TextView textView = (TextView)findViewById(R.id.num1);
        textView.setText(""+location1);


    }
    public void ominus2 (View v) {
        TextView textViewnum1 = (TextView)findViewById(R.id.num2);
        if(location2 != 0)
            location2 = location2 - 1;
        textViewnum1.setText(""+location2);

    }
    public void oplus2(View v){
        location2 = location2 + 1;
        TextView textView = (TextView)findViewById(R.id.num2);
        textView.setText(""+location2);
    }
    public void ominus3 (View v) {
        TextView textViewnum1 = (TextView)findViewById(R.id.num3);
        if(location3 != 0)
            location3 = location3 - 1;
        textViewnum1.setText(""+location3);

    }
    public void oplus3(View v){
        location3 = location3 + 1;
        TextView textView = (TextView)findViewById(R.id.num3);
        textView.setText(""+location3);
    }
    public void ominus4 (View v) {
        TextView textViewnum1 = (TextView)findViewById(R.id.num4);
        if(location4 != 0)
            location4 = location4 - 1;
        textViewnum1.setText(""+location4);

    }
    public void oplus4 (View v){
        location4 = location4 + 1;
        TextView textView = (TextView)findViewById(R.id.num4);
        textView.setText(""+location4);
    }

    public void openPork(View v) {
        page = 2;
        location1 = location2 = location3 = location4 = 0;
        TextView textView1 = (TextView)findViewById(R.id.num1);
        TextView textView2 = (TextView)findViewById(R.id.num2);
        TextView textView3 = (TextView)findViewById(R.id.num3);
        TextView textView4 = (TextView)findViewById(R.id.num4);
        textView1.setText(""+location1);
        textView2.setText(""+location2);
        textView3.setText(""+location3);
        textView4.setText(""+location4);
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
        page = 3;
        location1 = location2 = location3 = location4 = 0;
        TextView textView1 = (TextView)findViewById(R.id.num1);
        TextView textView2 = (TextView)findViewById(R.id.num2);
        TextView textView3 = (TextView)findViewById(R.id.num3);
        TextView textView4 = (TextView)findViewById(R.id.num4);
        textView1.setText(""+location1);
        textView2.setText(""+location2);
        textView3.setText(""+location3);
        textView4.setText(""+location4);
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
        page = 4;
        location1 = location2 = location3 = location4 = 0;
        TextView textView1 = (TextView)findViewById(R.id.num1);
        TextView textView2 = (TextView)findViewById(R.id.num2);
        TextView textView3 = (TextView)findViewById(R.id.num3);
        TextView textView4 = (TextView)findViewById(R.id.num4);
        textView1.setText(""+location1);
        textView2.setText(""+location2);
        textView3.setText(""+location3);
        textView4.setText(""+location4);
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
        imageViewpic1.setImageResource(R.drawable.squid);
        imageViewpic2.setImageResource(R.drawable.dolly);
        imageViewpic3.setImageResource(R.drawable.shrimp);
        imageViewpic4.setImageResource(R.drawable.scallobs);
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
        page = 5;
        location1 = location2 = location3 = location4 = 0;
        TextView textView1 = (TextView)findViewById(R.id.num1);
        TextView textView2 = (TextView)findViewById(R.id.num2);
        TextView textView3 = (TextView)findViewById(R.id.num3);
        TextView textView4 = (TextView)findViewById(R.id.num4);
        textView1.setText(""+location1);
        textView2.setText(""+location2);
        textView3.setText(""+location3);
        textView4.setText(""+location4);
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
        imageViewpic1.setImageResource(R.drawable.water);
        imageViewpic2.setImageResource(R.drawable.beer);
        imageViewpic3.setImageResource(R.drawable.coke);
        imageViewpic4.setImageResource(R.drawable.ice);
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
        page = 6;
        location1 = location2 = location3 = location4 = 0;
        TextView textView1 = (TextView)findViewById(R.id.num1);
        TextView textView2 = (TextView)findViewById(R.id.num2);
        TextView textView3 = (TextView)findViewById(R.id.num3);
        TextView textView4 = (TextView)findViewById(R.id.num4);
        textView1.setText(""+location1);
        textView2.setText(""+location2);
        textView3.setText(""+location3);
        textView4.setText(""+location4);
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
        imageViewpic1.setImageResource(R.drawable.mushroom);
        imageViewpic2.setImageResource(R.drawable.onion);
        imageViewpic3.setImageResource(R.drawable.aspalagas);
        imageViewpic4.setImageResource(R.drawable.babycorn);
        textViewfood1.setText("Enokitake");
        textViewfood2.setText("Onion");
        textViewfood3.setText("Asparagus");
        textViewfood4.setText("Baby Corn");
        textViewprice1.setText("10 BATH");
        textViewprice2.setText("20 BATH");
        textViewprice3.setText("10 BATH");
        textViewprice4.setText("10 BATH");
    }

    public void openOrder(View v){
        Intent intent = new Intent(Menu.this, Order.class);
        startActivity(intent);
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
