package com.thepowerofscience.sscexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class imp_gk extends AppCompatActivity {
Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11;
    AdView adView;
    Toolbar toolbar;
    private InterstitialAd interstitialAd, interstitialAd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp_gk);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("IMP GK");
        toolbar.setSubtitle("PREPARATION");
        toolbar.setLogo(R.mipmap.flag2);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btn10=(Button)findViewById(R.id.button10);
        btn11=(Button)findViewById(R.id.button11);
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-2926884775165200/1015508515");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed()
            {
                startActivity(new Intent(imp_gk.this, imp_gk1.class));
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }// remove addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent1=new Intent(imp_gk.this, imp_gk1.class);
               // startActivity(intent1);
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                }
                else
                {
                    startActivity(new Intent(imp_gk.this, imp_gk1.class));
                }
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(imp_gk.this, imp_gk2.class);
                startActivity(intent1);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(imp_gk.this, imp_gk3.class);
                startActivity(intent1);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(imp_gk.this, imp_gk4.class);
                startActivity(intent1);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(imp_gk.this, imp_gk5.class);
                startActivity(intent1);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(imp_gk.this, imp_gk6.class);
                startActivity(intent1);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(imp_gk.this, imp_gk7.class);
                startActivity(intent1);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(imp_gk.this, imp_gk8.class);
                startActivity(intent1);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(imp_gk.this, imp_gk9.class);
                startActivity(intent1);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(imp_gk.this, imp_gk10.class);
                startActivity(intent1);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(imp_gk.this, imp_gk11.class);
                startActivity(intent1);
            }
        });
      //  MobileAds.initialize(this, "ca-app-pub-3940256099942544/6300978111");
     //  adView=(AdView)findViewById(R.id.adView);
      // AdRequest adRequest=new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
      // adView.loadAd(adRequest);//end banner ad & start interstitial ad

    }
}
