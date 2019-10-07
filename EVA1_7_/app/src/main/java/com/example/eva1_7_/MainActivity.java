
package com.example.eva1_7_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.id.toolbar);
        Toolbar tBar = findViewById(R.id.toolbar);
        setSupportActionBar(tBar);
        ViewPager vpViewP = findViewById(R.id.viewpager);



    }
    private void setupViewPager (ViewPager v){

    }
    static class Adapter extends FragmentPagerAdapter{
        //private final

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return null;
            //return mFragmentList.size;
        }

        @Override
        public int getCount() {
            return 0;
        }

    }
}
