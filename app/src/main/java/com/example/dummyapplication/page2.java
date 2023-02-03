package com.example.dummyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        getSupportActionBar().setTitle("SELECT YOUR ISSUE");
    }


    public void back(View view) {
        Toast.makeText(this, "Moving Back To Main Page", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,MainActivity.class));
    }

    public void issue1(View view) {
        Toast.makeText(this, "Opening This Issue", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,issue1.class));
    }

    public void issue2(View view) {
        Toast.makeText(this, "Opening This Issue", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,issue2.class));
    }

    public void issue3(View view) {
        Toast.makeText(this, "Opening This Issue", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,issue3.class));
    }

    public void issue4(View view) {
        Toast.makeText(this, "Opening This Issue", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,issue4.class));
    }
}