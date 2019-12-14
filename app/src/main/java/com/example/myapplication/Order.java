package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ListAdapter;

public class Order extends AppCompatActivity {
    int activity ;
    int page;
    int brisket,ribeye,chuckeye,wagyu;
    int beacon,porkneck,sirlon,tenderloin;
    int breast,nugget,pepperchiken,firedchiken;
    int squid,dollyfish,shrimp,scallops;
    int water,beer,coke,ice;
    int mushroom,onion,asparagus,babycorn;
    int test;



    String[] namefood = {"brisket","ribeye","chuckeye","wagyu","beacon","porkneck","sirlon","tenderloin","breast","nugget","pepperchiken","firedchiken","squid","dollydish","shrimp","scallops","water","beer","coke","ice","mushroom","onion","asparagus","babycorn"};
    int[] count = new int[24];
    int [] Image = {R.drawable.brisket,R.drawable.ribeye,R.drawable.shuckeye,R.drawable.vagil,R.drawable.becon,R.drawable.sunneck,R.drawable.sunout,R.drawable.sunin,R.drawable.breast,R.drawable.nugget,R.drawable.blackpepper,R.drawable.kaitod,R.drawable.squid,R.drawable.dolly,R.drawable.shrimp,R.drawable.scallobs,R.drawable.water,R.drawable.beer,R.drawable.coke,R.drawable.ice,R.drawable.mushroom,R.drawable.onion,R.drawable.aspalagas,R.drawable.babycorn};
    int[] count1 = new int[24] ;
    int[] Image1 = new int[24] ;
    String[] namefood1 = new String[24] ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        ListView listview = (ListView)findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter();
        listview.setAdapter(customAdapter);

        Bundle bundle = getIntent().getExtras();
        page = bundle.getInt("page");
        activity = bundle.getInt("activity");
        //if(activity ==1 ){
        count[0] = brisket = bundle.getInt("brisket");
        count[1] = ribeye = bundle.getInt("ribeye");
        count[2] = chuckeye = bundle.getInt("chuckeye");
        count[3] = wagyu = bundle.getInt("wagyu");
        count[4] = beacon = bundle.getInt("beacon");
        count[5] = porkneck = bundle.getInt("porkneck");
        count[6] = sirlon = bundle.getInt("sirlon");
        count[7] = tenderloin = bundle.getInt("tenderloin");
        count[8] = breast = bundle.getInt("breast");
        count[9] = nugget = bundle.getInt("nugget");
        count[10] = pepperchiken = bundle.getInt("pepperchiken");
        count[11] = firedchiken = bundle.getInt("firedchiken");
        count[12] = squid = bundle.getInt("squid");
        count[13] = dollyfish = bundle.getInt("dollyfish");
        count[14] = shrimp = bundle.getInt("shrimp");
        count[15] = scallops = bundle.getInt("scallops");
        count[16] = water = bundle.getInt("water");
        count[17] = beer = bundle.getInt("beer");
        count[18] = coke = bundle.getInt("coke");
        count[19] = ice = bundle.getInt("ice");
        count[20] = mushroom = bundle.getInt("mushroom");
        count[21] = onion = bundle.getInt("onion");
        count[22] = asparagus = bundle.getInt("asparagus");
        count[23] = babycorn = bundle.getInt("babycorn");
        test=0;
        for(int j=0;j<24;j++){
            if(count[j]!=0){
                count1[test]=count[j];
                Image1[test]=Image[j];
                namefood1[test]=namefood[j];
                test++;
            }
        }

    }




    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount(){
            return test;
        }
        @Override
        public Object getItem(int i){
            return null;
        }
        @Override
        public long getItemId(int i){
            return 0;
        }
        @Override
        public View getView(int i , View view , ViewGroup viewGroup){
            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            TextView textView1= (TextView)view.findViewById(R.id.textview_foodname);
            TextView textView2= (TextView)view.findViewById(R.id.textView_count);
            ImageView imageView= (ImageView)view.findViewById(R.id.imageView_foodpic);
            imageView.setImageResource(Image1[i]);
            textView1.setText(namefood1[i]);
            textView2.setText("" + count1[i]);
            return view;

        }


    }


    public void openMenu(View v){

        /*Intent intent1 = new Intent(this, Menu.class);
        startActivity(intent1);*/
        finish();
        overridePendingTransition(0,0);
    }
    public void openPromotion(View v){

        Intent intent = new Intent(Order.this, Promotion.class);
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
        intent.putExtra("dollydish", dollyfish);
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
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }
    public void openCheckout(View v){
        //finish();
        Intent intent = new Intent(Order.this, Checkout.class);
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
        intent.putExtra("dollydish", dollyfish);
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
}
