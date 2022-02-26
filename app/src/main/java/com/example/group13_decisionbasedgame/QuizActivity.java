package com.example.group13_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton buttonA, buttonB, buttonC, buttonD;
    ImageView questionImage;
    TextView question, choiceA, choiceB, choiceC, choiceD;

    int questionNum = 1;
    int houseScore = 0;
    String a;
    String b;
    String c;
    String d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hides Title Bar and Action Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_quiz);


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

        setQuestion();
    }

    //this method sets the question
    public void setQuestion(){
        if (questionNum == 1) {

            question.setText("A bright, green light can be seen emitting\n " +
                    "from within the Forbidden Forest... \n" +
                    "Would you dare approach it? ");

            choiceA.setText("Maybe, if I am not alone.");
            choiceB.setText("No! I don’t break \n school rules.");
            choiceC.setText("Yes, its power might \n be useful.");
            choiceD.setText("Yes, it must be investigated \n at once.");

            questionImage.setImageResource(R.drawable.ui_1_art);

            a = "Hufflepuff";
            b = "Ravenclaw";
            c = "Slytherin";
            d = "Gryffindor";

        }
        if (questionNum == 2) {

            question.setText("The students of Hogwarts start a food\n " +
                    "fight inside the Great Hall. \n" +
                    "Do you participate? ");

            choiceA.setText("No, it is a waste of time \n and effort.");
            choiceB.setText("No, I’m starving.");
            choiceC.setText("Yes! \n *Throws a potato*");
            choiceD.setText("Yes, everyone else is \n doing it.");

            questionImage.setImageResource(R.drawable.ui_2_art);

            a = "Slytherin";
            b = "Ravenclaw";
            c = "Gryffindor";
            d = "Hufflepuff";
        }
    }

    //computes house score for choice A
    public void setHouseScoreA(){
        if (a == "Gryffindor"){
            houseScore += 1;
        } if (a == "Hufflepuff"){
            houseScore += 2;
        } if (a == "Ravenclaw"){
            houseScore += 3;
        } if (a == "Slytherin"){
            houseScore += 4;
        }
        questionNum ++;
    }

    //computes house score for choice B
    public void setHouseScoreB(){
        if (b == "Gryffindor"){
            houseScore += 1;
        } if (b == "Hufflepuff"){
            houseScore += 2;
        } if (b == "Ravenclaw"){
            houseScore += 3;
        } if (b == "Slytherin"){
            houseScore += 4;
        }
        questionNum ++;
    }

    //computes house score for choice C
    public void setHouseScoreC(){
        if (c == "Gryffindor"){
            houseScore += 1;
        } if (c == "Hufflepuff"){
            houseScore += 2;
        } if (c == "Ravenclaw"){
            houseScore += 3;
        } if (c == "Slytherin"){
            houseScore += 4;
        }
        questionNum ++;
    }

    //computes house score for choice D
    public void setHouseScoreD(){
        if (d == "Gryffindor"){
            houseScore += 1;
        } if (d == "Hufflepuff"){
            houseScore += 2;
        } if (d == "Ravenclaw"){
            houseScore += 3;
        } if (d == "Slytherin"){
            houseScore += 4;
        }
        questionNum ++;
    }

    @Override
    public void onClick(View v){

        //button functions here
        switch (v.getId()) {
            case R.id.buttonA:
                setHouseScoreA();
                setQuestion();
                break;
            case R.id.buttonB:
                setHouseScoreB();
                setQuestion();
                break;
            case R.id.buttonC:
                setHouseScoreC();
                setQuestion();
                break;
            case R.id.buttonD:
                setHouseScoreD();
                setQuestion();
                break;
        }
    }
}