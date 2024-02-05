package com.example.adi.dailyworkout.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.adi.dailyworkout.Instruksi.KakiActivity;
import com.example.adi.dailyworkout.Instruksi.KardioActivity;
import com.example.adi.dailyworkout.Instruksi.LenganActivity;
import com.example.adi.dailyworkout.Instruksi.PerutActivity;
import com.example.adi.dailyworkout.R;
import com.example.adi.dailyworkout.Instruksi.TipsActivity;


public class FragmentInstruksi extends Fragment {

    View v;
    Button btn_tips;
    Button btn_kardio;
    Button btn_perut;
    Button btn_lengan;
    Button btn_kaki;

    public FragmentInstruksi(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.instruksi_fragment,container,false);

        btn_tips = (Button) v.findViewById(R.id.btn_tips);
        btn_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(),TipsActivity.class);
                in.putExtra("Some", "Some Tips");
                startActivity(in);
            }
        });

        btn_kardio = (Button) v.findViewById(R.id.btn_kardio);
        btn_kardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(),KardioActivity.class);
                in.putExtra("Latihan", "Latihan Kardio");
                startActivity(in);
            }
        });

        btn_perut = (Button) v.findViewById(R.id.btn_perut);
        btn_perut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(),PerutActivity.class);
                in.putExtra("Latihan", "Latihan Otot Perut");
                startActivity(in);
            }
        });

        btn_lengan = (Button) v.findViewById(R.id.btn_lengan);
        btn_lengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(),LenganActivity.class);
                in.putExtra("Latihan", "Latihan Otot Lengan");
                startActivity(in);
            }
        });

        btn_kaki = (Button) v.findViewById(R.id.btn_kaki);
        btn_kaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(),KakiActivity.class);
                in.putExtra("Latihan", "Latihan Otot Kaki");
                startActivity(in);
            }
        });

        return v;
    }
}
