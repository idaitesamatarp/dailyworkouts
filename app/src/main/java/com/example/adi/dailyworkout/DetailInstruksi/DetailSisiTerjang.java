package com.example.adi.dailyworkout.DetailInstruksi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.adi.dailyworkout.R;

public class DetailSisiTerjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_sisi_terjang);
        TextView textView = (TextView) findViewById(R.id.link_sisiterjang);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
