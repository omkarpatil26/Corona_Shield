package com.omkarpatil.coronashield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class btn4activity extends AppCompatActivity {

    Button btncentral,btnstate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn4activity);

        btncentral = findViewById(R.id.btncentral);
        btnstate = findViewById(R.id.btnstate);

        btncentral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.pmcares.gov.in/en/web/contribution/donate_india"));
                startActivity(intent);
            }
        });
        btnstate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://cmrf.maharashtra.gov.in/DonationOnlineForm.action"));
                startActivity(intent);
            }
        });
    }
}
