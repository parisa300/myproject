package com.aftab.appnew.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aftab.appnew.Adapter.Adapter_Report1;
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
public class frg_report1 extends Fragment {

    @BindView(R.id.rv_list)
    RecyclerView rv_list;


    private Adapter_Report1 adapter_report1;
    private LinearLayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frg_report1, container, false);
        ButterKnife.bind(this, view);

        setUpRecyclerView();



        return view;
    }

    private void setUpRecyclerView() {
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);


        rv_list.setLayoutManager(layoutManager);


        adapter_report1 = new Adapter_Report1(getContext());



        setFakeData();

        rv_list.setAdapter(adapter_report1);


    }

    private void setFakeData() {



        List<Obj_Reports> products = new ArrayList<>();
        Obj_Reports obj_reports = new Obj_Reports();
        obj_reports.setTitle("Todey");
        obj_reports.setSize("Medium");
        obj_reports.setSize_number("143");
        obj_reports.setSize_number_m("Per hour");


        Obj_Reports obj_reports1 = new Obj_Reports();
        obj_reports1.setTitle("Yesterday");
        obj_reports1.setSize("Medium");
        obj_reports1.setSize_number("143");
        obj_reports1.setSize_number_m("Per hour");


        Obj_Reports obj_reports2 = new Obj_Reports();
        obj_reports2.setTitle("Todey");
       // obj_reports2.setSize("Medium");
        obj_reports2.setSize_number("196");
        obj_reports2.setSize_number_m("Max");


        Obj_Reports obj_reports3 = new Obj_Reports();
        obj_reports3.setTitle("Yesterday");
       // obj_reports2.setSize("Medium");
        obj_reports3.setSize_number("213");
        obj_reports3.setSize_number_m("Max");


        Obj_Reports obj_reports4 = new Obj_Reports();
        obj_reports4.setTitle("Yesterday");
       // obj_reports2.setSize("Medium");
        obj_reports4.setSize_number("73");
        obj_reports4.setSize_number_m("min");


        Obj_Reports obj_reports5 = new Obj_Reports();
        obj_reports5.setTitle("Todey");
       // obj_reports2.setSize("Medium");
        obj_reports5.setSize_number("76");
        obj_reports5.setSize_number_m("min");





        products.add(obj_reports);
        products.add(obj_reports1);
        products.add(obj_reports2);
        products.add(obj_reports3);
        products.add(obj_reports4);
        products.add(obj_reports5);


        adapter_report1.setData(products);




    }
    public static frg_report1 newInstance() {

        Bundle args = new Bundle();

        frg_report1 fragment = new frg_report1();
        fragment.setArguments(args);
        return fragment;
    }
}
