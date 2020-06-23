/*package com.example.coronashield;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class btn6activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn6activity);
    }
}*/
package com.omkarpatil.coronashield;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class btn6activity extends AppCompatActivity {
    WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn6activity);
        mywebView=findViewById(R.id.webview);
        WebSettings websettings = mywebView.getSettings();
        websettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://covid.apollo247.com/");
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
    }
}

