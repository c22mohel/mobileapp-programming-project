package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //Definerar knappen about
    Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //länkar about button med ID
        about = findViewById(R.id.AboutButton);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchAbout();
            }
        });
    }

    private void switchAbout(){
        Intent AboutIntent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(AboutIntent);
    }

}
