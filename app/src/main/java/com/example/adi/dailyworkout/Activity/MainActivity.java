package com.example.adi.dailyworkout.Activity;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.adi.dailyworkout.Adapter.ViewPagerAdapter;
import com.example.adi.dailyworkout.Fragment.FragmentInstruksi;
import com.example.adi.dailyworkout.Fragment.FragmentWork;
import com.example.adi.dailyworkout.Instruksi.KakiActivity;
import com.example.adi.dailyworkout.R;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout ;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Add fragment here;
        adapter.AddFragment(new FragmentWork(),"Latihan");
        adapter.AddFragment(new FragmentInstruksi(),"Instruksi");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_run);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_priority);

        //ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }

    @Override
    public void onBackPressed() {

        if(backPressedTime +2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(getBaseContext(),"Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}
