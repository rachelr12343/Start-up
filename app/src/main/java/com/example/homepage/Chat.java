package com.example.homepage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Chat extends AppCompatActivity {

    private EditText messageEditText;
    private Button sendButton;
    private TextView chatTextView;
    ImageButton logo;

    private StringBuilder chatHistory;
    ImageButton homeButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        messageEditText = findViewById(R.id.message_edit_text);
        sendButton = findViewById(R.id.send_button);
        chatTextView = findViewById(R.id.chat_text_view);
        chatHistory = new StringBuilder();

        logo = (ImageButton)

                findViewById(R.id.logo);

        logo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chat.this, MainActivity.class);
                startActivity(intent);
            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = messageEditText.getText().toString();
                sendMessage(message);
            }
        });

        if (savedInstanceState != null) {
            String savedChatHistory = savedInstanceState.getString("chatHistory");
            if (savedChatHistory != null) {
                chatHistory = new StringBuilder(savedChatHistory);
                chatTextView.setText(chatHistory.toString());
            }
        }
    }

    private void sendMessage(String message) {
        String previousChat = chatTextView.getText().toString();
        String newChat = previousChat + "\nYou: " + message;
        chatTextView.setText(newChat);

        chatHistory.append("You: ").append(message).append("\n");

        // Simulating the other user's response
        String response = generateResponse(message);
        newChat = chatTextView.getText().toString() + "\nOther User: " + response;
        chatTextView.setText(newChat);

        chatHistory.append("Other User: ").append(response).append("\n");

        // Clear the message EditText
        messageEditText.getText().clear();
    }

    private String generateResponse(String message) {
        // Replace this with your logic to generate the chatbot's response
        return "This is the chatbot's response to: " + message;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("chatHistory", chatHistory.toString());
    }
    public void openMainActivity(){
        Intent intent = new Intent(Chat.this, MainActivity.class);
        startActivity(intent);
}}
