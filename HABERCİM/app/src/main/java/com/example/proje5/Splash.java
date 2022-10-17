package com.example.proje5;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {




        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);//uygulama ilk açıldığında griş ekranını göstermesi için yazdığımız
        //kod
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.splash);


        Thread thread=new Thread(){
            public void run(){ // giriş ekranını 2 saniye ekranda tutup ana ekrana gönder
                try {
                    sleep(2000);
                }catch (InterruptedException e){
                    Toast.makeText(Splash.this,e.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                }finally {
                    Intent intent=new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        thread.start();
    }
}