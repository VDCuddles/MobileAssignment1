package com.example.aquila.mobileassignment1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.helloAndroid.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getActionBar().setIcon(R.drawable.logo);

    }

    public void parseToWebView (View aView)
    {

        Intent intent = new Intent(this, WebViewActivity.class);
        String url = "http://unitec.ac.nz";
        intent.putExtra(EXTRA_MESSAGE, url);
        startActivity(intent);

//        Uri webpage = Uri.parse("http://unitec.ac.nz");
//        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);

//        WebView webview = new WebView(this);
//        setContentView(webview);
//        String url = "http://unitec.ac.nz";
//        intent.putExtra(EXTRA_MESSAGE, url);
//        startActivity(webIntent);
//        webview.loadUrl("http://unitec.ac.nz");

//        Uri uri = Uri.parse("http://www.example.com");
//        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

//        startActivity(intent);
    }

    public void sendEmail (View aView)
    {

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("Unitec Online Help", "study@unitec.ac.nz", null));
//        emailIntent.setType(message/rfc822);

        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"study@unitec.ac.nz"}); // recipients
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Please enter your query subject here.");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Please enter your query here.");
        startActivityForResult(emailIntent, 1);

//        emailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"));

        startActivity(emailIntent);

    }
}
