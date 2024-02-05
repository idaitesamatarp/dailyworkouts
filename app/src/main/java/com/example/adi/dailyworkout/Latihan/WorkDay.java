package com.example.adi.dailyworkout.Latihan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.adi.dailyworkout.Instruksi.KardioActivity;
import com.example.adi.dailyworkout.R;

public class WorkDay extends AppCompatActivity {

    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.work_day);

        Kardio();

    }

    public void Kardio(){
        final ImageView senin = (ImageView) findViewById(R.id.img_senin);
        final ImageView selasa = (ImageView) findViewById(R.id.img_selasa);
        final ImageView rabu = (ImageView) findViewById(R.id.img_rabu);
        final ImageView kamis = (ImageView) findViewById(R.id.img_kamis);
        final ImageView jumat = (ImageView) findViewById(R.id.img_jumat);
        final ImageView sabtu = (ImageView) findViewById(R.id.img_sabtu);
        final ImageView minggu = (ImageView) findViewById(R.id.img_minggu);

        aSwitch = (Switch) findViewById(R.id.switch_mulai);
        senin.setEnabled(false);
        selasa.setEnabled(false);
        rabu.setEnabled(false);
        kamis.setEnabled(false);
        jumat.setEnabled(false);
        sabtu.setEnabled(false);
        minggu.setEnabled(false);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    senin.setEnabled(true);
                    selasa.setEnabled(true);
                    rabu.setEnabled(true);
                    kamis.setEnabled(true);
                    jumat.setEnabled(true);
                    sabtu.setEnabled(true);
                    minggu.setEnabled(true);
                    Toast.makeText(getBaseContext(),"Mulai Latihan", Toast.LENGTH_SHORT).show();
                }else{
                    senin.setEnabled(false);
                    selasa.setEnabled(false);
                    rabu.setEnabled(false);
                    kamis.setEnabled(false);
                    jumat.setEnabled(false);
                    sabtu.setEnabled(false);
                    minggu.setEnabled(false);
                    Toast.makeText(getBaseContext(),"Selesai Latihan", Toast.LENGTH_SHORT).show();
                }
            }
        });

        senin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SeninKardio.class);
                startActivity(intent);
            }
        });

        selasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SelasaKardio.class);
                startActivity(intent);
            }
        });

        rabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RabuKardio.class);
                startActivity(intent);
            }
        });

        kamis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),KamisKardio.class);
                startActivity(intent);
            }
        });

        jumat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),JumatKardio.class);
                startActivity(intent);
            }
        });

        sabtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SabtuKardio.class);
                startActivity(intent);
            }
        });

        minggu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MingguKardio.class);
                startActivity(intent);
            }
        });
    }

}
