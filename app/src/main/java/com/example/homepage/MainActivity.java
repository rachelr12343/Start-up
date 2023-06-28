package com.example.homepage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    LinearLayout web;
    Button logoutBtn;
    LinearLayout map;
    LinearLayout faq;
    Button oranBtn;
    ImageView oranPic;
    Button firstDayBtn;
    LinearLayout aboutUs;
    LinearLayout facilities;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = findViewById(R.id.chatButton);

        web.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view)  {
                gotoUrl( "https://www.teams.com");
            }

            void gotoUrl(String s){
                try{
                    Uri uri = Uri.parse (s);
                    startActivity(new Intent(Intent.ACTION_VIEW, uri));
                }
                catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "No Website Linked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        facilities = findViewById(R.id.facilitiesBtn);
        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Facilities.class);
                startActivity(intent);
            }
        });

        aboutUs = findViewById(R.id.aboutUsBtn);
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutUs.class);
                startActivity(intent);
            }
        });

        firstDayBtn = findViewById(R.id.guideBtn);
        firstDayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, firstDay.class);
                startActivity(intent);
            }
        });




        map = findViewById(R.id.mapButton);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, map.class);
                startActivity(intent);
            }
        });

        faq = findViewById(R.id.faqButton);
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FAQ.class);
                startActivity(intent);
            }
        });

        logoutBtn = findViewById(R.id.logoutBtn);

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("remember", "false");
                editor.apply();
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });

        oranBtn = findViewById(R.id.oranFaceBtn);
        oranPic = findViewById(R.id.oranFaceImage);
        oranBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oranPic.getVisibility() == View.VISIBLE)
                    oranPic.setVisibility(View.GONE);
                else {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            oranPic.setVisibility(View.GONE);
                        }
                    }, 1000);
                    oranPic.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}


