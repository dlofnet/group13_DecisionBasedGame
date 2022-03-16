package com.example.group13_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class RavenclawHouse extends AppCompatActivity {

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

        houseBanner.setImageResource(R.drawable.ravenclaw);
        hogwartsHouse.setText("The Sorting Hat would only put you in this house if you " +
                "demonstrated excellent wisdom, wit and a skill for learning. Ravenclaws " +
                "are often known for being quite eccentric and most of the great wizarding " +
                "inventors and innovators have come from this house.");
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