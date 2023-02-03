package com.example.dummyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class forgot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        getSupportActionBar().setTitle("Forgot Password");
    }

    public void back(View view) {
        Toast.makeText(this, "Your Password Has Been Reset", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,MainActivity.class));
    }
}