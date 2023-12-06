package com.example.wisatabekasi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Columbus extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_columbus);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView direct = findViewById(R.id.maps);

        direct.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.maps) {
            String maps = "Columbus Waterpark";
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?q="+maps));
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }
}