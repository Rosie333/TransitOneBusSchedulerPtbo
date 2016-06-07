package com.busschedule.group.transitonebusscheduler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class TwitterPage extends AppCompatActivity {
    private WebView Twitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter_page);
        Twitter = (WebView)findViewById(R.id.webView);
        WebSettings twitterSettings = Twitter.getSettings();
        twitterSettings.setJavaScriptEnabled(true);
        Twitter.setWebViewClient(new WebViewClient());
        Twitter.loadUrl("https://twitter.com/PeterboroughTr1?lang=en");


    }

}
