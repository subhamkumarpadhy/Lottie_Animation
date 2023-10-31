package com.example.lottie_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

//    LottieAnimationView laView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // To run the lottie animation with the help of java

        /*

         laView = findViewById(R.id.lot);
         laView.setAnimation(R.raw.lottie);
         laView.playAnimation();
         laView.loop(true);

           */
    }
}