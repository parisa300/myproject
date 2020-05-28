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


public class Adapter_Report2 extends RecyclerView.Adapter<Adapter_Report2.ViewHolder> {


    private List<Obj_Reports> data;
    private Context context;


    public List<Obj_Reports> getData() {
        return data;
    }

    public void setData(List<Obj_Reports> data) {
        this.data = data;
    }

    public Adapter_Report2(Context context) {
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_report_2, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Obj_Reports data2 = getData().get(position);
        holder.tv_week.setText(data2.getTitle());
        holder.tv_numbermin.setText(data2.getMin());
        holder.tv_numbermax.setText(data2.getMax());
        holder.tv_numberavg.setText(data2.getAvg());





    }



    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.tv_week)
        TextView tv_week;
        @BindView(R.id.tv_numbermin)
        TextView tv_numbermin;
        @BindView(R.id.tv_numbermax)
        TextView tv_numbermax;
        @BindView(R.id.tv_numberavg)
        TextView tv_numberavg;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
