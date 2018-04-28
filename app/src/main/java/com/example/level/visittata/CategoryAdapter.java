package com.example.level.visittata;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by level on 2018. 04. 27..
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */


    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ArchitectureFragment();
        } else if (position == 1) {
            return new OutdoorFragment();
        } else if (position == 2) {
            return new EventsFragment();
        } else {
            return new EatAndStayFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

//    @Override
//    public CharSequence getPageTitle(int position) {
//        if (position == 0) {
//            return mContext.getString(R.string.architecture);
//        } else if (position == 1) {
//            return mContext.getString(R.string.outdoor);
//        } else if (position == 2) {
//            return mContext.getString(R.string.events);
//        } else {
//            return mContext.getString(R.string.eat_and_stay);
//        }
//    }
}

