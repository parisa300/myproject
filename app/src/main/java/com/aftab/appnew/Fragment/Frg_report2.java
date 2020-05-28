package com.aftab.appnew.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aftab.appnew.Adapter.Adapter_Report2;
import com.aftab.appnew.Model.Obj_Reports;
import com.aftab.appnew.R;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frg_report2 extends Fragment {
    @BindView(R.id.rv_list)
    RecyclerView rv_list;


    private Adapter_Report2 adapter_report2;
    private LinearLayoutManager layoutManager;
    public Frg_report2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frg_report2, container, false);
        ButterKnife.bind(this, view);

        setUpRecyclerView();



        return view;
    }
    private void setUpRecyclerView() {
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);


        rv_list.setLayoutManager(layoutManager);


        adapter_report2 = new Adapter_Report2(getContext());



        setFakeData();

        rv_list.setAdapter(adapter_report2);


    }
    private void setFakeData() {



        List<Obj_Reports> data = new ArrayList<>();
        Obj_Reports obj_report = new Obj_Reports();
        obj_report.setTitle("Sun");
        obj_report.setMin("76");
        obj_report.setMax("143");
        obj_report.setAvg("96");


        Obj_Reports obj_report1 = new Obj_Reports();
        obj_report1.setTitle("Mon");
        obj_report1.setMin("87");
        obj_report1.setMax("123");
        obj_report1.setAvg("96");



        Obj_Reports obj_report2 = new Obj_Reports();
        obj_report2.setTitle("Tue");
        obj_report2.setMin("87");
        obj_report2.setMax("123");
        obj_report2.setAvg("96");



        Obj_Reports obj_report3 = new Obj_Reports();
        obj_report3.setTitle("wen");
        obj_report3.setMin("87");
        obj_report3.setMax("123");
        obj_report3.setAvg("96");


        Obj_Reports obj_report4 = new Obj_Reports();
        obj_report4.setTitle("Thu");
        obj_report4.setMin("87");
        obj_report4.setMax("123");
        obj_report4.setAvg("96");


        Obj_Reports obj_report5 = new Obj_Reports();
        obj_report5.setTitle("Fri");
        obj_report5.setMin("87");
        obj_report5.setMax("123");
        obj_report5.setAvg("96");





        data.add(obj_report);
        data.add(obj_report1);
        data.add(obj_report2);
        data.add(obj_report3);
        data.add(obj_report4);
        data.add(obj_report5);



        adapter_report2.setData(data);




    }
    public static Frg_report2 newInstance() {

        Bundle args = new Bundle();

        Frg_report2 fragment = new Frg_report2();
        fragment.setArguments(args);
        return fragment;
    }
}
