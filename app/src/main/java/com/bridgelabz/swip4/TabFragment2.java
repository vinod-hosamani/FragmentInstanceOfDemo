package com.bridgelabz.swip4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class TabFragment2 extends Fragment {
    RecyclerView recyclerView;
    ArrayList<CustModel> dataLogList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_common_recycler_view, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.commonReyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        List<CustModel> ll = prepareData();
        CustomAdapter customAdapter = new CustomAdapter(ll, this);
        recyclerView.setAdapter(customAdapter);
        return view;
    }

    private List<CustModel> prepareData() {
        dataLogList = new ArrayList<>();

        CustModel list;

        list = new CustModel();
        list.button1 = "john";
        list.button2 = "cena";
        list.button3 = "amrendra";
        dataLogList.add(list);

        list = new CustModel();
        list.button1 = "viru";
        list.button2 = "jadeja";
        list.button3 = "ashwin";
        dataLogList.add(list);

        list = new CustModel();
        list.button1 = "youvi";
        list.button2 = "sachin";
        list.button3 = "dravid";
        dataLogList.add(list);
        dataLogList.add(list);
        return dataLogList;
    }
}