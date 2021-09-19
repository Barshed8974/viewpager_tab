package com.example.viewpager_viewpagerwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private RecyclerView recyclerView;
    ArrayList <Model> arrayList=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recycler1);
        buildData();
        buildRecycle();
    }

    private void buildData() {
        for (int i=0;i<10;i++)
        {
            String s="Ali"+i;
            Model model=new Model(s);
            arrayList.add(model);
        }
    }

    private void buildRecycle() {
        MyAdapter adapter=new MyAdapter(arrayList);
        LinearLayoutManager gridLayoutManager=new LinearLayoutManager(FirstFragment.this.getContext());
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}