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

public class TabFragment1 extends Fragment {
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
        list.button1 = "vinod";
        list.button2 = "hosamani";
        list.button3 = "amrendra";
        dataLogList.add(list);

        list = new CustModel();
        list.button1 = "pakeaid";
        list.button2 = "mindblowing";
        list.button3 = "ikik";
        dataLogList.add(list);

        list = new CustModel();
        list.button1 = "add";
        list.button2 = "rsib";
        list.button3 = "multiply";
        dataLogList.add(list);
        dataLogList.add(list);
        return dataLogList;
    }
}