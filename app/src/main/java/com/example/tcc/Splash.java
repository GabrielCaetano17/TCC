package com.example.tcc;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity{
        int tempoSplash = 3000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);
            getSupportActionBar().hide();
            ChamaTelaLogin();
        }
        public void ChamaTelaLogin(){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent chamaTela = new Intent(Splash.this, MainActivity.class);
                    startActivity(chamaTela);
                    finish();

                }
            }, tempoSplash);
        }
    }
