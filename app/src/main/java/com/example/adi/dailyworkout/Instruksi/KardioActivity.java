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

import com.example.adi.dailyworkout.DetailInstruksi.DetailPushup;
import com.example.adi.dailyworkout.DetailInstruksi.DetailSitup;
import com.example.adi.dailyworkout.DetailInstruksi.DetailPlank;
import com.example.adi.dailyworkout.DetailInstruksi.DetailSquat;
import com.example.adi.dailyworkout.R;

public class KardioActivity extends AppCompatActivity {

    ListView list;
    String[] titles = {"Push Up", "Sit Up", "Plank", "Squat"};
    int[] imgs = {R.drawable.pushup, R.drawable.situp, R.drawable.plank, R.drawable.squat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ins_kardio);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            if (bundle.getString("Latihan") != null) {
                Toast.makeText(getApplicationContext(), "Instruksi " + bundle.getString("Latihan"), Toast.LENGTH_SHORT).show();
            }
        }

        list = findViewById(R.id.list_kardio);

        MyAdapter adapter = new MyAdapter();
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent(getApplicationContext(),DetailPushup.class);
                    intent.putExtra("titles", titles[position]);
                    intent.putExtra("images", imgs[position]);
                    startActivity(intent);
                    Toast.makeText(KardioActivity.this, "Instruksi Push-Up", Toast.LENGTH_SHORT).show();
                }
                if(position==1){
                    Intent intent = new Intent(getApplicationContext(), DetailSitup.class);
                    intent.putExtra("titles", titles[position]);
                    intent.putExtra("images", imgs[position]);
                    startActivity(intent);
                    Toast.makeText(KardioActivity.this, "Instruksi Sit-Up", Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Intent intent = new Intent(getApplicationContext(), DetailPlank.class);
                    intent.putExtra("titles", titles[position]);
                    intent.putExtra("images", imgs[position]);
                    startActivity(intent);
                    Toast.makeText(KardioActivity.this, "Instruksi Plank", Toast.LENGTH_SHORT).show();
                }
                if(position==3){
                    Intent intent = new Intent(getApplicationContext(), DetailSquat.class);
                    intent.putExtra("titles", titles[position]);
                    intent.putExtra("images", imgs[position]);
                    startActivity(intent);
                    Toast.makeText(KardioActivity.this, "Instruksi Squat", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private class MyAdapter extends BaseAdapter{

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

            View view = getLayoutInflater().inflate(R.layout.row_inskardio,null);
            TextView title = view.findViewById(R.id.txt_rowkardio);
            ImageView images = view.findViewById(R.id.img_rowkardio);
            title.setText(titles[position]);
            images.setImageResource(imgs[position]);
            return view;
        }
    }
}
