package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton;
        myButton = (Button)findViewById(R.id.askButton);
        final ImageView ballDisplay =(ImageView)findViewById(R.id.image_eightBall);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};



        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("magicBall", "the button had beeen clicked ");
                Random randomNumeberGenerator = new Random();
                int number = randomNumeberGenerator.nextInt(5);
                Log.d("eightBall", "the random number is generated ");

                ballDisplay.setImageResource(ballArray[number]);
            }
        });

    }
}
