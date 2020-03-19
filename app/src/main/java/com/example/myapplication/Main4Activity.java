package com.example.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {
      ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        list = (ArrayList<String>) args.getSerializable("ARRAYLIST");

        Button buttonScan = findViewById(R.id.scanBtn);
        Button buttonScan1 = findViewById(R.id.scanBtn1);
        buttonScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main4Activity.this,MainActivity.class);
                Bundle args = new Bundle();
                args.putSerializable("ARRAYLIST",(Serializable)list);
                i.putExtra("BUNDLE",args);
                startActivity(i);
            }
        });


     buttonScan1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(Main4Activity.this,Main2Activity.class);
            Bundle args = new Bundle();
            args.putSerializable("ARRAYLIST",(Serializable)list);
            i.putExtra("BUNDLE",args);
            startActivity(i);
        }

    });

    }
}
