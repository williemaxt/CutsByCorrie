package com.example.six11.bookafade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class PayActivity extends  AppCompatActivity{
    //--------------------declaring the second text view-----------------------
 TextView tv2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        tv2 = (TextView) findViewById(R.id.priceView2);


    }


}
