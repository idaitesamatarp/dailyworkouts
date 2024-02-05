package com.example.adi.dailyworkout.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.adi.dailyworkout.Model.Work;
import com.example.adi.dailyworkout.R;
import com.example.adi.dailyworkout.Latihan.WorkDay;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Work> mData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context mContext, List<Work> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_work, parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        //Dialog
        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.work_content);

        vHolder.itemWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imgWork = (ImageView) myDialog.findViewById(R.id.img_dialog);
                TextView txtJudul = (TextView) myDialog.findViewById(R.id.judul_dialog);
                TextView txtDetails = (TextView) myDialog.findViewById(R.id.details_dialog);

                imgWork.setImageResource(mData.get(vHolder.getAdapterPosition()).getImage());
                txtJudul.setText(mData.get(vHolder.getAdapterPosition()).getJudul());
                txtDetails.setText(mData.get(vHolder.getAdapterPosition()).getDetail());

                myDialog.show();
            }
        });

        Button btnMulai = (Button) myDialog.findViewById(R.id.btn_mulai);
        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, WorkDay.class);
                Toast.makeText(mContext,"Selamat Berlatih", Toast.LENGTH_SHORT).show();
                mContext.startActivity(intent);
            }
        });
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.itemTitle.setText(mData.get(position).getJudul());
        holder.itemDetails.setText(mData.get(position).getDetail());
        holder.imgWork.setImageResource(mData.get(position).getImage());
        holder.itemGo.setText(mData.get(position).getGo());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private CardView itemWork;
        private TextView itemTitle;
        private TextView itemDetails;
        private ImageView imgWork;
        private TextView itemGo;
        private Button btnMulai;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            itemWork = (CardView) itemView.findViewById(R.id.item_work);
            itemTitle = (TextView) itemView.findViewById(R.id.item_judul);
            itemDetails = (TextView) itemView.findViewById(R.id.item_detail);
            imgWork = (ImageView) itemView.findViewById(R.id.img_work);
            itemGo = (TextView) itemView.findViewById(R.id.item_go);
            btnMulai = (Button) itemView.findViewById(R.id.btn_mulai);
        }
    }

}
