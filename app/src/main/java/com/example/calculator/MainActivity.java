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
    double toplam=0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void islemAta (View v) {
        Button bt = (Button) v;
        islem=bt.getText().charAt(0);
        textView.setText(String.valueOf(a) + islem);
    }

    public void sonuc (View v){
        if(islem=='+'){
            toplam=a+b;
        }
        if(islem=='-'){
            toplam=a-b;
        }
        if(islem=='*'){
            toplam=a*b;
        }
        if(islem=='/'){
            toplam=a/b;
        }
        textView.setText(String.valueOf(toplam));
        System.out.println("a sayısı= " + a + " b sayısı= " + b);
        System.out.println("Toplam= " + toplam);
        islem='?';
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
        else if(islem=='*'){
            b=sayi;
            textView.setText(String.valueOf(a) + "*" + String.valueOf(b));
        }
        else if(islem=='/'){
            b=sayi;
            textView.setText(String.valueOf(a) + "/" + String.valueOf(b));
        }
        else{
            a=sayi;
            textView.setText(String.valueOf(a));
        }
    }
}