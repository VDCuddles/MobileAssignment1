package com.example.aquila.mobileassignment1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.helloAndroid.MESSAGE";
//    Button emailButton;
//    Button studyOptionsButton;
//    Button ITSupportButton;
//    Button aboutUnitecButton;
//    Button phoneButton;
//    Button mapsButton;
//    Button portalButton;
//    Button linkinButton;
//    Button gplusButton;
//    Button twitButton;
//    Button fbButton;
//    Button libraryButton;
//    Button youtButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        emailButton.setOnClickListener(this);
//        studyOptionsButton.setOnClickListener(this);
//        ITSupportButton.setOnClickListener(this);
//        aboutUnitecButton.setOnClickListener(this);
//        phoneButton.setOnClickListener(this);
//        mapsButton.setOnClickListener(this);
//        portalButton.setOnClickListener(this);
//        linkinButton.setOnClickListener(this);
//        gplusButton.setOnClickListener(this);
//        twitButton.setOnClickListener(this);
//        fbButton.setOnClickListener(this);
//        libraryButton.setOnClickListener(this);
//        youtButton.setOnClickListener(this);

//        final ImageButton emailButton = (ImageButton) findViewById(R.id.emailButton);
//        final ImageButton studyOptionsButton = (ImageButton) findViewById(R.id.studyOptionsButton);
//        final ImageButton ITSupportButton = (ImageButton) findViewById(R.id.ITSupportButton);
//        final ImageButton aboutUnitecButton = (ImageButton) findViewById(R.id.aboutUnitecButton);
//        final ImageButton phoneButton = (ImageButton) findViewById(R.id.phoneButton);
//        final ImageButton mapsButton = (ImageButton) findViewById(R.id.mapsButton);
//        final ImageButton portalButton = (ImageButton) findViewById(R.id.portalButton);
//        final ImageButton linkinButton = (ImageButton) findViewById(R.id.linkinButton);
//        final ImageButton gplusButton = (ImageButton) findViewById(R.id.gplusButton);
//        final ImageButton twitButton = (ImageButton) findViewById(R.id.twitButton);
//        final ImageButton fbButton = (ImageButton) findViewById(R.id.fbButton);
//        final ImageButton libraryButton = (ImageButton) findViewById(R.id.libraryButton);
//        final ImageButton youtButton = (ImageButton) findViewById(R.id.youtButton);

//        emailButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//            }
//        });

        setContentView(R.layout.activity_main);

    }


//    private void setOnClick(final Button btn, final String str){
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View aView) {
//
//                parseToWebView(aView);
//
//            }
//        });
//    }

    public class NewOnClickListener implements View.OnClickListener
    {

        String urlToParse;
        public NewOnClickListener(int myLovelyVariable) {
            this.urlToParse = urlToParse;
        }

        @Override
        public void onClick(View aView)
        {
            parseToWebView(aView);
        }

    };

    public void parseToWebView (View aView)
    {

        final ImageButton studyOptionsButton = (ImageButton) findViewById(R.id.studyOptionsButton);
        final ImageButton ITSupportButton = (ImageButton) findViewById(R.id.ITSupportButton);
        final ImageButton aboutUnitecButton = (ImageButton) findViewById(R.id.aboutUnitecButton);
        final ImageButton portalButton = (ImageButton) findViewById(R.id.portalButton);
        final ImageButton linkinButton = (ImageButton) findViewById(R.id.linkinButton);
        final ImageButton gplusButton = (ImageButton) findViewById(R.id.gplusButton);
        final ImageButton twitButton = (ImageButton) findViewById(R.id.twitButton);
        final ImageButton fbButton = (ImageButton) findViewById(R.id.fbButton);
        final ImageButton libraryButton = (ImageButton) findViewById(R.id.libraryButton);
        final ImageButton youtButton = (ImageButton) findViewById(R.id.youtButton);

        Intent intent = new Intent(this, WebViewActivity.class);
        String url = "http://unitec.ac.nz";
        if (aView == studyOptionsButton){
            url = "http://www.unitec.ac.nz/career-and-study-options";
        }
        else if (aView == ITSupportButton){
            url = "http://www.unitec.ac.nz/current-students/services-and-facilities/it-support";
        }
        else if (aView == aboutUnitecButton){
            url = "http://unitec.ac.nz/about-us";
        }
        else if (aView == portalButton){
            url = "https://myportal.unitec.ac.nz/welcome";
        }
        else if (aView == linkinButton){
            url = "http://www.linkedin.com/groups?home=&gid=1039787";
        }
        else if (aView == gplusButton){
            url = "https://plus.google.com/+unitecnz";
        }
        else if (aView == twitButton){
            url = "http://www.twitter.com/UnitecStudents";
        }
        else if (aView == fbButton){
            url = "https://www.facebook.com/UnitecNZ";
        }
        else if (aView == libraryButton){
            url = "http://library.unitec.ac.nz/";
        }
        else if (aView == youtButton){
            url = "http://www.youtube.com/user/UnitecNZ";
        }
        intent.putExtra(EXTRA_MESSAGE, url);
        startActivity(intent);

    }

    public void sendEmail (View aView)
    {

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "study@unitec.ac.nz");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Please enter your query subject here.");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Please enter your query here.");

        startActivity(Intent.createChooser(emailIntent, "Send Email"));

    }

    public void sendPhone (View aView)
    {

        String phoneNum = "0800109510";

        String uri = "tel:" + phoneNum.trim() ;
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
        phoneIntent.setData(Uri.parse(uri));
        startActivity(phoneIntent);

        startActivity(Intent.createChooser(phoneIntent, "Make Call to 0800 Number"));

    }

    public void sendMaps (View aView)
    {
    Intent intent = new Intent(this, MapActivity.class);
    startActivity(intent);
    }
}
