package com.example.group13_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class HouseReveal extends AppCompatActivity {

    //initializing
    TextView hogwartsHouse;
    ImageView houseBanner;

    //House Score register
    Score score = new Score();

    ///////////////// problem here: instead of showing fully computed score,
    ///////////////// getPlayerHouse() just returns '0'
    int finalScore = score.getPlayerHouse();

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

        //condition for the player's House Reveal
        if (finalScore < 37) {
            hogwartsHouse.setText("Slytherin ");
        } if (finalScore < 31) {
            hogwartsHouse.setText("Ravenclaw ");
        } if (finalScore < 22) {
            hogwartsHouse.setText("Hufflepuff ");
        } if (finalScore < 13) {
            hogwartsHouse.setText("Gryffindor ");
        }
    }
}