package com.example.homepage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    LinearLayout chat;
    Button logoutBtn;
    LinearLayout map;
    LinearLayout faq;
    LinearLayout menu;
    Button oranBtn;
    ImageView oranPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chat = findViewById(R.id.chatButton);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Chat.class);
                startActivity(intent);            }
        });

        map = findViewById(R.id.mapButton);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, map.class);
                startActivity(intent);
            }
        });

        menu = findViewById(R.id.menuButton);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, menu.class);
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

        ImageButton map = (ImageButton)findViewById(R.id.imageButton3);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, map.class));
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