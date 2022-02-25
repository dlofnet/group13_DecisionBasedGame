package com.example.group13_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton buttonA, buttonB, buttonC, buttonD;
    ImageView questionImage;
    TextView question, choiceA, choiceB, choiceC, choiceD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hides Title Bar and Action Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        //initialize
        questionImage = findViewById(R.id.questionImage);
        question = findViewById(R.id.question);
        choiceA = findViewById(R.id.choiceA);
        choiceB = findViewById(R.id.choiceB);
        choiceC = findViewById(R.id.choiceC);
        choiceD = findViewById(R.id.choiceD);
        buttonA = findViewById(R.id.buttonA);
        buttonB = findViewById(R.id.buttonB);
        buttonC = findViewById(R.id.buttonC);
        buttonD = findViewById(R.id.buttonD);

        //set listeners here
        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonD.setOnClickListener(this);

        //setting question text for trial (will be moved to if statements later)
        question.setText("A bright, green light can be seen emitting\n " +
                "from within the Forbidden Forest... \n" +
                "Would you dare approach it? ");

        //setting choices for UI trial (will be moved to if statements or methods later)
        choiceA.setText("Maybe, if I am not alone.");
        choiceB.setText("No! I don’t break \n school rules.");
        choiceC.setText("Yes, its power might \n be useful.");
        choiceD.setText("Yes, it must be investigated \n at once.");

    }

    @Override
    public void onClick(View v){

        //button functions here
        switch (v.getId()) {
            case R.id.buttonA:
                question.setText("it's working ahahahahahahhahahaha!!!");
                break;
        }
    }
}