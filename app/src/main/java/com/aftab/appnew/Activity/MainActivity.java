package com.aftab.appnew.Activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.aftab.appnew.Fragment.BlankFragment;
import com.aftab.appnew.FragmentManager;
import com.aftab.appnew.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.cl_reports)
    ConstraintLayout cl_reports;

    @BindView(R.id.chart1)
    LineChart chart1;

    @BindView(R.id.fl_mains)
    FrameLayout fl_mains;

    @BindView(R.id.fab_home_navigationBottom)
    FloatingActionButton fab_home_navigationBottom;
    Context context;
    @OnClick(R.id.cl_reports)
    public void cl_reports(View v) {

        FragmentManager.showFragment(MainActivity.this, BlankFragment.newInstance(), R.id.fl_mains, true, false);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        context = this;

        fab_home_navigationBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DialogActivity.class);
                startActivity(intent);

            }
        });
        setupchart();
    }
    private List<Entry> getIncomeEntries() {
        ArrayList<Entry> incomeEntries = new ArrayList<>();
        incomeEntries.add(new Entry(0, 0));
        incomeEntries.add(new Entry(1, 1));
        incomeEntries.add(new Entry(2, 2));
        incomeEntries.add(new Entry(3, 1));
        incomeEntries.add(new Entry(4, 3));
        incomeEntries.add(new Entry(5, 1));
        incomeEntries.add(new Entry(6, 0));
        incomeEntries.add(new Entry(7, 1));
        return incomeEntries.subList(0, 7);
    }
    private void setupchart() {


        List<String> xAxisValues = new ArrayList<>(Arrays.asList("", "", "", "", "", ""));
        List<Entry> incomeEntries = getIncomeEntries();



        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        LineDataSet set1;

        set1 = new LineDataSet(incomeEntries, "");
        set1.setColor(Color.rgb(65, 168, 121));
        set1.setValueTextColor(Color.rgb(55, 70, 73));

        set1.setValueTextSize(10f);
        set1.setMode(LineDataSet.Mode.CUBIC_BEZIER);


        set1.setDrawFilled(true);
        set1.setFillFormatter(new IFillFormatter() {
            @Override
            public float getFillLinePosition(ILineDataSet dataSet, LineDataProvider dataProvider) {
                return chart1.getAxisLeft().getAxisMinimum();
            }
        });

        if (Utils.getSDKInt() >= 18) {
            // drawables only supported on api level 18 and above
            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.fade_green);
           set1.setFillDrawable(drawable);
        } else {
            set1.setFillColor(Color.BLACK);
        }
        dataSets.add(set1);

        //customization

        chart1.setTouchEnabled(true);

        chart1.setDragEnabled(true);
        chart1.setScaleEnabled(false);
        chart1.setPinchZoom(false);
        chart1.setDrawGridBackground(false);
        chart1.setExtraLeftOffset(15);
        chart1.setExtraRightOffset(15);
        //to hide background lines
        chart1.getXAxis().setDrawGridLines(false);
        chart1.getAxisLeft().setDrawGridLines(false);
        chart1.getAxisRight().setDrawGridLines(false);

        //to hide right Y and top X border
        YAxis rightYAxis = chart1.getAxisRight();
        rightYAxis.setEnabled(false);
        YAxis leftYAxis = chart1.getAxisLeft();
        leftYAxis.setEnabled(false);
        XAxis topXAxis = chart1.getXAxis();
        topXAxis.setEnabled(false);


        XAxis xAxis = chart1.getXAxis();
        xAxis.setGranularity(1f);
        xAxis.setCenterAxisLabels(true);
       // xAxis.setTypeface(MainActivity.iran_sans);
        xAxis.setTextSize(8);
        xAxis.setEnabled(true);
        xAxis.setDrawGridLines(false);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        set1.setLineWidth(2f);
        set1.setCircleRadius(3f);
        set1.setDrawValues(true);
     //   set1.setValueTypeface(MainActivity.iran_sans);
     //   set1.setCircleHoleColor(getResources().getColor(R.color.card_green));
        set1.setCircleColor(getResources().getColor(R.color.colorPrimary));

        //String setter in x-Axis
        chart1.getXAxis().setValueFormatter(new com.github.mikephil.charting.formatter.IndexAxisValueFormatter(xAxisValues));

        LineData data = new LineData(dataSets);
        chart1.setData(data);
        chart1.animateX(1000);
        chart1.invalidate();
        chart1.getLegend().setEnabled(false);
        chart1.setFocusable(false);
        chart1.getDescription().setEnabled(false);

    }
}
