package com.example.will.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Will on 5/17/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }


}
