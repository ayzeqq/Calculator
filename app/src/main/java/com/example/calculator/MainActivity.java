package com.example.calculator;

import static java.lang.String.format;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

/*
*
*
* */

public class MainActivity extends AppCompatActivity {

    double a;
    double b;
    char islem= '?';
    double toplam=0;
    TextView textView;
    boolean isUsed=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void ata (View v) {
        Button bt = (Button) v;
        int sayi=Integer.parseInt(bt.getText().toString());
        String tplm=new DecimalFormat("##.#####").format(a);
        if(islem=='+'){
            //if(b!=0){
                if(a%1==0){
                    b=b*10+sayi;
                    textView.setText((int)a + "+" + (int)b);
                }
                else{
                    b=b*10+sayi;
                    textView.setText(tplm + "+" + (int)b);
                }
        }
        else if(islem=='-'){
                if(a%1==0){
                    b=b*10+sayi;
                    textView.setText((int)a + "-" + (int)b);
                }
                else{
                    b=b*10+sayi;
                    textView.setText(tplm + "-" + (int)b);
                }
        }
        else if(islem=='*'){
                if(a%1==0){
                    b=b*10+sayi;
                    textView.setText((int)a + "*" + (int)b);
                }
                else{
                    b=b*10+sayi;
                    textView.setText(tplm + "*" + (int)b);
                }
        }
        else if(islem=='/'){
                if(a%1==0){
                    b=b*10+sayi;
                    textView.setText((int)a + "/" + (int)b);
                }
                else{
                    b=b*10+sayi;
                    textView.setText(tplm + "/" + (int)b);
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
            String tplm=new DecimalFormat("##.#####").format(a);
            textView.setText(tplm+islem);
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
                String tplm=new DecimalFormat("##.#####").format(toplam);
                textView.setText(tplm);
            }
        }
        islem='?';
        a=0;
        b=0;
        isUsed=true;
    }

    public void delete (View v) {
        String tempA;
        if(a%1==0){
            tempA=String.valueOf((int)a);
        }
        else{
            tempA=new DecimalFormat("##.#####").format(toplam);;
        }
        if(b>9){
            b=(b-b%10)/10;
            textView.setText(tempA + islem + String.valueOf((int)b));
        }
        else if(b<9 && b!=0){
            b=0;
            textView.setText(tempA + islem);
        }
        else if(islem!='?'){
            islem='?';
            textView.setText(tempA);
        }
        else if(a!=0 && a%1!=0){
            a=(a-a%10)/10;
            textView.setText(String.valueOf(a));
        }
        else if(a!=0 && a%1==0){
            a=(a-a%10)/10;
            textView.setText(String.valueOf((int)a));
        }
        else{
            a=0;
            b=0;
        }
    }

    public void clear (View v) {
        islem='?';
        a=0;
        b=0;
        toplam=0;
        textView.setText("0");
        isUsed=false;
    }

    public void yapim(View v){
        Toast.makeText(this, "Bilimsel versiyon yapım aşamasında...", Toast.LENGTH_SHORT).show();
    }
}