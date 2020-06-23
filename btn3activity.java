package com.omkarpatil.coronashield;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class btn3activity extends YouTubeBaseActivity {

    YouTubePlayerView mYouTubePlayerView;
    Button playbtn,btn1,btn2,btn3,btn4;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn3activity);
        playbtn=findViewById(R.id.playbtn);

      btn1=findViewById(R.id.btn1);
      btn2= findViewById(R.id.btn2);
      btn3=findViewById(R.id.btn3);
      btn4= findViewById(R.id.btn4);

        mYouTubePlayerView = findViewById(R.id.youtubeplayer);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
            {
                youTubePlayer.loadVideo("NMre6IAAAiU");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };


        /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn6activity);
        mywebView=findViewById(R.id.webview1);
        WebSettings websettings = mywebView.getSettings();
        websettings.setJavaScriptEnabled(true);
        btn1.mywebView.loadUrl("https://news.google.com/covid19/map?hl=en-IN&gl=IN&ceid=IN:en");
        btn2.mywebView.loadUrl("https://www.india.gov.in/news_lists?a253337404");
        btn3.mywebView.loadUrl("https://www.mygov.in/covid-19/");
        btn4.mywebView.loadUrl("https://www.covid19india.org/");
        mywebView.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (mywebView.canGoBack())
        {
            mywebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }*/






        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               mYouTubePlayerView.initialize(youtubeconfig.getApiKey(),mOnInitializedListener);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://news.google.com/covid19/map?hl=en-IN&gl=IN&ceid=IN:en"));
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.india.gov.in/news_lists?a253337404"));
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.mygov.in/covid-19/"));
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW ,Uri.parse("https://www.covid19india.org/"));
                startActivity(intent);
            }
        });
    }
}
