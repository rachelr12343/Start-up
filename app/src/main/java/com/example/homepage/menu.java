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
import androidx.appcompat.widget.PopupMenu;

public class menu extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
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
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.example_menu, menu);
            return true;
        }

        @Override
        public boolean onMenuItemClick (@NonNull MenuItem item){
            int itemId = item.getItemId();
            if (itemId == R.id.item1) {
                Toast.makeText(this, "Login / Register selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(menu.this, Login.class);
                startActivity(intent);
                return true;
            } else if (itemId == R.id.item2) {
                Toast.makeText(this, "Map selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(menu.this, map.class);
                startActivity(intent);
                return true;
            } else if (itemId == R.id.item3) {
                Toast.makeText(this, "Chat selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(menu.this, Chat.class);
                startActivity(intent);
                return true;
            } else if (itemId == R.id.item4) {
                Toast.makeText(this, "FAQ selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(menu.this, FAQ.class);
                startActivity(intent);
                return true;
            }
            return super.onOptionsItemSelected(item);
        }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();

    }
}