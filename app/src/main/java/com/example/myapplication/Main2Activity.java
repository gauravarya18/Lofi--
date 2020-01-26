package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Ref#2 https://stackoverflow.com/questions/13601883/how-to-pass-arraylist-of-objects-from-one-to-another-activity-using-intent-in-an

        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<String> list = (ArrayList<String>) args.getSerializable("ARRAYLIST");

        //Ref#3 https://stackoverflow.com/questions/14355731/killing-one-activity-from-another/14356774
        MainActivity.getInstance().finish();

        TextView tv=findViewById(R.id.textView);
        for(int i=0;i<list.size();i++)
        {
            tv.setText(tv.getText()+"\n"+list.get(i)+"\n");
        }


    }
}
