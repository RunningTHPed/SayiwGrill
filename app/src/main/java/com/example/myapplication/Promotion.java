package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.PeriodicSync;
import android.os.Bundle;
import android.view.View;

public class Promotion extends AppCompatActivity {
    int activity = 2 ;
    int page;
    int brisket,ribeye,chuckeye,wagyu;
    int beacon,porkneck,sirlon,tenderloin;
    int breast,nugget,pepperchiken,firedchiken;
    int squid,dollyfish,shrimp,scallops;
    int water,beer,coke,ice;
    int mushroom,onion,asparagus,babycorn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion);
        Bundle bundle = getIntent().getExtras();
        page = bundle.getInt("page");
        activity = bundle.getInt("activity");
        brisket = bundle.getInt("brisket");
        ribeye = bundle.getInt("ribeye");
        chuckeye = bundle.getInt("chuckeye");
        wagyu = bundle.getInt("wagyu");
        beacon = bundle.getInt("beacon");
        porkneck = bundle.getInt("porkneck");
        sirlon = bundle.getInt("sirlon");
        tenderloin = bundle.getInt("tenderloin");
        breast = bundle.getInt("breast");
        nugget = bundle.getInt("nugget");
        pepperchiken = bundle.getInt("pepperchiken");
        firedchiken = bundle.getInt("firedchiken");
        squid = bundle.getInt("squid");
        dollyfish = bundle.getInt("dollyfish");
        shrimp = bundle.getInt("shrimp");
        scallops = bundle.getInt("scallops");
        water = bundle.getInt("water");
        beer = bundle.getInt("beer");
        coke = bundle.getInt("coke");
        ice = bundle.getInt("ice");
        mushroom = bundle.getInt("mushroom");
        onion = bundle.getInt("onion");
        asparagus = bundle.getInt("asparagus");
        babycorn = bundle.getInt("babycorn");

    }

    public void openOrder(View v){
        finish();
        Intent intent = new Intent(Promotion.this, Order.class);
        intent.putExtra("page", activity);
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
        intent.putExtra("dollydish",dollyfish);
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
        finish();
        /*Intent intent = new Intent(Promotion.this, Menu.class);
        startActivity(intent);*/
        overridePendingTransition(0,0);
    }
    public void openCheckout(View v){
        finish();
        Intent intent = new Intent(Promotion.this, Checkout.class);
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
