package com.example.brandon.ispy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.PopupMenu;

public class MainActivity extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button About_btn = (Button) findViewById(R.id.AboutBT);
        Button FeedR_btn = (Button) findViewById(R.id.FeedB);
        Button FeedA_btn = (Button) findViewById(R.id.AddFeed);

        FeedR_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, VideoOptions.class));

            }

        });

        About_btn.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, About.class));

            }


        });
        FeedA_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, NewFeed.class));

            }

        });

    }

}







