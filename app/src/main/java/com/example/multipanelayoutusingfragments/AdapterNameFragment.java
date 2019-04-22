package com.example.multipanelayoutusingfragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.lang.reflect.Array;
import java.util.zip.Inflater;

public class AdapterNameFragment extends BaseAdapter {
    public AdapterNameFragment(Context nameFragment, String[] namesofstudents) {
        Context mnameFragment = nameFragment;
        String[] mnameofstudents = namesofstudents;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from()



        return null;
    }
}
