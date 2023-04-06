package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
* Sonuçtan sonra işlem yapmayı ayrıntılandır.
* +'ya basmak ile sayı girmek farklı tepki vermeli.
*
* */

public class MainActivity extends AppCompatActivity {

    double a;
    double b;
    char islem= '?';
    double toplam=0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    /*public void delete () {
        if(b!=0){
            b=(b-b%10)/10;
        }
        else if(islem!='?'){
            islem='?';
        }
        else if(a!=0){
            a=(a-a%10)/10;
        }
        else{
            a=0;
            b=0;
        }
    }*/

    public void clear (View v) {
        islem='?';
        a=0;
        b=0;
        toplam=0;
        textView.setText("0");
    }

    public void islemAta (View v) {
        Button bt = (Button) v;
        islem=bt.getText().charAt(0);
        textView.setText(String.valueOf(a)+islem);
    }

    public void sonuc (View v){
        if(islem=='+'){
            toplam=a+b;
            textView.setText(String.valueOf(toplam));
        }
        if(islem=='-'){
            toplam=a-b;
            textView.setText(String.valueOf(toplam));
        }
        if(islem=='*'){
            toplam=a*b;
            textView.setText(String.valueOf(toplam));
        }
        if(islem=='/'){
            if(b==0){
                textView.setText("Tanımsız!");
            }
            else{
                toplam=a/b;
                textView.setText(String.valueOf(toplam));
            }
        }
        //System.out.println("a sayısı= " + a + " b sayısı= " + b);
        //System.out.println("Toplam= " + toplam);
        islem='?';
        a=toplam; //bunu 0 yap sonra
        b=0;
    }

    public void ata (View v) {
        Button bt = (Button) v;
        int sayi=Integer.parseInt(bt.getText().toString());
        if(islem=='+'){
            if(b!=0){
                b=b*10+sayi;
                textView.setText(String.valueOf(a) + "+" + String.valueOf(b));
            }
            else{
                b=sayi;
                textView.setText(String.valueOf(a) + "+" + String.valueOf(b));
            }
        }
        else if(islem=='-'){
            if(b!=0){
                b=b*10+sayi;
                textView.setText(String.valueOf(a) + "-" + String.valueOf(b));
            }
            else{
                b=sayi;
                textView.setText(String.valueOf(a) + "-" + String.valueOf(b));
            }
        }
        else if(islem=='*'){
            if(b!=0){
                b=b*10+sayi;
                textView.setText(String.valueOf(a) + "*" + String.valueOf(b));
            }
            else{
                b=sayi;
                textView.setText(String.valueOf(a) + "*" + String.valueOf(b));
            }
        }
        else if(islem=='/'){
            if(b!=0){
                b=b*10+sayi;
                textView.setText(String.valueOf(a) + "/" + String.valueOf(b));
            }
            else{
                b=sayi;
                textView.setText(String.valueOf(a) + "/" + String.valueOf(b));
            }
        }
        else{
            if(a!=0){
                a=a*10+sayi;
                textView.setText(String.valueOf(a));
            }
            else{
                a=sayi;
                textView.setText(String.valueOf(a));
            }
        }
    }
}