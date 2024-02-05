package com.example.adi.dailyworkout.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.adi.dailyworkout.Activity.MainActivity;
import com.example.adi.dailyworkout.R;

public class SplashScreen extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread myThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        progressBar = findViewById(R.id.prog_bar);
        textView = findViewById(R.id.textView);

        progressBar.setMax(100);
        progressBar.setScaleY(2f);
        progressAnimation();
    }

    public void progressAnimation(){
        ProgressBarAnimation anim = new ProgressBarAnimation(this, progressBar, textView, 0f, 100f);
        anim.setDuration(5000);
        progressBar.setAnimation(anim);
    }

}
