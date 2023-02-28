package com.example.myluckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class LuckyNumberActivity extends AppCompatActivity {
    TextView textViewLuckyText, textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);

        textViewLuckyText = findViewById(R.id.textView_lucky_text);
        textViewResult = findViewById(R.id.textView_result);

        int randomNumber = generateRandomNumber();

        textViewResult.setText("" + randomNumber);

    }

    public int generateRandomNumber() {
        Random random = new Random();
        int upper_limit = 1000;

        return random.nextInt(upper_limit);
    }
}