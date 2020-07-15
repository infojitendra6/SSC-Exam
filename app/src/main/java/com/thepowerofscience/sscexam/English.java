package com.thepowerofscience.sscexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class English extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14,
            btn15, btn16,btn17, btn18, btn19, btn20, btn21, btn22;
    AdView adView;
    Toolbar toolbar;
    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ENGLISH");
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
        btn12=(Button)findViewById(R.id.button12);
        btn13=(Button)findViewById(R.id.button13);
        btn14=(Button)findViewById(R.id.button14);
        btn15=(Button)findViewById(R.id.button15);
        btn16=(Button)findViewById(R.id.button16);
        btn17=(Button)findViewById(R.id.button17);
        btn18=(Button)findViewById(R.id.button18);
        btn19=(Button)findViewById(R.id.button19);
        btn20=(Button)findViewById(R.id.button20);
        btn21=(Button)findViewById(R.id.button21);
        btn22=(Button)findViewById(R.id.button22);
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-2926884775165200/9308931508");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed()
            {
                startActivity(new Intent(English.this, english2.class));
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }// remove addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english1.class);
                startActivity(intent1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent1=new Intent(English.this, english2.class);
              //  startActivity(intent1);
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                }
                else
                {
                    startActivity(new Intent(English.this, english2.class));
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english3.class);
                startActivity(intent1);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english4.class);
                startActivity(intent1);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english5.class);
                startActivity(intent1);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english6.class);
                startActivity(intent1);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english7.class);
                startActivity(intent1);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english8.class);
                startActivity(intent1);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english9.class);
                startActivity(intent1);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english10.class);
                startActivity(intent1);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english11.class);
                startActivity(intent1);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english12.class);
                startActivity(intent1);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english13.class);
                startActivity(intent1);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english14.class);
                startActivity(intent1);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english15.class);
                startActivity(intent1);
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english16.class);
                startActivity(intent1);
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english17.class);
                startActivity(intent1);
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english18.class);
                startActivity(intent1);
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english19.class);
                startActivity(intent1);
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english20.class);
                startActivity(intent1);
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english21.class);
                startActivity(intent1);
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(English.this, english22.class);
                startActivity(intent1);
            }
        });
     //   MobileAds.initialize(this, "ca-app-pub-3940256099942544/6300978111");
     //   adView=(AdView)findViewById(R.id.adView);
     //   AdRequest adRequest=new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
      //  adView.loadAd(adRequest);//end banner ad & start interstitial ad

    }
}

