package com.tam.pagerslidingtabstrip;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by toan on 4/3/2016.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;
    private String tabTittles[] = new String[] { "Tab 1", "Tab 2", "Tab 3" };

    public SampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return tabTittles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTittles[position];
    }
}
