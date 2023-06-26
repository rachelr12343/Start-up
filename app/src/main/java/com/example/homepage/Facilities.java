package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Facilities extends AppCompatActivity {

    ImageButton BackFromFacilities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);

        BackFromFacilities = findViewById(R.id.noMoreFacilities);
        BackFromFacilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facilities.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}