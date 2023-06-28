package com.example.homepage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class FirstFloor extends AppCompatActivity {

    ImageView firstFloorImg;
    ImageButton logo;
    ImageButton toiletbtn;
    ImageButton printbtn;
    ImageButton quietbtn;
    ImageButton coffeebtn;
    ImageButton stairsbtn;
    Button groundFloor;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_floor);
        setSupportActionBar();

        logo = (ImageButton) findViewById(R.id.logo);

        logo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstFloor.this, MainActivity.class);
                startActivity(intent);
            }
        });

        groundFloor = (Button) findViewById(R.id.groundFloor);

        groundFloor.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                /*Intent i = new Intent(FirstFloor.this, Map.class);
                startActivity(i);*/
                finish();
            }
        });
    }

    private void setSupportActionBar() {

        firstFloorImg = findViewById(R.id.firstFloorImg);


        toiletbtn = findViewById(R.id.toiletbtn);
        printbtn = findViewById(R.id.printbtn);
        quietbtn = findViewById(R.id.quietbtn);
        coffeebtn = findViewById(R.id.coffeebtn);
        stairsbtn = findViewById(R.id.stairsbtn);

        toiletbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstFloorImg.setImageResource(R.mipmap.first_floor_toilets);
            }
        });

        printbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstFloorImg.setImageResource(R.mipmap.first_floor_print);
            }
        });

        quietbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstFloorImg.setImageResource(R.mipmap.first_floor_break);
            }
        });

        coffeebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstFloorImg.setImageResource(R.mipmap.first_floor_coffee);
            }
        });
        stairsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstFloorImg.setImageResource(R.mipmap.first_floor_stairs);
            }
        });
    }

}
