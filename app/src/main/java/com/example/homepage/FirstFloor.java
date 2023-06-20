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
    ImageButton logo;
    ImageButton toiletbtn;
    ImageButton printbtn;
    ImageButton quietbtn;
    ImageButton coffeebtn;
    ImageButton stairsbtn;
    ImageView firstFloorImg;
    Button groundFloor;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceSate) {
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.first_floor);

        groundFloor.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                openMap();
            }
        });
    }
    public void openMap() {
        Intent intent = new Intent(FirstFloor.this, Map.class);
        startActivity(intent);

        logo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstFloor.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void setSupportActionBar() {

        firstFloorImg = (ImageView) findViewById(R.id.firstFloorImg);

        toiletbtn = (ImageButton) findViewById(R.id.toiletbtn);
        printbtn = (ImageButton) findViewById(R.id.printbtn);
        quietbtn = (ImageButton) findViewById(R.id.quietbtn);
        coffeebtn = (ImageButton) findViewById(R.id.coffeebtn);
        stairsbtn = (ImageButton) findViewById(R.id.stairsbtn);

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
