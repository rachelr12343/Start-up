package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class FAQ extends AppCompatActivity {

    Button questionOne;
    TextView answerOne;
    Button questionTwo;
    TextView answerTwo;
    Button questionThree;
    TextView answerThree;
    Button questionFour;
    TextView answerFour;
    ImageButton homeBtn;
    Button buttonMan;
    ImageView imageMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        questionOne = findViewById(R.id.button1);
        answerOne = findViewById(R.id.answer1);
        questionTwo = findViewById(R.id.button2);
        answerTwo = findViewById(R.id.answer2);
        questionThree = findViewById(R.id.button3);
        answerThree = findViewById(R.id.answer3);
        questionFour = findViewById(R.id.button4);
        answerFour = findViewById(R.id.answer4);
        homeBtn = findViewById(R.id.FAQimageBtn);
        buttonMan = findViewById(R.id.buttonOran);
        imageMan = findViewById(R.id.imageOran);

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FAQ.this, MainActivity.class);
                startActivity(intent);
            }
        });

        questionOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answerOne.getVisibility()==View.VISIBLE)
                    answerOne.setVisibility(View.INVISIBLE);
                else {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            answerOne.setVisibility(View.INVISIBLE);
                        }
                    }, 60000);
                    answerOne.setVisibility(View.VISIBLE);
                }
            }
        });

        questionTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answerTwo.getVisibility()==View.VISIBLE)
                    answerTwo.setVisibility(View.INVISIBLE);
                else {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            answerTwo.setVisibility(View.INVISIBLE);
                        }
                    }, 60000);
                    answerTwo.setVisibility(View.VISIBLE);
                }
            }
        });

        questionThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answerThree.getVisibility()==View.VISIBLE)
                    answerThree.setVisibility(View.INVISIBLE);
                else {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            answerThree.setVisibility(View.INVISIBLE);
                        }
                    }, 60000);
                    answerThree.setVisibility(View.VISIBLE);
                }
            }
        });

        questionFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answerFour.getVisibility()==View.VISIBLE)
                    answerFour.setVisibility(View.INVISIBLE);
                else {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            answerFour.setVisibility(View.INVISIBLE);
                        }
                    }, 60000);
                    answerFour.setVisibility(View.VISIBLE);
                }
            }
        });

        buttonMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imageMan.getVisibility() == View.VISIBLE)
                    imageMan.setVisibility(View.GONE);
                else {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            imageMan.setVisibility(View.GONE);
                        }
                    }, 1000);
                    imageMan.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(FAQ.this, MainActivity.class);
        startActivity(intent);
}}