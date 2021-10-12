package com.androidmarket.pdfcreator.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.androidmarket.pdfcreator.util.AdsUtility;
import com.google.android.gms.ads.AdListener;

import androidmarket.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        AdsUtility.loadInterstitialAd(this);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (AdsUtility.mInterstitialAd.isLoaded()){
                    AdsUtility.mInterstitialAd.show();
                    AdsUtility.mInterstitialAd.setAdListener(new AdListener(){
                        @Override
                        public void onAdClosed() {
                            super.onAdClosed();
                            startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                            finish();
                        }
                    });
                } else {
                    startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                    finish();

                }
            }
        }, 3000);

    }
}