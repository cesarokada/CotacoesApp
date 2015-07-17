package com.example.cesar.cotacoesapp;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ZoomButtonsController;


public class MainActivityFilho extends ActionBarActivity {

    private String url;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_filho);

        TextView textView = new TextView(this);
        Intent intent = getIntent();

        Bundle params = intent.getExtras();

        if(params != null){
            url = params.getString("url");
        }

        WebView wv = (WebView) findViewById(R.id.webView1);

        ViewGroup.MarginLayoutParams marginsParams = new ViewGroup.MarginLayoutParams(wv.getLayoutParams());
        marginsParams.setMargins(10, 20,20, 10);
        marginsParams.setLayoutDirection(10);
        wv.setInitialScale(210);

        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        wv.loadUrl(url);

    }
}
