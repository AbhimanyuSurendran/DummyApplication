package com.example.dummyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class issue1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue1);
        getSupportActionBar().setTitle("Problem Related To Transcript");
    }

    public void back(View view) {
        Toast.makeText(this, "Moving Back To Issue Page", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,page2.class));
    }
}