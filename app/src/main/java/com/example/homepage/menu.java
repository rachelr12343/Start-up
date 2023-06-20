package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Map;

public class menu extends AppCompatActivity {
    ImageButton logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void openMainActivity() {
        Intent intent = new Intent(menu.this, MainActivity.class);
        startActivity(intent);
    }

}

