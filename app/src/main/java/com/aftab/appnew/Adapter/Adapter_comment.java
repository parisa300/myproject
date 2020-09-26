package com.aftab.appnew.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aftab.appnew.Model.ModelComment;
import com.aftab.appnew.Model.Obj_Result;
import com.aftab.appnew.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Adapter_comment  extends RecyclerView.Adapter<Adapter_comment.MyViewHolder>{

    List<Obj_Result> replayComments;
    Context context;
    public Adapter_comment(List<Obj_Result> replayComments, Context context) {
        this.replayComments = replayComments;
        this.context = context;
    }
    public List<Obj_Result> getData() {
        return replayComments;
    }

    public void setData(List<Obj_Result> replayComments) {
        this.replayComments = replayComments;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment, parent, false);
        return new Adapter_comment.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvBodyTextReplay.setText(replayComments.get(position).getSubject());
        holder.tvUsernameReplay.setText(replayComments.get(position).getFull_name());
        holder.tvDateReplay.setText(replayComments.get(position).getDatetime_comment());
    }

    @Override
    public int getItemCount() {
        return replayComments.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView   tvUsernameReplay, tvDateReplay, tvBodyTextReplay;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvUsernameReplay = itemView.findViewById(R.id.tvUsernameReplay);
            tvDateReplay = itemView.findViewById(R.id.tvDateReplay);
            tvBodyTextReplay = itemView.findViewById(R.id.tvBodyTextReplay);

        }
    }
}
