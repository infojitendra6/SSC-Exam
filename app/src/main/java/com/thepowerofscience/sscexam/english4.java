package com.thepowerofscience.sscexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class english4 extends AppCompatActivity {
    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english4);
        WebView webView=(WebView)findViewById(R.id.web);
        webView.loadUrl("https://drive.google.com/open?id=1dWAgzzoBT0QJdVtuBI1ySt3gLFRV5zN5");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        MobileAds.initialize(this, "ca-app-pub-2926884775165200/6543167367");
        adView=(AdView)findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);//end banner ad & start interstitial ad

    }
}