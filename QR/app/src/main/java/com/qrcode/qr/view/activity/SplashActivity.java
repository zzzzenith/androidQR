package com.qrcode.qr.view.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import  com.qrcode.qr.R;

public class SplashActivity extends Activity {

    /**
     * Declare class variables
     */
    private final int DELAY_INTERVAL = 3 * 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set main view for the screen
        setContentView(R.layout.activity_splash);
        // open next activity with time delay
        CountDownTimer();
    }

    /**
     * Functionality to delay time and start with login view
     */

    private void CountDownTimer() {
        new CountDownTimer(DELAY_INTERVAL, DELAY_INTERVAL) {

            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                // start up the SignUp screen
                startActivity(new Intent(SplashActivity.this,
                        MainActivity.class));

                finish();
            }
        }.start();
    }
}
