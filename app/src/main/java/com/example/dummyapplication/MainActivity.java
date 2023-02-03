package com.example.dummyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("LOGIN PAGE");
    }

    public void login(View view) {
        Toast.makeText(this, "You Have Been Successfully Logged In", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,page2.class));
    }

    public void forgot(View view) {
        Toast.makeText(this, "Forgot Password", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,forgot.class));
    }

    public void web(View view) {
        Toast.makeText(this, "Opening Official Website", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://adypu.edu.in/")));
    }
}