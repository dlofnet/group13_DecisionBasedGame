package com.example.group13_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView imgBegin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hides Title Bar and Action Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        //initialize
        imgBegin = findViewById(R.id.imgBegin);

        //set listener
        imgBegin.setOnClickListener(this);
    }

    public void startQuiz(){
        Intent i = new Intent(this, QuizActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.intent_fade_in, R.anim.intent_fade_out);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.imgBegin:
                startQuiz();
                break;
        }
    }
}