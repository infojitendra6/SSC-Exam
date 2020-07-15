package com.thepowerofscience.sscexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class imp_gk4 extends AppCompatActivity {
    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp_gk4);
        MobileAds.initialize(this, "ca-app-pub-2926884775165200/8075740884");
       adView=(AdView)findViewById(R.id.adView);
       AdRequest adRequest=new AdRequest.Builder().build();
       adView.loadAd(adRequest);//end banner ad & start interstitial ad

    }
}
