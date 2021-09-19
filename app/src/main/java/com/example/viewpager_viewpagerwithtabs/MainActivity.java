package com.example.viewpager_viewpagerwithtabs;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTablayout;
    private ViewPager2 mViewPager;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        setAdapter();
    }

    private void setAdapter() {
        FragAdapter fragAdapter=new FragAdapter(getSupportFragmentManager(),getLifecycle());
        mViewPager.setAdapter(fragAdapter);
        new TabLayoutMediator(mTablayout, mViewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position)
                {
                    case 0:
                        tab.setText("Names");
                        break;
                    case 1:
                        tab.setText("Place");
                        break;
                    case 2:
                        tab.setText("Tourist");
                        break;
                }
            }
        }).attach();
    }

    private void initviews() {
        mTablayout=findViewById(R.id.tabLayout);
        mViewPager=findViewById(R.id.viewPager);
    }
    public void setData(String name)
    {
        this.name=name;
    }
    public String getData()
    {
        return  name;
    }
}