package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        about = findViewById(R.id.button2);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchAbout1();
            }
        });

    }

    private void switchAbout1(){
        Intent AboutIntent = new Intent(AboutActivity.this, MainActivity.class);
        startActivity(AboutIntent);
    }
}