package com.aftab.appnew;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class Item_ViewPager_File extends FragmentPagerAdapter {

    List<Fragment> fragments = new ArrayList<>();
    List<String> TITLES = new ArrayList<>();


    public Item_ViewPager_File(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES.get(position);
    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    public void addFragments(Fragment fragment) {
        this.fragments.add(fragment);
    }

    public void addFragmentWithTitle(Fragment fragment, String title){
        this.fragments.add(fragment);
        this.TITLES.add(title);

    }
}
