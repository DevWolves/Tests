package com.devwolves.tests;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int click = 1;

    boolean blueFlag = false;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button randomButton = findViewById(R.id.random_button);
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber = getRandom(0, 100);
                Toast.makeText(MainActivity.this, String.valueOf(randomNumber), Toast.LENGTH_SHORT).show();
            }
        });
        Button randomWordButton = findViewById(R.id.random_word_button);
        randomWordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] words = {"dan", "elai", "adam shtock"};
                String randomWord = getRandomWord(words);
                Toast.makeText(MainActivity.this, randomWord, Toast.LENGTH_SHORT).show();
            }
        });
        final RelativeLayout mainLayout = findViewById(R.id.main_layout);

        Button redButton = findViewById(R.id.red_button);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundColor(Color.RED);

            }
        });

        final Button blueButton = findViewById(R.id.blue_button);
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundColor(Color.BLUE);
                if (blueFlag) {
                    blueButton.setBackgroundColor(Color.GRAY);
                } else {
                    blueButton.setBackgroundColor(Color.BLUE);
                }
                blueFlag = !blueFlag;
            }
        });
        final EditText textBox = findViewById(R.id.text_box);

        final Button textBoxButton = findViewById(R.id.text_box_button);
        textBoxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = textBox.getText().toString();
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
        final Button fiftyButton = findViewById(R.id.fifty_button);
        fiftyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click ++;
                String fiftytimes = "Congrats U made it to 50!";
                if (click == 50){
                    Toast.makeText(MainActivity.this,fiftytimes,Toast.LENGTH_SHORT).show();
                }
            }
        });
        final EditText letterText = findViewById(R.id.letter_textbox);

        final Button letterButton = findViewById(R.id.letter_button);
        letterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Character letters = letterText.getText().charAt(0);
                letters ++;
                Toast.makeText(MainActivity.this,letters,Toast.LENGTH_SHORT).show();
            }
        });

    }
    private int getRandom(int from, int to) {
        return (int) (new Random().nextDouble() * (to - from) + from);
    }

    private String getRandomWord(String[] words) {
        return words[getRandom(0, words.length)];
    }
}
