package com.thepowerofscience.sscexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class lucent9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucent9);
        WebView webView=(WebView)findViewById(R.id.web);
        webView.loadUrl("https://drive.google.com/open?id=1ivctUREg4yV4anHb9F3Y6dijLFOi40BK");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        //ad
        MobileAds.initialize(this, "ca-app-pub-2926884775165200/7265222095");
        AdView adView=(AdView)findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);//end banner ad & start interstitial ad

    }
}
