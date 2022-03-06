package com.example.group13_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class SlytherinHouse extends AppCompatActivity {

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

        houseBanner.setImageResource(R.drawable.slytherin);
        hogwartsHouse.setText("If the Sorting Hat placed you in this noble house, " +
                "then you are most likely ambitious, shrewd and possibly destined for greatness. " +
                "We can imagine you’re the kind of person who is always one step ahead, " +
                "has a dark sense of humour, takes pride in their appearance and doesn’t let " +
                "anyone see their soft side.");
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