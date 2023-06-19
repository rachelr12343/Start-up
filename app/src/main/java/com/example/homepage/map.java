package com.example.homepage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
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

    ImageButton stairsbtn;

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

        firstFloor = (Button) findViewById(R.id.firstFloor);

        firstFloor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openFirstFloor();
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
        inflater.inflate(R.menu.bottom_navigation, menu);
        return true;
    }

    private void setSupportActionBar() {

        imageView = findViewById(R.id.imageView);


        toiletbtn = (ImageButton) findViewById(R.id.toiletbtn);
        printbtn = (ImageButton) findViewById(R.id.printbtn);
        quietbtn = (ImageButton) findViewById(R.id.quietbtn);
        coffeebtn = (ImageButton) findViewById(R.id.coffeebtn);
        stairsbtn = (ImageButton) findViewById(R.id.stairsbtn);

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
    }
}


