package com.example.appb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View vew){
                Intent i=new Intent("com.example.MyApplication.MainActivity2");
                startActivity(i);
            }
        });

    }
}