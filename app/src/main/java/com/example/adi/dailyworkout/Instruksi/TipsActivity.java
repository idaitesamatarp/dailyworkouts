package com.example.adi.dailyworkout.Instruksi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.adi.dailyworkout.R;

public class TipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ins_tips);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            if(bundle.getString("Some") != null){
                Toast.makeText(getApplicationContext(),"Here "+bundle.getString("Some"),Toast.LENGTH_SHORT).show();
            }
        }
    }
}
