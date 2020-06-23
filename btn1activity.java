/*package com.example.coronashield;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class btn1activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1activity);
    }
}*/

package com.omkarpatil.coronashield;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import static com.omkarpatil.coronashield.R.id.youtubeplayer;

public class btn1activity extends YouTubeBaseActivity {

    private static final String TAG = "ActivityYoutube";



    YouTubePlayerView mYoutubePlayerView;
    Button playbtn;
    Button btncentral,btnpolice,btnambulance,btnstate;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1activity);
        Log.d(TAG, "onCreate: Starting.");

        playbtn = (Button) findViewById(R.id.playbtn);
        mYoutubePlayerView = findViewById(youtubeplayer);
        btncentral = findViewById(R.id.btncentral);
        btnpolice = findViewById(R.id.btnpolice);
        btnambulance = findViewById(R.id.btnambulance);
        btnstate = findViewById(R.id.btnstate);





        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done Initializing");
                youTubePlayer.loadVideo("xMWe4UnykWc");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failed to iniitializa");

            }
        };
        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Initializing Youtube Player");
                mYoutubePlayerView.initialize(youtubeconfig.getApiKey(),mOnInitializedListener);


            }
        });


        btncentral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:1075"));
                startActivity(intent);
            }
        });


        btnpolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:100"));
                startActivity(intent);



            }
        });
        btnambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:108"));
                startActivity(intent);



            }
        });
        btnstate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:02026127394"));
                startActivity(intent);



            }
        });





    }
}
