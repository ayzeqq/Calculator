package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a;
    int b;
    boolean arti=false;
    int toplam=0;

    Button button1 = findViewById(R.id.button1);
    Button button2 = findViewById(R.id.button2);
    Button button3 = findViewById(R.id.button3);
    Button button4 = findViewById(R.id.button4);
    Button button5 = findViewById(R.id.button5);
    Button button6 = findViewById(R.id.button6);
    Button button7 = findViewById(R.id.button7);
    Button button8 = findViewById(R.id.button8);
    Button button9 = findViewById(R.id.button9);
    Button button0 = findViewById(R.id.button0);
    Button buttonPlus = findViewById(R.id.buttonPlus);
    Button buttonMinus = findViewById(R.id.buttonMinus);
    Button buttonEquals = findViewById(R.id.buttonEquals);
    TextView textView = findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1.setOnClickListener(new View.OnClickListener() {
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

        /*public void hesaplaSonuc(View v){
            textView.setText(Integer.toString(toplam));
        }*/

        /*button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toplam=a+b;
                System.out.println("a sayısı= " + a + " b sayısı= " + b);
                System.out.println("Toplam= " + );
                textView.setText(Integer.toString(toplam));
                arti=false;
                a=0;
                b=0;
            }
        });*/
    }
    public void tikla (Button bt){
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toplam=a+b;
                textView.setText(Integer.toString(toplam));
                arti=false;
                a=0;
                b=0;
            }
        });

    }

}