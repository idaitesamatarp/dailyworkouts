package com.example.adi.dailyworkout.Latihan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.adi.dailyworkout.R;

public class JumatKardio extends AppCompatActivity {

    ListView list;
    String[] titles = {"Push Up 25x", "Sit Up 25x", "Plank 12 menit",
            "Leg Raise 12 menit", "Crunch Perut 25x",
            "Arm Raises 25x", "Mountain Climbers 25x",
            "Duduk di Dinding 12 menit", "Scissors 25x", "Tip Toe Squats 25x"};
    int[] imgs = {R.drawable.pushup, R.drawable.situp, R.drawable.plank,
            R.drawable.angkatkaki, R.drawable.crunchperut,
            R.drawable.angkattangan, R.drawable.climbers,
            R.drawable.duduk, R.drawable.scissors,R.drawable.tiptoe};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jumat_kardio);

        list = findViewById(R.id.list_seninkardio);

        MyAdapter adapter = new MyAdapter();
        list.setAdapter(adapter);

        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SabtuKardio.class);
                startActivity(intent);
            }
        });

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), KamisKardio.class);
                startActivity(intent);
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

            View view = getLayoutInflater().inflate(R.layout.row_workkardio,null);
            TextView title = view.findViewById(R.id.txt_rowkardio);
            ImageView images = view.findViewById(R.id.img_rowkardio);
            title.setText(titles[position]);
            images.setImageResource(imgs[position]);
            return view;
        }
    }
}
