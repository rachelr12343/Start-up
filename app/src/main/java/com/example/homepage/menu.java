package com.example.homepage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Map;

public class menu extends AppCompatActivity {
    ImageButton logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        logo = (ImageButton)

                findViewById(R.id.logo);

        logo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void openMainActivity() {
        Intent intent = new Intent(menu.this, MainActivity.class);
        startActivity(intent);
    }


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.example_menu, menu);
            return true;
        }
        public void openNewActivity () {
            Intent intent = new Intent(menu.this, Chat.class);
            startActivity(intent);
        }

        @Override
        public boolean onOptionsItemSelected (@NonNull MenuItem item){
            int itemId = item.getItemId();
            if (itemId == R.id.item1) {
                Toast.makeText(this, "Login / Register selected", Toast.LENGTH_SHORT).show();
                return true;
            } else if (itemId == R.id.item2) {
                Toast.makeText(this, "Map selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(menu.this, Map.class);
                startActivity(intent);
            } else if (itemId == R.id.item3) {
                Toast.makeText(this, "Chat selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(menu.this, Chat.class);
                startActivity(intent);
                return true;
            } else if (itemId == R.id.item4) {
                Toast.makeText(this, "Canteen Menu selected", Toast.LENGTH_SHORT).show();
                return true;
            }
            return super.onOptionsItemSelected(item);

        }
    }


