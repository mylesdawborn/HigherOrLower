package com.example.myles.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String message = "";
    int randomNumber;

    public void checkGuess (View v) {

        EditText guessedNumber = findViewById(R.id.editTextEnter);
        String guessedNumberString = guessedNumber.getText().toString();
        int guessedNumberInt = Integer.parseInt(guessedNumberString);

        
        if (guessedNumberInt > randomNumber) {
                message = "Lower!";
        } else if (guessedNumberInt < randomNumber) {

                message = "Higher!";
        } else {

                message = "Correct!";
        }
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(101);
    }


}
