package com.example.adi.dailyworkout.DetailInstruksi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.adi.dailyworkout.R;

public class DetailCrunchSepeda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_crunch_sepeda);
        TextView textView = (TextView) findViewById(R.id.link_crunchsepeda);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
