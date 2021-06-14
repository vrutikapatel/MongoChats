package com.whatshapp.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private TabItem image,chat,status,call;
    private ViewPager viewPager;
    private PageAdapter pageAdapter;

    private Toolbar toolbar;
    private TextView actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout1);
        image=findViewById(R.id.image);
        chat = findViewById(R.id.chats);
        status = findViewById(R.id.status);
        call = findViewById(R.id.calls);
        viewPager = findViewById(R.id.viewpager);

        Toolbar toolbar = findViewById(R.id.toolbar);
        actionBar=findViewById(R.id.actionbar);
        setSupportActionBar(toolbar);


        pageAdapter=new PageAdapter(this,getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String msg="";
        switch (item.getItemId()){
            case R.id.new_group:
                msg="new group";
                break;
            case R.id.new_broadcast:
                msg="new broadcast";
                break;
            case R.id.whatsapp_web:
                msg="whatsapp_web";
                break;
            case R.id.starred_messages:
                msg="starred_messages";
                break;
            case R.id.payment:
                msg="payment";
                break;
            case R.id.settings:
                msg="settings";
                break;
        }
        Toast.makeText(MainActivity.this,"Checked",Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}