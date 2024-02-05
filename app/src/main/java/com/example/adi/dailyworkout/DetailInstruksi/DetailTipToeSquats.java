package com.example.adi.dailyworkout.DetailInstruksi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.adi.dailyworkout.R;

public class DetailTipToeSquats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_tip_toe_squats);
        TextView textView = (TextView) findViewById(R.id.link_tiptoe);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
