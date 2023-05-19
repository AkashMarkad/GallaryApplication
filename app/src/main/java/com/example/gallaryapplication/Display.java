package com.example.gallaryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Display extends AppCompatActivity {


    private ImageView imageView;
    private TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.title);

        Intent intent = getIntent();

        imageView.setImageResource(intent.getIntExtra("image", 0));
        textView.setText(intent.getStringExtra("title"));
    }
}