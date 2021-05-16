package com.android.a87answerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import org.buraktamturk.answerview.AnswerView;

public class MainActivity extends AppCompatActivity {

    AnswerView answerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerView = (AnswerView) findViewById(R.id.answerView);
        answerView.setNumber(1);
        answerView.setOnAnswerChange(new AnswerView.OnAnswerChange() {
            @Override
            public void onAnswerChange(AnswerView view, int index) {
                Toast.makeText(MainActivity.this, "Answer change to "+view.getActiveChar(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}