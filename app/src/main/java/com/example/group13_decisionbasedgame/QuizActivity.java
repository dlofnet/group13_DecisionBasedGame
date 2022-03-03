package com.example.group13_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton buttonA, buttonB, buttonC, buttonD;
    ImageView questionImage, choices;
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

        //initialize variables
        questionImage = findViewById(R.id.questionImage);
        question = findViewById(R.id.question);
        choiceA = findViewById(R.id.choiceA);
        choiceB = findViewById(R.id.choiceB);
        choiceC = findViewById(R.id.choiceC);
        choiceD = findViewById(R.id.choiceD);
        choices = findViewById(R.id.choices);
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

    //House Score register
    Score score = new Score();

    //this method sets the question
    public void setQuestion(){
        if (questionNum == 1) {

            question.setText("A bright, green light can be seen emitting\n " +
                    "from within the Forbidden Forest... \n" +
                    "Would you dare approach it? ");
            questionImage.setImageResource(R.drawable.ui_1_art);
            choiceA.setText("Maybe, if I am not alone.");
            choiceB.setText("No! I don’t break \n school rules.");
            choiceC.setText("Yes, its power might \n be useful.");
            choiceD.setText("Yes, it must be investigated \n at once.");
            a = "Hufflepuff";
            b = "Ravenclaw";
            c = "Slytherin";
            d = "Gryffindor";
        }

        if (questionNum == 2) {

            question.setText("The students of Hogwarts start a food\n " +
                    "fight inside the Great Hall. \n" +
                    "Do you participate?");
            choiceA.setText("No, it is a waste of time \n and effort.");
            choiceB.setText("No, I’m starving.");
            choiceC.setText("Yes! \n *Throws a potato*");
            choiceD.setText("Yes, everyone else is \n doing it.");
            questionImage.setImageResource(R.drawable.ui_2_art);
            a = "Slytherin";
            b = "Ravenclaw";
            c = "Gryffindor";
            d = "Hufflepuff";
            fade();
        }

        if (questionNum == 3) {

            question.setText("You are tasked to brew a potion of \n " +
                    "your choice during Potions class. \n" +
                    "Which one would you make?");
            choiceA.setText("Veritaserum\n(liquid luck)");
            choiceB.setText("Amortentia\n(love potion)");
            choiceC.setText("Antidote to\ncommon poisons");
            choiceD.setText("Alihotsy Draught\n(causes laughter)");
            questionImage.setImageResource(R.drawable.ui_3_art);
            a = "Slytherin";
            b = "Hufflepuff";
            c = "Ravenclaw";
            d = "Gryffindor";
            fade();
        }

        if (questionNum == 4) {

            question.setText("On the Hogwarts train, the food trolley \n" +
                    "lady approaches. What snack \n" +
                    "would you buy? ");
            choiceA.setText("Bertie Bott’s\nEvery Flavour Beans");
            choiceB.setText("Pumpkin Pasties");
            choiceC.setText("Chocolate Frogs");
            choiceD.setText("Licorice Wands");
            questionImage.setImageResource(R.drawable.ui_4_art);
            a = "Gryffindor";
            b = "Hufflepuff";
            c = "Ravenclaw";
            d = "Slytherin";
            fade();
        }

        if (questionNum == 5) {

            question.setText("At the end of a dark hallway, \n" +
                    "you hear a low grumbling sound… \n" +
                    "What would you do?");
            choiceA.setText("Draw out my wand and \n approach the sound.");
            choiceB.setText("Leave it be.");
            choiceC.setText("Report it to prefects or \n professors immediately.");
            choiceD.setText("Choose a different route and \n warn other students.");
            questionImage.setImageResource(R.drawable.ui_5_art);
            a = "Gryffindor";
            b = "Slytherin";
            c = "Ravenclaw";
            d = "Hufflepuff";
            fade();
        }

        if (questionNum == 6) {

            question.setText("A muggle confronts you and asks if \n " +
                    "you are a witch or a wizard. \n" +
                    "What would you do?");
            choiceA.setText("Ask what makes them \n think so.");
            choiceB.setText("Agree, and ask whether \n they’d like a jinx.");
            choiceC.setText("Agree and walk away, leaving \n them to wonder whether \n you are bluffing.");
            choiceD.setText("Tell them that you are \nworried about their \nmental health.");
            questionImage.setImageResource(R.drawable.in_the_meantime);
            a = "Hufflepuff";
            b = "Gryffindor";
            c = "Slytherin";
            d = "Ravenclaw";
            fade();
        }

        if (questionNum == 7) {

            question.setText("You and two friends need to cross a bridge guarded by a troll" +
                    " who insists on fighting someone before he" +
                    " will let you pass. What would you do? ");
            choiceA.setText("Attempt to confuse the troll \n into letting all of you  \n pass without fighting.");
            choiceB.setText("Suggest drawing lots.");
            choiceC.setText("Suggest that all of you \n should fight \n (without telling the troll)");
            choiceD.setText("Volunteer to fight.");
            questionImage.setImageResource(R.drawable.in_the_meantime);
            a = "Ravenclaw";
            b = "Hufflepuff";
            c = "Slytherin";
            d = "Gryffindor";
            fade();
        }

        if (questionNum == 8) {

            question.setText("A classmate has cheated in an exam by \n " +
                    "using a Self-Spelling Quill. A professor \n" +
                    "asks you about this. What would you do?");
            choiceA.setText("Lie and say you don’t know.");
            choiceB.setText("Tell the professor to \n ask someone else \n (but tell the truth if they lie)");
            choiceC.setText("Tell the professor \n the truth.");
            choiceD.setText("You will not wait \n to be asked.");
            questionImage.setImageResource(R.drawable.in_the_meantime);
            a = "Hufflepuff";
            b = "Gryffindor";
            c = "Ravenclaw";
            d = "Slytherin";
            fade();
        }

        if (questionNum == 9) {

            question.setText("You get to think about your happiest " +
                    "memory to cast a Patronus spell... \n" +
                    "What would you think of?");
            choiceA.setText("The happiest memory with \n your family and friends");
            choiceB.setText("Successfully being able to \n finish what you have been \n working on");
            choiceC.setText("Being surrounded by your \n favorite foods and snacks");
            choiceD.setText("Teasing your loved ones");
            questionImage.setImageResource(R.drawable.in_the_meantime);
            a = "Hufflepuff";
            b = "Ravenclaw";
            c = "Gryffindor";
            d = "Slytherin";
            fade();
        }

        if (questionNum == 10) {
            /////////////////this is a problem, tho I think it's supposed to work
            score.setPlayerHouse(houseScore);
            /////////////////since the houseScore is computed through each click (choices),
            ///////////////// setPlayerHouse should be able to send the final computation to the Score Class

            //house reveal method is for opening new activity
            houseReveal();
        }
    }

    //sets animation for 'back'
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.intent_fade_in, R.anim.intent_fade_out);
    }

    //following methods are for house computation
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

    //leads to House Reveal
    public void houseReveal(){
        Intent i = new Intent(this, HouseReveal.class);
        startActivity(i);
        overridePendingTransition(R.anim.intent_fade_in, R.anim.intent_fade_out);
    }

    //applies fade before new question
    /////////////////    I only know how to do fade in animation
    public void fade(){
        Animation animIn = AnimationUtils.loadAnimation(this, R.anim.intent_fade_in);
        questionImage.setAnimation(animIn);
        question.setAnimation(animIn);
        choices.setAnimation(animIn);
        choiceA.setAnimation(animIn);
        choiceB.setAnimation(animIn);
        choiceC.setAnimation(animIn);
        choiceD.setAnimation(animIn);
    }

    @Override
    public void onClick(View v){

        //button functions here
        switch (v.getId()) {
            case R.id.buttonA:
                setHouseScoreA();
                setQuestion();
                fade();
                break;
            case R.id.buttonB:
                setHouseScoreB();
                setQuestion();
                fade();
                break;
            case R.id.buttonC:
                setHouseScoreC();
                setQuestion();
                fade();
                break;
            case R.id.buttonD:
                setHouseScoreD();
                setQuestion();
                fade();
                break;
        }
    }
}