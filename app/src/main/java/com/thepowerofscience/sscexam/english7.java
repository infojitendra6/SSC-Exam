package com.thepowerofscience.sscexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class english7 extends AppCompatActivity {
    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english7);
        WebView webView=(WebView)findViewById(R.id.web);
        webView.loadUrl("https://drive.google.com/open?id=1k0IXJY_wiMLmNOJ8vFY8dzu6x6w83zlF");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        //addview
        MobileAds.initialize(this, "ca-app-pub-2926884775165200/3335260538");
        adView=(AdView)findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);//end banner ad & start interstitial ad

    }
}
