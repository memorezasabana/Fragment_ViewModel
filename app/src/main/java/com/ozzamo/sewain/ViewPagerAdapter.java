package com.ozzamo.sewain;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ViewPagerAdapter#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB__TITLES = new int[]
            {R.id.bottom_nav_manage, R.id.bottom_nav_profile};
    private final Context mContext;

    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        if (position == 0) {
            return ManageFragment.newInstance();
        } else {
            return ProfileFragment.newInstance();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB__TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages
        return 2;
    }
}
