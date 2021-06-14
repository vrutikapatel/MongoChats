package com.whatshapp.whatsapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private Context mycontext;
    private int tabcount;

    public PageAdapter(Context context, FragmentManager fm, int tabcount) {
        super(fm);
        mycontext=context;
        this.tabcount=tabcount;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position){

           case 0:
               ImageFragment imageFragment=new ImageFragment();
               return imageFragment;
           case 1:
               ChatFragment chatFragment=new ChatFragment();
               return chatFragment;
           case 2:
               StatusFragment statusFragment=new StatusFragment();
               return statusFragment;
           case 3:
               CallFragment callFragment=new CallFragment();
               return callFragment;
           default:
               return null;

       }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
