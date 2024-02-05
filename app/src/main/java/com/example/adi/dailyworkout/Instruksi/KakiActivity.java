package com.example.adi.dailyworkout.Instruksi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adi.dailyworkout.DetailInstruksi.DetailDuduk;
import com.example.adi.dailyworkout.DetailInstruksi.DetailScissors;
import com.example.adi.dailyworkout.DetailInstruksi.DetailSisiTerjang;
import com.example.adi.dailyworkout.DetailInstruksi.DetailTipToeSquats;
import com.example.adi.dailyworkout.R;

public class KakiActivity extends AppCompatActivity {

    ListView list;
    String[] titles = {"Duduk di Dinding", "Scissors", "Sisi Terjang", "Tip Toe Squats"};
    int[] imgs = {R.drawable.duduk, R.drawable.scissors, R.drawable.terjang, R.drawable.tiptoe};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ins_kaki);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            if (bundle.getString("Latihan") != null) {
                Toast.makeText(getApplicationContext(), "Instruksi " + bundle.getString("Latihan"), Toast.LENGTH_SHORT).show();
            }
        }

        list = findViewById(R.id.list_kaki);

        MyAdapter adapter = new MyAdapter();
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), DetailDuduk.class);
                    intent.putExtra("titles", titles[position]);
                    intent.putExtra("images", imgs[position]);
                    startActivity(intent);
                    Toast.makeText(KakiActivity.this, "Instruksi Duduk di Dinding", Toast.LENGTH_SHORT).show();
                }
                if(position==1){
                  Intent intent = new Intent(getApplicationContext(), DetailScissors.class);
                  intent.putExtra("titles", titles[position]);
                  intent.putExtra("images", imgs[position]);
                  startActivity(intent);
                  Toast.makeText(KakiActivity.this, "Instruksi Scissors", Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                Intent intent = new Intent(getApplicationContext(), DetailSisiTerjang.class);
                intent.putExtra("titles", titles[position]);
                intent.putExtra("images", imgs[position]);
                startActivity(intent);
                Toast.makeText(KakiActivity.this, "Instruksi Sisi Terjang", Toast.LENGTH_SHORT).show();
                }
                if(position==3){
                Intent intent = new Intent(getApplicationContext(), DetailTipToeSquats.class);
                intent.putExtra("titles", titles[position]);
                intent.putExtra("images", imgs[position]);
                startActivity(intent);
                Toast.makeText(KakiActivity.this, "Instruksi Tip Toe Squats", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imgs.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = getLayoutInflater().inflate(R.layout.row_inskaki, null);
        TextView title = view.findViewById(R.id.txt_rowkaki);
        ImageView images = view.findViewById(R.id.img_rowkaki);
        title.setText(titles[position]);
        images.setImageResource(imgs[position]);
        return view;
    }
}
}