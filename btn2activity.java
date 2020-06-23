package com.omkarpatil.coronashield;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class btn2activity extends AppCompatActivity {
    //TextView tvalarm;
    Button btnset;
    EditText ettime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn2activity);
        btnset= findViewById(R.id.btnset);
        ettime = findViewById(R.id.ettime);

        btnset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int time = Integer.parseInt(ettime.getText().toString());
                Intent intent = new Intent(btn2activity.this,alarm.class);
                PendingIntent pi = PendingIntent.getBroadcast(getApplicationContext(),0,intent,0);
                AlarmManager am =(AlarmManager)getSystemService(ALARM_SERVICE);
                am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+time*60000,pi);
                //Toast.makeText(btnset, "Alarm Set", Toast.LENGTH_SHORT).show();





            }
        });

    }
}
