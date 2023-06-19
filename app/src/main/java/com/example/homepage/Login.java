package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends AppCompatActivity {

    EditText email;
    EditText password;
    CheckBox remember;
    Button login;
    ImageView image;
    ImageView spongeImage;
    Button batButton;
    Button spongeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);
        remember = findViewById(R.id.rememberMe);
        login = findViewById(R.id.loginBtn);
        image = findViewById(R.id.imageBatman);
        batButton = findViewById(R.id.batBtn);
        spongeButton = findViewById(R.id.spongeBtn);
        spongeImage = findViewById(R.id.imageSponge);

        SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
        String checkbox = preferences.getString("remember", "");

        if (checkbox.equals("true")) {
            Intent intent = new Intent(Login.this, HomePageActivity.class);
            startActivity(intent);
        } else if (checkbox.equals("false")) {
            Toast.makeText(this, "Please Sign In", Toast.LENGTH_SHORT).show();
        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailInput = email.getText().toString().trim();
                String passwordInput = password.getText().toString().trim();

                if (passwordInput.isEmpty() || passwordInput.length() < 6) {
                    password.setError("Password cannot be less than 6 characters");
                    return;
                }

                if (emailInput.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(emailInput).matches() || !isValidEmail(emailInput)) {
                    email.setError("Invalid email address");
                    return;
                }
                Intent intent = new Intent(Login.this, HomePageActivity.class);
                startActivity(intent);
            }
        });
    }

    public boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@ericsson.com$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    protected void onResume() {
        super.onResume();

        remember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked()) {
                    SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("remember", "true");
                    editor.apply();
                    Toast.makeText(Login.this, "Checked", Toast.LENGTH_SHORT).show();
                } else if (!compoundButton.isChecked()) {
                    SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("remember", "false");
                    editor.apply();
                    Toast.makeText(Login.this, "Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        batButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image.getVisibility() == View.VISIBLE)
                    image.setVisibility(View.GONE);
                else {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            image.setVisibility(View.GONE);
                        }
                    }, 200);
                    image.setVisibility(View.VISIBLE);
                }
            }
        });

        spongeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spongeImage.getVisibility() == View.VISIBLE)
                    spongeImage.setVisibility(View.GONE);
                else {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            spongeImage.setVisibility(View.GONE);
                        }
                    }, 200);
                    spongeImage.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}