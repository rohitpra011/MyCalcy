package com.rohit.mycalcy;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getSupportActionBar().hide();
        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 5 seconds
                    sleep(2 * 500);

                    Intent intent = new Intent(info.this,MainActivity.class);
                    startActivity(intent);

                    // After 5 seconds redirect to another intent

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };
        // start thread
        background.start();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
}
