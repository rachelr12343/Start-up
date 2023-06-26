package com.example.homepage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class map extends AppCompatActivity {

    ImageButton logo;
    ImageView imageView;
    ImageButton toiletbtn;
    ImageButton printbtn;
    ImageButton quietbtn;
    ImageButton coffeebtn;
    Button funbtn;
    ImageButton stairsbtn;
    ImageView funImg;
    Button firstFloor;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        logo = (ImageButton) findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(map.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imageView = findViewById(R.id.imageView);
        toiletbtn = findViewById(R.id.toiletbtn);
        printbtn = findViewById(R.id.printbtn);
        quietbtn = findViewById(R.id.quietbtn);
        coffeebtn = findViewById(R.id.coffeebtn);
        stairsbtn = findViewById(R.id.stairsbtn);
        funbtn = findViewById(R.id.buttonBroc);
        funImg = findViewById(R.id.imageBroggle);

        toiletbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.mipmap.main_layout_toilets);
            }
        });

        printbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.mipmap.main_layout_print);
            }
        });

        quietbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.mipmap.main_layout_quiet);
            }
        });
        coffeebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.mipmap.main_layout_coffee);
            }
        });
        stairsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.mipmap.main_layout_stairs);
            }
        });

        firstFloor = (Button) findViewById(R.id.firstFloor);

        firstFloor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openFirstFloor();
        }
        });
        funbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (funImg.getVisibility() == View.VISIBLE)
                    funImg.setVisibility(View.GONE);
                else {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            funImg.setVisibility(View.GONE);
                        }
                    }, 1000);
                    funImg.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void openFirstFloor() {
        Intent intent = new Intent(map.this,FirstFloor.class);
        startActivity(intent);
    }
    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }
}


