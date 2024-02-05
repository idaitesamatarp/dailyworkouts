package com.example.adi.dailyworkout.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adi.dailyworkout.Adapter.RecyclerViewAdapter;
import com.example.adi.dailyworkout.Model.Work;
import com.example.adi.dailyworkout.R;

import java.util.ArrayList;
import java.util.List;


public class FragmentWork extends Fragment{

    View v;
    private RecyclerView myRecycler;
    private List<Work> listWork;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.work_fragment, container, false);

        //RecyclerView
        myRecycler = (RecyclerView) v.findViewById(R.id.work_recycler);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),listWork);
        myRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecycler.setAdapter(recyclerViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listWork = new ArrayList<>();
        listWork.add(new Work("Latihan Tubuh Penuh","Melatih seluruh otot tubuh", R.drawable.tubuhpenuh,">"));
        listWork.add(new Work("Latihan Otot Perut","Melatih seluruh otot perut",R.drawable.perut1,">"));
        listWork.add(new Work("Latihan Otot Lengan","Melatih seluruh otot lengan",R.drawable.lengan1,">"));
        listWork.add(new Work("Latihan Otot Kaki","Melatih seluruh otot kaki",R.drawable.kaki,">"));
    }
}
