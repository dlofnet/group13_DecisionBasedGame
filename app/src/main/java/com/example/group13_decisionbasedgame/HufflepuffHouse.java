package com.example.group13_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class HufflepuffHouse extends AppCompatActivity {

    //initializing
    TextView hogwartsHouse;
    ImageView houseBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hides Title Bar and Action Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_house_reveal);

        hogwartsHouse = findViewById(R.id.hogwartsHouse);
        houseBanner = findViewById(R.id.houseBanner);

        houseBanner.setImageResource(R.drawable.hufflepuff);
        hogwartsHouse.setText("If you were lucky enough to be sorted into this house, " +
                "we can imagine you’re the type of person who has a strong moral compass, " +
                "always works hard, is the most loyal friend, knows it is the taking part " +
                "that counts and always has the best snacks.");
    }

    //sets animation for 'back'
    public void onBackPressed(){
        super.onBackPressed();

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

        overridePendingTransition(R.anim.intent_fade_in, R.anim.intent_fade_out);
        overridePendingTransition(R.anim.intent_fade_in, R.anim.intent_fade_out);
    }
}