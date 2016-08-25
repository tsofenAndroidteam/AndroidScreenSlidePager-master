package com.liangfeizc.slidepager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

//import com.facebook.common.internal.Lists;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liangfeizc on 3/26/15.
 */
public class SlidePagerAdapter extends FragmentStatePagerAdapter {
    private List<String> picList = Arrays.asList();
   // Arrays.asList
    public SlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return SlidePageFragment.newInstance(picList.get(i));
    }

    @Override
    public int getCount() {
        return picList.size();
    }

    public void addAll(List<String> picList) {
        this.picList = picList;
    }
}
