package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    //Definerar knappen about
    Button about;



    private ArrayList<RecyclerViewItem> mountains = new ArrayList<>();
    private RecyclerViewAdapter adapter;

    private final String JSON_FILE = "mountains.json";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mountains = new ArrayList<>(Arrays.asList(
            new RecyclerViewItem("Matterhorn"),
            new RecyclerViewItem("Mont Blanc"),
            new RecyclerViewItem("Denali")
        ));



        adapter = new RecyclerViewAdapter(this, mountains, new RecyclerViewAdapter.OnClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        RecyclerView view = findViewById(R.id.recycler_view);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);

        new JsonFile(this, this).execute(JSON_FILE);



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

    @Override
    public void onPostExecute(String json) {

        Gson gson = new Gson();

        // Unmarshall JSON -> list of objects
        Type type = new TypeToken<List<mountain>>() {}.getType();
        List<mountain> listOfMountains = gson.fromJson(json, type);

        for(mountain mountain : listOfMountains){

            mountains.add(new RecyclerViewItem(mountain.getName()));

        }


        adapter.notifyDataSetChanged();

    }

}
