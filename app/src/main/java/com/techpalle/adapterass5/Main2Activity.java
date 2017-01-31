package com.techpalle.adapterass5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        wv= (WebView) findViewById(R.id.webview);
        Intent i=getIntent();
        Bundle b=i.getExtras();
        int s=b.getInt("position");
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        if (s==0){
            wv.loadUrl("https://www.google.com");
        }
        if(s==1){
            wv.loadUrl("https://www.facebook.com");
        }
        if(s==2){
            wv.loadUrl("https://www.youtube.com");
        }
        if(s==3){
            wv.loadUrl("https://www.skillgun.com");
        }
        if (s==4){
            wv.loadUrl("https://www.gmail.com");
        }
        Toast.makeText(Main2Activity.this,"welcome to website",Toast.LENGTH_LONG).show();

    }
}
