package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    public void ata (View v) {
        Button bt = (Button) v;
        int sayi=Integer.parseInt(bt.getText().toString());

        if(islem=='+'){
            if(b!=0){
                if(a%1==0){
                    b=b*10+sayi;
                    textView.setText((int)a + "+" + (int)b);
                }
                else{
                    b=b*10+sayi;
                    textView.setText(a + "+" + (int)b);
                }
            }
            else{
                if(a%1==0){
                    b=sayi;
                    textView.setText((int)a + "+" + (int)b);
                }
                else{
                    b=sayi;
                    textView.setText(a + "+" + (int)b);
                }
            }
        }
        else if(islem=='-'){
            if(b!=0){
                if(a%1==0){
                    b=b*10+sayi;
                    textView.setText((int)a + "-" + (int)b);
                }
                else{
                    b=b*10+sayi;
                    textView.setText(a + "-" + (int)b);
                }
            }
            else{
                if(a%1==0){
                    b=sayi;
                    textView.setText((int)a + "-" + (int)b);
                }
                else{
                    b=sayi;
                    textView.setText(a + "-" + (int)b);
                }
            }
        }
        else if(islem=='*'){
            if(b!=0){
                if(a%1==0){
                    b=b*10+sayi;
                    textView.setText((int)a + "*" + (int)b);
                }
                else{
                    b=b*10+sayi;
                    textView.setText(a + "*" + (int)b);
                }
            }
            else{
                if(a%1==0){
                    b=sayi;
                    textView.setText((int)a + "*" + (int)b);
                }
                else{
                    b=sayi;
                    textView.setText(a + "*" + (int)b);
                }
            }
        }
        else if(islem=='/'){
            if(b!=0){
                if(a%1==0){
                    b=b*10+sayi;
                    textView.setText((int)a + "/" + (int)b);
                }
                else{
                    b=b*10+sayi;
                    textView.setText(a + "/" + (int)b);
                }
            }
            else{
                if(a%1==0){
                    b=sayi;
                    textView.setText((int)a + "/" + (int)b);
                }
                else{
                    b=sayi;
                    textView.setText(a + "/" + (int)b);
                }
            }
        }
        else{
            if(a!=0){
                a=a*10+sayi;
                textView.setText(String.valueOf((int)a));
            }
            else{
                a=sayi;
                textView.setText(String.valueOf((int)a));
            }
        }
    }

    public void islemAta (View v) {
        Button bt = (Button) v;
        islem=bt.getText().charAt(0);
        if(a==0 && toplam!=0){
            a=toplam;
        }
        if(a%1==0){
            textView.setText(String.valueOf((int)a)+islem);
        }
        else{
            textView.setText(String.valueOf(a)+islem);
        }

    }

    public void sonuc (View v){
        if(b==0 && islem=='/'){
            textView.setText("Tanımsız!");
        }
        else{
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
            if(toplam%1==0){
                textView.setText(String.valueOf((int)toplam));
            }
            else{
                textView.setText(String.valueOf(toplam));
            }
        }
        islem='?';
        a=0;
        b=0;
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

    public void yapim(View v){
        Toast.makeText(this, "Bilimsel versiyon yapım aşamasında...", Toast.LENGTH_SHORT).show();
    }
}