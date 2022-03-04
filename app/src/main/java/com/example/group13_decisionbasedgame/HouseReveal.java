package com.example.group13_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.group13_decisionbasedgame.R;
import com.example.group13_decisionbasedgame.Score;

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
            houseBanner.setImageResource(R.drawable.slytherin);
            hogwartsHouse.setText("If the Sorting Hat placed you in this noble house, " +
                    "then you are most likely ambitious, shrewd and possibly destined for greatness. " +
                    "We can imagine you’re the kind of person who is always one step ahead, " +
                    "has a dark sense of humour, takes pride in their appearance and doesn’t let " +
                    "anyone see their soft side.");
        } if (finalScore < 31) {
            houseBanner.setImageResource(R.drawable.ravenclaw);
            hogwartsHouse.setText("The Sorting Hat would only put you in this house if you " +
                    "demonstrated excellent wisdom, wit and a skill for learning. Ravenclaws " +
                    "are often known for being quite eccentric and most of the great wizarding " +
                    "inventors and innovators have come from this house.");
        } if (finalScore < 22) {
            houseBanner.setImageResource(R.drawable.hufflepuff);
            hogwartsHouse.setText("If you were lucky enough to be sorted into this house, " +
                    "we can imagine you’re the type of person who has a strong moral compass, " +
                    "always works hard, is the most loyal friend, knows it is the taking part " +
                    "that counts and always has the best snacks.");
        } if (finalScore < 13) {
            houseBanner.setImageResource(R.drawable.gryffindor);
            hogwartsHouse.setText("If the Sorting Hat placed you here, you would have demonstrated " +
                    "qualities like courage, bravery and determination. We imagine you’re the type " +
                    "of person who likes to stand up for the little guy, challenges authority, has " +
                    "a tendency to act first and think later.");
        }
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