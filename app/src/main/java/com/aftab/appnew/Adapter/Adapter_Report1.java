package com.aftab.appnew.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aftab.appnew.Model.Obj_Reports;
import com.aftab.appnew.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;


public class Adapter_Report1 extends RecyclerView.Adapter<Adapter_Report1.ViewHolder> {


    private List<Obj_Reports> data;
    private Context context;


    public List<Obj_Reports> getData() {
        return data;
    }

    public void setData(List<Obj_Reports> data) {
        this.data = data;
    }

    public Adapter_Report1(Context context) {
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_report_1, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Obj_Reports data = getData().get(position);
        holder.day.setText(data.getTitle());

        holder.tv_size.setText(data.getSize());
        holder.tv_number.setText(data.getSize_number());
        holder.tv_time.setText(data.getSize_number_m());

        holder.tv_day.setText(data.getTitle());

        holder.tv_size1.setText(data.getSize());
        holder.tv_number1.setText(data.getSize_number());
        holder.tv_time1.setText(data.getSize_number_m());




/*
        holder.cv_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });*/

    }



    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.day)
        TextView day;
        @BindView(R.id.tv_size)
        TextView tv_size;
        @BindView(R.id.tv_number)
        TextView tv_number;
        @BindView(R.id.tv_time)
        TextView tv_time;

        @BindView(R.id.tv_day)
        TextView tv_day;

        @BindView(R.id.tv_time1)
        TextView tv_time1;

        @BindView(R.id.tv_number1)
        TextView tv_number1;

        @BindView(R.id.tv_size1)
        TextView tv_size1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
