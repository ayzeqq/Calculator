package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a;
    int b;
    char islem= '?';
    int toplam=0;
    TextView textView;
    Button buttonPlus, buttonMinus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button0 = findViewById(R.id.button0);
        Button buttonEquals = findViewById(R.id.buttonEquals);*/
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);

        textView = findViewById(R.id.textView);
        /*button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(islem=='+' || islem=='-'){
                    a=1;
                }
                else{
                    b=1;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(islem=='+' || islem=='-'){
                    a=2;
                }
                else{
                    b=2;
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(islem=='+' || islem=='-'){
                    a=3;
                }
                else{
                    b=3;
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(islem=='+' || islem=='-'){
                    a=4;
                }
                else{
                    b=4;
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(islem=='+' || islem=='-'){
                    a=4;
                }
                else{
                    b=4;
                }
            }
        });*/

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                islem='+';
                textView.setText(String.valueOf(a) + "+");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                islem='-';
                textView.setText(String.valueOf(a) + "-");
            }
        });

    }
    public void sonuc (View v){
        //islem=c;
        if(islem=='+'){
            toplam=a+b;
        }
        if(islem=='-'){
            toplam=a-b;
        }
        textView.setText(String.valueOf(toplam));
        System.out.println("a sayısı= " + a + " b sayısı= " + b);
        System.out.println("Toplam= " + toplam);
        //textView.setText(toplam);
        islem='.';
        a=0;
        b=0;
    }

    public void ata (View v) {
        Button bt = (Button) v;

        int sayi=Integer.parseInt(bt.getText().toString());
        if(islem=='+'){
            b=sayi;
            textView.setText(String.valueOf(a) + "+" + String.valueOf(b));
        }
        else if(islem=='-'){
            b=sayi;
            textView.setText(String.valueOf(a) + "-" + String.valueOf(b));
        }
        else{
            a=sayi;
            textView.setText(String.valueOf(a));
        }
    }
}