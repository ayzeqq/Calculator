package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int a;
    int b;
    boolean arti=false;
    int c=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);
        final Button button4 = findViewById(R.id.button4);
        final Button button5 = findViewById(R.id.button5);
        final Button button6 = findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(arti==false){
                    a=1;
                }
                else{
                    b=1;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(arti==false){
                    a=2;
                }
                else{
                    b=2;
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(arti==false){
                    a=3;
                }
                else{
                    b=3;
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(arti==false){
                    a=4;
                }
                else{
                    b=4;
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                arti=true;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Toplam= " + (a+b));
                arti=false;
                a=0;
                b=0;
            }
        });
    }


}