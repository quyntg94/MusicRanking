package quyntg.vn.lab2_musicranking;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import quyntg.vn.lab2_musicranking.adapters.PageAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("GENRES"));
        tabLayout.addTab(tabLayout.newTab().setText("PLAYLIST"));
        tabLayout.addTab(tabLayout.newTab().setText("OFFLINE"));

        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        final PageAdapter adapter = new PageAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


//    public void changeFragment(Fragment fragment, boolean addToBackstack, String tag){
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fl_container, fragment);
//        if (addToBackstack) {
//            fragmentTransaction.addToBackStack(tag);
//        }
//        fragmentTransaction.commit();
//    }
}
