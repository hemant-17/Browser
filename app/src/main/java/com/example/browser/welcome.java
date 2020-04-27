package com.example.browser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Thread th = new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(900);
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
                finally {
                    Intent home = new Intent(welcome.this , MainActivity.class);
                    startActivity(home);
                }
            }
        };
        th.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
