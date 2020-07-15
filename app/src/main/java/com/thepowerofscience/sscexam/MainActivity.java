package com.thepowerofscience.sscexam;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener , RewardedVideoAdListener {
    ViewFlipper viewFlipper;
    Toolbar toolbar;
    private RewardedVideoAd mRewardedVideoAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("SSC EXAM");
        toolbar.setSubtitle("PREPARATION");
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
       // Button button4=(Button)findViewById(R.id.button4);
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();

        int images []={R.mipmap.images,  R.mipmap.apj3,  R.mipmap.apj2,  R.mipmap.apj4};
        viewFlipper=findViewById(R.id.viewFlipper);
        //for loop
        for (int i=0; i<images.length; i++)

        {
            Fliperimage(images[i]);
        }


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this, LUCENT.class);
                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this, English.class);
                startActivity(intent2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,imp_gk.class);
                startActivity(intent1);
            }
        });
       /* button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,onlineForm.class);
                startActivity(intent2);
            }
        });*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.exit2) {
            Intent intent1=new Intent(MainActivity.this, fb_page.class);
            startActivity(intent1);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.rating_us) {
            // Handle the rating  action
            try{
                Uri uri1=Uri.parse("https://play.google.com/store/apps/developer?id=The+Power+of+Science"+getPackageName());
                Intent goToMarkek1=new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(goToMarkek1);
            }
            catch (ActivityNotFoundException e)
            {
                Uri uri1=Uri.parse("https://play.google.com/store/apps/details?id=com.thepowerofscience.sscexam"+getPackageName());
                Intent goToMarkek1=new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(goToMarkek1);
            }
        } else if (id == R.id.other_app) {
     try{
         Uri uri1=Uri.parse("https://play.google.com/store/apps/developer?id=The+Power+of+Science");
         Intent goToMarkek1=new Intent(Intent.ACTION_VIEW, uri1);
         startActivity(goToMarkek1);
     }
     catch (ActivityNotFoundException e)
     {
         Uri uri1=Uri.parse("https://play.google.com/store/apps/developer?id=The+Power+of+Science");
         Intent goToMarkek1=new Intent(Intent.ACTION_VIEW, uri1);
         startActivity(goToMarkek1);
     }
        } else if (id == R.id.contect_us) {
            {
                 //   Intent intent1=new Intent(MainActivity.this,fb_page.class);
                  //  startActivity(intent1);
                if (mRewardedVideoAd.isLoaded()) {
                    mRewardedVideoAd.show();
                }
                }
        } else if (id == R.id.exit) {
         finish();
        } else if (id == R.id.nav_share) {
            Intent myIntent=new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String shareBody="https://play.google.com/store/apps/details?id=com.thepowerofscience.sscexam";
            String shareSub="ssc exam preparation";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
            myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(myIntent,"Share using"));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void Fliperimage(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);
        //animation
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
    //rewaded ad
    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-2926884775165200/6969305670",
                new AdRequest.Builder().build());
    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {
        loadRewardedVideoAd();
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
    @Override
    public void onResume() {
        mRewardedVideoAd.resume(this);
        super.onResume();
    }

    @Override
    public void onPause() {
        mRewardedVideoAd.pause(this);
        super.onPause();
    }

    @Override
    public void onDestroy() {
        mRewardedVideoAd.destroy(this);
        super.onDestroy();
    }
}
