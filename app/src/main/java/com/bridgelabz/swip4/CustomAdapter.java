package com.bridgelabz.swip4;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

/**
 * Created by client1 on 1/5/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    List<CustModel> custModelList;
    Fragment fragment;

    public CustomAdapter(List<CustModel> custModelList, Fragment fragment) {
        this.fragment = fragment;
        this.custModelList = custModelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        CustModel custModel = custModelList.get(position);

        holder.b1.setText(custModel.button1);
        holder.b2.setText(custModel.button2);
        holder.b3.setText(custModel.button3);

        if (fragment instanceof TabFragment1) {
            holder.b1.setVisibility(View.GONE);
        }
        if (fragment instanceof TabFragment2) {
            holder.b2.setVisibility(View.GONE);
        }
        if (fragment instanceof TabFragment3) {
            holder.b3.setVisibility(View.GONE);
        }


    }

    @Override
    public int getItemCount() {
        return custModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        Button b1, b2, b3;

        public ViewHolder(View itemView) {
            super(itemView);
            b1 = (Button) itemView.findViewById(R.id.button1);
            b2 = (Button) itemView.findViewById(R.id.button2);
            b3 = (Button) itemView.findViewById(R.id.botton3);
        }
    }
}
