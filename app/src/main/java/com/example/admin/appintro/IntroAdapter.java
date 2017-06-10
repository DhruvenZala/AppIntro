package com.example.admin.appintro;

import android.app.Fragment;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by admin on 6/10/2017.
 */
public class IntroAdapter extends FragmentPagerAdapter {

    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position) {
            case 0:
                return IntroFragment.newInstance(Color.parseColor("#2196F3"), position);
            case 1:
                return IntroFragment.newInstance(Color.parseColor("#FF6E40"), position);
            case 2:
                return IntroFragment.newInstance(Color.parseColor("#00E676"), position);
            default:
                return IntroFragment.newInstance(Color.parseColor("#FF5252"), position);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}
