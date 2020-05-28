package com.aftab.appnew.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.aftab.appnew.FragmentManager;
import com.aftab.appnew.R;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class BlankFragment extends Fragment {

    @BindView(R.id.tv_week)
    TextView tv_week;

    @BindView(R.id.tv_month)
    TextView tv_month;
    @BindView(R.id.tv_todey)
    TextView tv_todey;

    @BindView(R.id.cl_week_transparent)
    ConstraintLayout cl_week_transparent;

    @BindView(R.id.fl_main)
    FrameLayout fl_main;

    @BindView(R.id.cl_month_transparent)
    ConstraintLayout cl_month_transparent;

    @BindView(R.id.cl_Todey_transparent)
    ConstraintLayout cl_Todey_transparent;
 /*   @BindView(R.id.pager)
    NonSwipeableViewPager pager;*/
    Context context;

    Frg_report3 frg_report3 = new Frg_report3();
  //  Frg_report2 frg_report2 = new Frg_report2();
  //  frg_report1 frg_report1=new frg_report1();
    @OnClick(R.id.tv_week)
    public void tv_week(View v) {

        ChangeBtn(tv_week);
      //  pager.setCurrentItem(0);
        FragmentManager.showChildFragment(this, frg_report1.newInstance(), R.id.fl_main, true, true);


    }

    @OnClick(R.id.tv_todey)
    public void tv_todey(View v) {

        ChangeBtn(tv_todey);
        FragmentManager.showChildFragment(this, Frg_report2.newInstance(), R.id.fl_main, true, true);
     //   pager.setCurrentItem(1);
    }

    @OnClick(R.id.tv_month)
    public void tv_month(View v) {
        ChangeBtn(tv_month);
     //   pager.setCurrentItem(3);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_report, container, false);
        ButterKnife.bind(this, view);
        FragmentManager.showChildFragment(this, frg_report1.newInstance(), R.id.fl_main, true, true);

        return view;
    }
   /* public void initiFragments() {
        try {
            Item_ViewPager_File adapter_view_pager = new Item_ViewPager_File(getSupportFragmentManager());

            adapter_view_pager.addFragments(frg_report1);
            //  frg_report1.set_product_uuid(product_uuid);

            adapter_view_pager.addFragments(frg_report2);
            adapter_view_pager.addFragments(frg_report3);
            // frg_listOfComments.set_product_uuid(product_uuid);

            pager.setAdapter(adapter_view_pager);
            pager.setCurrentItem(0, false);
            pager.setOffscreenPageLimit(2);
            ChangeBtn(tv_week);
        }catch (Exception e){
            e.printStackTrace();
        }

    }*/
    public void ChangeBtn(TextView ll) {

        if (ll == tv_week) {


            tv_week.setTextColor(getResources().getColor(R.color.colorPrimary));
            tv_month.setTextColor(getResources().getColor(R.color.gray_434343));
            tv_todey.setTextColor(getResources().getColor(R.color.gray_434343));
            cl_week_transparent.setVisibility(View.VISIBLE);
            cl_month_transparent.setVisibility(View.GONE);
            cl_Todey_transparent.setVisibility(View.GONE);



        } else if (ll == tv_todey) {

            tv_week.setTextColor(getResources().getColor(R.color.gray_434343));
            tv_month.setTextColor(getResources().getColor(R.color.gray_434343));
            tv_todey.setTextColor(getResources().getColor(R.color.colorPrimary));
            cl_week_transparent.setVisibility(View.GONE);
            cl_month_transparent.setVisibility(View.GONE);
            cl_Todey_transparent.setVisibility(View.VISIBLE);


        } else if (ll == tv_month) {

            tv_week.setTextColor(getResources().getColor(R.color.gray_434343));
            tv_month.setTextColor(getResources().getColor(R.color.colorPrimary));
            tv_todey.setTextColor(getResources().getColor(R.color.gray_434343));
            cl_week_transparent.setVisibility(View.GONE);
            cl_month_transparent.setVisibility(View.VISIBLE);
            cl_Todey_transparent.setVisibility(View.GONE);


        }
    }
    private class PageChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrollStateChanged(int state) {
            if (state == ViewPager.SCROLL_STATE_IDLE) {

            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
        }

        @Override
        public void onPageSelected(int arg0) {
        }
    }

    public static BlankFragment newInstance() {

        Bundle args = new Bundle();

        BlankFragment fragment = new BlankFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
