package com.thepowerofscience.sscexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import com.facebook.ads.*;

public class fb_page extends AppCompatActivity {
WebView webView;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fb_page);
        webView = (WebView) findViewById(R.id.web2);
        webView.loadUrl("https://www.facebook.com/thepowerofscien28/?ref=bookmarks");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        adView = new AdView(this, "342902526553246_343978923112273", AdSize.BANNER_HEIGHT_50);
        // Find the Ad C
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
    }
    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}
