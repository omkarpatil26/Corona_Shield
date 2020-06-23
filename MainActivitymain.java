/*package com.example.coronashield;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//public class MainActivitymain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymain);
    }
}*/
package com.omkarpatil.coronashield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivitymain extends AppCompatActivity implements MainActivitymainn {
    ViewFlipper vFlipper;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnshare,btnabout;

    @Override
    public boolean onCreateOptionMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.value,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionalIteamSelected(MenuItem item) {
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_activitymain_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case R.id.new_game:
                //your code
                // EX : call intent if you want to swich to other activity
                return true;
            case R.id.help:
                //your code
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymain);
        int images[] = {R.drawable.stayalert,R.drawable.stayalert2,R.drawable.stayalert3,R.drawable.stayalert4};

        vFlipper = findViewById(R.id.vFlipper);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id .btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnshare = findViewById(R.id.btnshare);
        btnabout = findViewById(R.id.btnabout);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtn6activity();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openbtn2activity();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openbtn3activity();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openbtn4activity();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openbtn5activity();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openbtn8activity();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openbtn7activity();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openbtn1activity();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openbtn9activity();
            }
        });
        btnshare.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openbtnshareactivity();

            }
        });
        btnabout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openbtnaboutactivity();
            }
        });


        for (int image: images) {
            flipperImages(image);
        }


    }
    public void flipperImages(int image)
    {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        vFlipper.addView(imageView);
        vFlipper.setFlipInterval(4000);
        vFlipper.setAutoStart(true);
        vFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        vFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }





    public void openbtn1activity()
    {
        //Intent intent = new Intent(this,btn1activity.class);
        // startActivity(intent);
        Intent intent = new Intent(MainActivitymain.this, btn1activity.class);
        startActivity(intent);

    }

    public void openbtn2activity()
    {
        Intent intent = new Intent(this,btn2activity.class);
        startActivity(intent);

    }

    public void openbtn3activity()
    {
        Intent intent = new Intent(MainActivitymain.this,com.omkarpatil.coronashield.btn3activity.class);
        startActivity(intent);
    }

    public void openbtn4activity()
    {
        Intent intent = new Intent(this,btn4activity.class);
        startActivity(intent);
    }
    public void openbtn5activity()
    {
        Intent intent = new Intent(this,btn5activity.class);
        startActivity(intent);
    }
    public void openbtn6activity()
    {
        Intent intent = new Intent(this,btn6activity.class);
        startActivity(intent);
    }
    public void openbtn7activity()
    {
        Intent intent = new Intent(this,btn7activity.class);
        startActivity(intent);
    }
    public void openbtn8activity()
    {
        Intent intent = new Intent(this,btn8activity.class);
        startActivity(intent);
    }
    public void openbtn9activity()
    {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
    public void openbtnshareactivity()
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String shareBody ="Your body here";
        String shareSub ="Your Subject here";
        intent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
        intent.putExtra(Intent.EXTRA_TEXT,shareBody);
        startActivity(Intent.createChooser(intent,"Share using"));

       // startActivity(intent);
    }
    public void openbtnaboutactivity()
    {
        Intent intent = new Intent(this,btnaboutactivity.class);
        startActivity(intent);
    }




}
