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

import com.example.adi.dailyworkout.DetailInstruksi.DetailCrunchPerut;
import com.example.adi.dailyworkout.DetailInstruksi.DetailCrunchSepeda;
import com.example.adi.dailyworkout.DetailInstruksi.DetailLegRaise;
import com.example.adi.dailyworkout.DetailInstruksi.DetailJembatan;
import com.example.adi.dailyworkout.R;

public class PerutActivity extends AppCompatActivity {

    ListView list2;
    String[] titles2 = {"Leg Raise", "Crunch Perut", "Crunch Sepeda", "Jembatan"};
    int[] imgs2 = {R.drawable.angkatkaki, R.drawable.crunchperut, R.drawable.crunchsepeda, R.drawable.jembatan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ins_perut);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            if (bundle.getString("Latihan") != null) {
                Toast.makeText(getApplicationContext(), "Instruksi " + bundle.getString("Latihan"), Toast.LENGTH_SHORT).show();
            }
        }

        list2 = findViewById(R.id.list_perut);

        MyAdapter adapter = new MyAdapter();
        list2.setAdapter(adapter);

        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent(getApplicationContext(),DetailLegRaise.class);
                    intent.putExtra("titles", titles2[position]);
                    intent.putExtra("images", imgs2[position]);
                    startActivity(intent);
                    Toast.makeText(PerutActivity.this, "Instruksi Leg Raise", Toast.LENGTH_SHORT).show();
                }
                if(position==1){
                    Intent intent = new Intent(getApplicationContext(), DetailCrunchPerut.class);
                    intent.putExtra("titles", titles2[position]);
                    intent.putExtra("images", imgs2[position]);
                    startActivity(intent);
                    Toast.makeText(PerutActivity.this, "Instruksi Crunch Perut", Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Intent intent = new Intent(getApplicationContext(), DetailCrunchSepeda.class);
                    intent.putExtra("titles", titles2[position]);
                    intent.putExtra("images", imgs2[position]);
                    startActivity(intent);
                    Toast.makeText(PerutActivity.this, "Instruksi Crunch Sepeda", Toast.LENGTH_SHORT).show();
                }
                if(position==3){
                    Intent intent = new Intent(getApplicationContext(), DetailJembatan.class);
                    intent.putExtra("titles", titles2[position]);
                    intent.putExtra("images", imgs2[position]);
                    startActivity(intent);
                    Toast.makeText(PerutActivity.this, "Instruksi Jembatan", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imgs2.length;
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

            View view = getLayoutInflater().inflate(R.layout.row_insperut,null);
            TextView title = view.findViewById(R.id.txt_rowperut);
            ImageView images = view.findViewById(R.id.img_rowperut);
            title.setText(titles2[position]);
            images.setImageResource(imgs2[position]);
            return view;
        }
    }
}
