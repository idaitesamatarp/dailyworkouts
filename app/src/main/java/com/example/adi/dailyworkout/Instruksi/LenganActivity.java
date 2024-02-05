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

import com.example.adi.dailyworkout.DetailInstruksi.DetailDiagonalPlank;
import com.example.adi.dailyworkout.DetailInstruksi.DetailArmRaises;
import com.example.adi.dailyworkout.DetailInstruksi.DetailMountainClimbers;
import com.example.adi.dailyworkout.DetailInstruksi.DetailPosisiKobra;
import com.example.adi.dailyworkout.R;

public class LenganActivity extends AppCompatActivity {

    ListView list;
    String[] titles = {"Arm Raises", "Diagonal Plank", "Mountain Climbers", "Posisi Cobra"};
    int[] imgs = {R.drawable.angkattangan, R.drawable.diagonalplank, R.drawable.climbers, R.drawable.cobra};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ins_lengan);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            if (bundle.getString("Latihan") != null) {
                Toast.makeText(getApplicationContext(), "Instruksi " + bundle.getString("Latihan"), Toast.LENGTH_SHORT).show();
            }
        }

        list = findViewById(R.id.list_lengan);

        MyAdapter adapter = new MyAdapter();
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent(getApplicationContext(),DetailArmRaises.class);
                    intent.putExtra("titles", titles[position]);
                    intent.putExtra("images", imgs[position]);
                    startActivity(intent);
                    Toast.makeText(LenganActivity.this, "Instruksi Arm Raises", Toast.LENGTH_SHORT).show();
                }
                if(position==1){
                    Intent intent = new Intent(getApplicationContext(), DetailDiagonalPlank.class);
                    intent.putExtra("titles", titles[position]);
                    intent.putExtra("images", imgs[position]);
                    startActivity(intent);
                    Toast.makeText(LenganActivity.this, "Instruksi Diagonal Plank", Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Intent intent = new Intent(getApplicationContext(), DetailMountainClimbers.class);
                    intent.putExtra("titles", titles[position]);
                    intent.putExtra("images", imgs[position]);
                    startActivity(intent);
                    Toast.makeText(LenganActivity.this, "Instruksi Mountain Climbers", Toast.LENGTH_SHORT).show();
                }
                if(position==3){
                    Intent intent = new Intent(getApplicationContext(), DetailPosisiKobra.class);
                    intent.putExtra("titles", titles[position]);
                    intent.putExtra("images", imgs[position]);
                    startActivity(intent);
                    Toast.makeText(LenganActivity.this, "Instruksi Posisi Kobra", Toast.LENGTH_SHORT).show();
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

            View view = getLayoutInflater().inflate(R.layout.row_inslengan, null);
            TextView title = view.findViewById(R.id.txt_rowlengan);
            ImageView images = view.findViewById(R.id.img_rowlengan);
            title.setText(titles[position]);
            images.setImageResource(imgs[position]);
            return view;
        }
    }
}
