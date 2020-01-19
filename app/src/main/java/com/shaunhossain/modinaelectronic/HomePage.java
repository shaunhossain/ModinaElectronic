package com.shaunhossain.modinaelectronic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity implements View.OnClickListener {
    Button mdashboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mdashboard = findViewById(R.id.dashboard);

        mdashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(HomePage.this,AddDetails.class);
        startActivity(intent);
    }
}
