package com.example.dummyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        getSupportActionBar().setTitle("Food Menu");
    }

    public void web1(View view) {
        Toast.makeText(this, "Opening Behrouz Biriyani", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.behrouzbiryani.com/?%243p=a_google_adwords&%24always_deeplink=false&lpurl=https%3A%2F%2Fwww.behrouzbiryani.com%2F%3Fgclsrc%3Daw.ds%26&~ad_set_id=121716246120&~campaign_id=12527872230&~channel=g&~keyword=behrouz%20biryani&~placement&gclid=Cj0KCQiA54KfBhCKARIsAJzSrdoxOqn2AG6atN9NvKfZnl_N9FMHhOEMaZX5a25v77porhg0i-vbZnkaAqOlEALw_wcB&gclid=Cj0KCQiA54KfBhCKARIsAJzSrdoxOqn2AG6atN9NvKfZnl_N9FMHhOEMaZX5a25v77porhg0i-vbZnkaAqOlEALw_wcB&gclsrc=aw.ds&_branch_match_id=1151215446028180204&_branch_referrer=H4sIAAAAAAAAA72QUU%2FCMBDHP832YhysY5uYNKbgUJhA0AeVl%2BZYy1YpbVkHFT69m%2FIZTO7l7pf%2F%2FS5XNY2x973ehle1Pl4CMCaQQu16n6s4Gwo2nb0%2FeGgQGQy01LqUnAJzumbWb8cgHZwtZZybLoS3IC33pTnWElfdZi8iHpq05ZwLro6NqM%2BgRFDofceiSVlIWxde9AguYNZDie%2BlGTBqeUMFwyEK0zBBgyRE%2FY4UsDcgSvXHYpTepQhFf6gCpbjEZdfs%2BLk7FF%2B1N1ev3%2Bra5Pirn49XgsSDfDuqxjl5nVoyu7zVTH8vDwqRpwSaxXBxyrdrJeliOJk%2FV8tsDuuPGFB8SlOj66rsi9vTZq12QA5LmZEXR10x%2BidF%2BzT8%2B7Ifn5SGHcUBAAA%3D")));
    }
    public void web2(View view) {
        Toast.makeText(this, "Opening Burger King", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.burgerking.in/")));
    }
    public void web3(View view) {
        Toast.makeText(this, "Opening Indian Coffee House", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.indiancoffeehouse.com/")));
    }
    public void web4(View view) {
        Toast.makeText(this, "Opening Domino's", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.co.in/")));
    }
    public void web5(View view) {
        Toast.makeText(this, "Opening Rolls Mania", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rollsmania.com/")));
    }
    public void web6(View view) {
        Toast.makeText(this, "Opening Sagar Gaire", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sagargairefastfoodcorner.com/")));
    }
}