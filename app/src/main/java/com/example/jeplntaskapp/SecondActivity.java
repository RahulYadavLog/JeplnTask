package com.example.jeplntaskapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    ImageView imgUpload,imgEdit,imgShare,imageView,imgHeart;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private int[] tabIcons = {
            R.drawable.upload,
            R.drawable.folder,
            R.drawable.sales
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imgUpload=findViewById(R.id.imgUpload);
        imgEdit=findViewById(R.id.imgEdit);
        imgShare=findViewById(R.id.imgshare);
        imageView=findViewById(R.id.imgview);
        imgHeart=findViewById(R.id.imgheart);
        imgUpload.setColorFilter(getResources().getColor(R.color.light_blue));
        imgEdit.setColorFilter(getResources().getColor(R.color.light_blue));
        imgShare.setColorFilter(getResources().getColor(R.color.light_blue));
        imageView.setColorFilter(getResources().getColor(R.color.sky_blue));
        imgHeart.setColorFilter(getResources().getColor(R.color.red));
        imgShare.setColorFilter(getResources().getColor(R.color.sky_blue));


        viewPager = (ViewPager) findViewById(R.id.ViewPager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new FragmentOne(), "ONE");
        adapter.addFrag(new FragmentTwo(), "TWO");
        adapter.addFrag(new FragmentThree(), "THREE");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}