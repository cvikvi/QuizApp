package com.example.android.quizapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void scoreQuiz(View view) {

        int numberCorrect = 0; // the number of questions that were answered correctly

        int score; // The Overall score of the quiz

        CheckBox questionOneAnswerTwo = findViewById(R.id.question_one_checkbox_two);
        CheckBox questionOneAnswerThree = findViewById(R.id.question_one_checkbox_three);
        CheckBox questionOneAnswerFour = findViewById(R.id.question_one_checkbox_four);

        RadioButton questionTwoAnswer = findViewById(R.id.question_two_answer_one);
        RadioButton questionThreeAnswer = findViewById(R.id.question_three_answer_two);
        EditText questionFourAnswer = findViewById(R.id.question_four_answer);


        // Checks if Question 1 is correct. Answers (2-4)

        if (questionOneAnswerTwo.isChecked() || questionOneAnswerThree.isChecked() || questionOneAnswerFour.isChecked()) {

            numberCorrect += 1;

        }


        // Check Question 2 to see if Mexico City is selected 'A'


        if (questionTwoAnswer.isChecked()) {

            numberCorrect += 1;
        }


        // Check Question 3 to see if 'Mario' is selected 'B'


        if (questionThreeAnswer.isChecked()) {

            numberCorrect += 1;
        }


        // Check Question 4 to see if '1' was entered


        if (questionFourAnswer.getText().toString().equals("1")) {

            numberCorrect += 1;
        }

        score = (int) (((double) numberCorrect / 4) * (double) 100);


        //Show Toast Message with Score

        Toast.makeText(MainActivity.this, getString(R.string.gradingText, numberCorrect, 4, score),
                Toast.LENGTH_LONG).show();



    }





}
