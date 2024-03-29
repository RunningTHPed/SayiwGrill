package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
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
    private Button addButt,addOrder;
    //private ListView dataView;
    private MySQLConnect mySQLConnect;
    private List<String>items;
    private ArrayAdapter<String> adt;

    Dialog myDialog;
    int location1 = 0,location2 = 0,location3 = 0,location4 = 0 ;
    int price = 0;
    int page=1;
    int brisket= 0,ribeye=0,chuckeye=0,wagyu=0;
    int beacon=0,porkneck=0,sirlon=0,tenderloin=0;
    int breast=0,nugget=0,pepperchiken=0,firedchiken=0;
    int squid=0,dollyfish=0,shrimp=0,scallops=0;
    int water=0,beer=0,coke=0,ice=0;
    int mushroom=0,onion=0,asparagus=0,babycorn=0;
    int brisket1= 0,ribeye1=0,chuckeye1=0,wagyu1=0;
    int beacon1=0,porkneck1=0,sirlon1=0,tenderloin1=0;
    int breast1=0,nugget1=0,pepperchiken1=0,firedchiken1=0;
    int squid1=0,dollyfish1=0,shrimp1=0,scallops1=0;
    int water1=0,beer1=0,coke1=0,ice1=0;
    int mushroom1=0,onion1=0,asparagus1=0,babycorn1=0;
    int activity = 1;
    int people;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;


    public void update(){
        //items = mySQLConnect.getData();
        adt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        //dataView.setAdapter(adt);
    }

    public void init(){
        //addBox = (EditText)findViewById(R.id.addBox);
        //addButt = (Button)findViewById(R.id.addButt);
        //dataView = (ListView)findViewById(R.id.dataView);
        addOrder = (Button)findViewById(R.id.addOrder);
        mySQLConnect = new MySQLConnect(Menu.this);
    }





    public void ADDorder(View v){
        ShowPopup();




    }
    public void ShowPopup() { //แสดง popup ถาม
        TextView txtclose,btnFollow;
        myDialog.setContentView(R.layout.custompopup);
        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        TextView textVideoName = myDialog.findViewById(R.id.textVideoName);
        textVideoName.setTextSize(32);
        textVideoName.setText("Comfirm Your Order?");
        btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);
        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (page) {
                    case 1 :
                        brisket += location1;
                        ribeye += location2 ;
                        chuckeye += location3  ;
                        wagyu += location4  ;
                        if(location1!=0){
                            mySQLConnect.sentData("Brisket",location1,people);
                        }
                        if(location2!=0){
                            mySQLConnect.sentData("Ribeye",location2,people);
                        }
                        if(location3!=0){
                            mySQLConnect.sentData("Chuckeye",location3,people);
                        }
                        if(location4!=0){
                            mySQLConnect.sentData("Wagyu",location4,people);
                        }
                        location1 = location2 = location3 = location4 = 0;
                        break;
                    case 2 :
                        beacon += location1;
                        porkneck += location2;
                        sirlon += location3;
                        tenderloin += location4;
                        if(location1!=0){
                            mySQLConnect.sentData("Beacon",location1,people);
                        }
                        if(location2!=0){
                            mySQLConnect.sentData("Pork neck",location2,people);
                        }
                        if(location3!=0){
                            mySQLConnect.sentData("Sirloin",location3,people);
                        }
                        if(location4!=0){
                            mySQLConnect.sentData("Tenderloin",location4,people);
                        }
                        location1 = location2 = location3 = location4 = 0;
                        break;
                    case 3 :
                        breast += location1;
                        nugget += location2;
                        pepperchiken += location3;
                        firedchiken += location4;
                        if(location1!=0){
                            mySQLConnect.sentData("Breast",location1,people);
                        }
                        if(location2!=0){
                            mySQLConnect.sentData("Nugget",location2,people);
                        }
                        if(location3!=0){
                            mySQLConnect.sentData("Pepper chicken",location3,people);
                        }
                        if(location4!=0){
                            mySQLConnect.sentData("Fried chicken",location4,people);
                        }
                        location1 = location2 = location3 = location4 = 0;
                        break;
                    case 4 :
                        squid += location1;
                        dollyfish += location2;
                        shrimp += location3;
                        scallops += location4;
                        if(location1!=0){
                            mySQLConnect.sentData("Squid",location1,people);
                        }
                        if(location2!=0){
                            mySQLConnect.sentData("Dolly fish",location2,people);
                        }
                        if(location3!=0){
                            mySQLConnect.sentData("Shrimp",location3,people);
                        }
                        if(location4!=0){
                            mySQLConnect.sentData("Scallops",location4,people);
                        }
                        location1 = location2 = location3 = location4 = 0;
                        break;
                    case 5 :
                        water += location1;
                        beer += location2;
                        coke += location3;
                        ice += location4;
                        if(location1!=0){
                            mySQLConnect.sentData("Plain water",location1,people);
                        }
                        if(location2!=0){
                            mySQLConnect.sentData("Beer",location2,people);
                        }
                        if(location3!=0){
                            mySQLConnect.sentData("Coke",location3,people);
                        }
                        if(location4!=0){
                            mySQLConnect.sentData("Ice",location4,people);
                        }
                        location1 = location2 = location3 = location4 = 0;
                        break;
                    case 6 :
                        mushroom += location1;
                        onion += location2;
                        asparagus += location3;
                        babycorn += location4;
                        if(location1!=0){
                            mySQLConnect.sentData("Enokitake",location1,people);
                        }
                        if(location2!=0){
                            mySQLConnect.sentData("Onion",location2,people);
                        }
                        if(location3!=0){
                            mySQLConnect.sentData("Asparagus",location3,people);
                        }
                        if(location4!=0){
                            mySQLConnect.sentData("Baby corn",location4,people);
                        }
                        location1 = location2 = location3 = location4 = 0;
                        break;
                }
                price = brisket*69 + ribeye*69 + chuckeye*69 + wagyu*199 +
                        beacon*20 + porkneck*30 + sirlon*30 + tenderloin*30+
                        breast*20 + nugget*20 + pepperchiken*20 + firedchiken*20+
                        squid*30+dollyfish*30+shrimp*30+scallops*30+
                        water*10+beer*50+coke*20+ice*20+
                        mushroom*10+onion*20+asparagus*10+beacon*10;

                //Intent intent = new Intent(Menu.this, Menu.class);
                //intent.putExtra("page", page);
                //mySQLConnect.sentData("breast");
                //items.add("KUY");
                adt.notifyDataSetChanged();
                //System.out.println(items);


                textView1 = (TextView)findViewById(R.id.num1);
                textView2 = (TextView)findViewById(R.id.num2);
                textView3 = (TextView)findViewById(R.id.num3);
                textView4 = (TextView)findViewById(R.id.num4);
                textView1.setText(""+location1);
                textView2.setText(""+location2);
                textView3.setText(""+location3);
                textView4.setText(""+location4);
                myDialog.dismiss();

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

    public void openBeef(View v) {
        page = 1;
        location1 = location2 = location3 = location4 = 0;
        ImageButton btnbeef = (ImageButton) findViewById(R.id.imgbutton1);
        ImageButton btnpork = (ImageButton) findViewById(R.id.imgbutton2);
        ImageButton btnchiken = (ImageButton) findViewById(R.id.imgbutton3);
        ImageButton btnseafood = (ImageButton) findViewById(R.id.imgbutton4);
        ImageButton btndrink = (ImageButton) findViewById(R.id.imgbutton5);
        ImageButton btnveget = (ImageButton) findViewById(R.id.imgbutton6);

        btnbeef.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign2));
        btnpork.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnchiken.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnseafood.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btndrink.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnveget.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));





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
        ImageButton btnbeef = (ImageButton) findViewById(R.id.imgbutton1);
        ImageButton btnpork = (ImageButton) findViewById(R.id.imgbutton2);
        ImageButton btnchiken = (ImageButton) findViewById(R.id.imgbutton3);
        ImageButton btnseafood = (ImageButton) findViewById(R.id.imgbutton4);
        ImageButton btndrink = (ImageButton) findViewById(R.id.imgbutton5);
        ImageButton btnveget = (ImageButton) findViewById(R.id.imgbutton6);

        btnbeef.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnpork.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign2));
        btnchiken.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnseafood.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btndrink.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnveget.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
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
        ImageButton btnbeef = (ImageButton) findViewById(R.id.imgbutton1);
        ImageButton btnpork = (ImageButton) findViewById(R.id.imgbutton2);
        ImageButton btnchiken = (ImageButton) findViewById(R.id.imgbutton3);
        ImageButton btnseafood = (ImageButton) findViewById(R.id.imgbutton4);
        ImageButton btndrink = (ImageButton) findViewById(R.id.imgbutton5);
        ImageButton btnveget = (ImageButton) findViewById(R.id.imgbutton6);

        btnbeef.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnpork.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnchiken.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign2));
        btnseafood.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btndrink.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnveget.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
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
        ImageButton btnbeef = (ImageButton) findViewById(R.id.imgbutton1);
        ImageButton btnpork = (ImageButton) findViewById(R.id.imgbutton2);
        ImageButton btnchiken = (ImageButton) findViewById(R.id.imgbutton3);
        ImageButton btnseafood = (ImageButton) findViewById(R.id.imgbutton4);
        ImageButton btndrink = (ImageButton) findViewById(R.id.imgbutton5);
        ImageButton btnveget = (ImageButton) findViewById(R.id.imgbutton6);

        btnbeef.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnpork.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnchiken.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnseafood.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign2));
        btndrink.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnveget.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
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
        ImageButton btnbeef = (ImageButton) findViewById(R.id.imgbutton1);
        ImageButton btnpork = (ImageButton) findViewById(R.id.imgbutton2);
        ImageButton btnchiken = (ImageButton) findViewById(R.id.imgbutton3);
        ImageButton btnseafood = (ImageButton) findViewById(R.id.imgbutton4);
        ImageButton btndrink = (ImageButton) findViewById(R.id.imgbutton5);
        ImageButton btnveget = (ImageButton) findViewById(R.id.imgbutton6);

        btnbeef.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnpork.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnchiken.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnseafood.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btndrink.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign2));
        btnveget.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));

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
        ImageButton btnbeef = (ImageButton) findViewById(R.id.imgbutton1);
        ImageButton btnpork = (ImageButton) findViewById(R.id.imgbutton2);
        ImageButton btnchiken = (ImageButton) findViewById(R.id.imgbutton3);
        ImageButton btnseafood = (ImageButton) findViewById(R.id.imgbutton4);
        ImageButton btndrink = (ImageButton) findViewById(R.id.imgbutton5);
        ImageButton btnveget = (ImageButton) findViewById(R.id.imgbutton6);

        btnbeef.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnpork.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnchiken.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnseafood.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btndrink.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign));
        btnveget.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttondesign2));
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
        //finish();




        Intent intent = new Intent(Menu.this, Order.class);
        intent.putExtra("price", price);
        intent.putExtra("activity", activity);
        intent.putExtra("page", page);
        intent.putExtra("brisket", brisket);
        intent.putExtra("ribeye", ribeye);
        intent.putExtra("chuckeye", chuckeye);
        intent.putExtra("wagyu", wagyu);
        intent.putExtra("beacon", beacon);
        intent.putExtra("porkneck", porkneck);
        intent.putExtra("sirlon", sirlon);
        intent.putExtra("tenderloin", tenderloin);
        intent.putExtra("breast", breast);
        intent.putExtra("nugget", nugget);
        intent.putExtra("pepperchiken", pepperchiken);
        intent.putExtra("firedchiken", firedchiken);
        intent.putExtra("squid", squid);
        intent.putExtra("dollyfish", dollyfish);
        intent.putExtra("shrimp", shrimp);
        intent.putExtra("scallops", scallops);
        intent.putExtra("water", water);
        intent.putExtra("beer", beer);
        intent.putExtra("coke", coke);
        intent.putExtra("ice", ice);
        intent.putExtra("mushroom", mushroom);
        intent.putExtra("onion", onion);
        intent.putExtra("asparagus", asparagus);
        intent.putExtra("babycorn", babycorn);

        startActivity(intent);



        overridePendingTransition(0,0);

    }
    public void openMenu(View v){


        overridePendingTransition(0,0);
    }
    public void openPromotion(View v){
        //finish();

        Intent intent = new Intent(Menu.this, Promotion.class);
        intent.putExtra("price", price);
        intent.putExtra("activity", activity);
        intent.putExtra("page", page);
        intent.putExtra("brisket", brisket);
        intent.putExtra("ribeye", ribeye);
        intent.putExtra("chuckeye", chuckeye);
        intent.putExtra("wagyu", wagyu);
        intent.putExtra("beacon", beacon);
        intent.putExtra("porkneck", porkneck);
        intent.putExtra("sirlon", sirlon);
        intent.putExtra("tenderloin", tenderloin);
        intent.putExtra("breast", breast);
        intent.putExtra("nugget", nugget);
        intent.putExtra("pepperchiken", pepperchiken);
        intent.putExtra("firedchiken", firedchiken);
        intent.putExtra("squid", squid);
        intent.putExtra("dollyfish", dollyfish);
        intent.putExtra("shrimp", shrimp);
        intent.putExtra("scallops", scallops);
        intent.putExtra("water", water);
        intent.putExtra("beer", beer);
        intent.putExtra("coke", coke);
        intent.putExtra("ice", ice);
        intent.putExtra("mushroom", mushroom);
        intent.putExtra("onion", onion);
        intent.putExtra("asparagus", asparagus);
        intent.putExtra("babycorn", babycorn);
        //intent.addFlags(65536);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
    public void openCheckout(View v){
        //finish();
        Intent intent = new Intent(Menu.this, Checkout.class);
        intent.putExtra("price", price);
        intent.putExtra("activity", activity);
        intent.putExtra("page", page);
        intent.putExtra("brisket", brisket);
        intent.putExtra("ribeye", ribeye);
        intent.putExtra("chuckeye", chuckeye);
        intent.putExtra("wagyu", wagyu);
        intent.putExtra("beacon", beacon);
        intent.putExtra("porkneck", porkneck);
        intent.putExtra("sirlon", sirlon);
        intent.putExtra("tenderloin", tenderloin);
        intent.putExtra("breast", breast);
        intent.putExtra("nugget", nugget);
        intent.putExtra("pepperchiken", pepperchiken);
        intent.putExtra("firedchiken", firedchiken);
        intent.putExtra("squid", squid);
        intent.putExtra("dollyfish", dollyfish);
        intent.putExtra("shrimp", shrimp);
        intent.putExtra("scallops", scallops);
        intent.putExtra("water", water);
        intent.putExtra("beer", beer);
        intent.putExtra("coke", coke);
        intent.putExtra("ice", ice);
        intent.putExtra("mushroom", mushroom);
        intent.putExtra("onion", onion);
        intent.putExtra("asparagus", asparagus);
        intent.putExtra("babycorn", babycorn);

        startActivity(intent);
        overridePendingTransition(0,0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) //Ad on top
     {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
         this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // LANDSCAPE ONLY
         myDialog = new Dialog(this);

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
        people = bundle.getInt("people");



        init();
        update();
        /*addOrder.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

             }
         });*/



    }


}
