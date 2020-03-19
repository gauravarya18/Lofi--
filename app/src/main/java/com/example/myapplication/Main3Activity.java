package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;
import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Context context=Main3Activity.this;
        ArrayList<String> BSSID = new ArrayList<>();
        Intent i=new Intent(Main3Activity.this,Main4Activity.class);
        Bundle args = new Bundle();
        args.putSerializable("ARRAYLIST",(Serializable)BSSID);
        i.putExtra("BUNDLE",args);
        context.startActivity(i);
    }
}
