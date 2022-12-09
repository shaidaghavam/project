package com.example.myapplication;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;


public class MainActivity2 extends Activity {

        MediaPlayer mediaPlayer;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ring);

            mediaPlayer.start();

        }

        @Override
        protected void onPause() {
            super.onPause();
            mediaPlayer.stop();
            mediaPlayer.release();

        }
    }