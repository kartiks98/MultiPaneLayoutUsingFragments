package com.example.multipanelayoutusingfragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.zip.Inflater;

public class AdapterNameFragment extends BaseAdapter {
    Context mNameFragment;
    String[] mNameofstudents;

    ArrayObject arrayObject = new ArrayObject();

    public AdapterNameFragment(Context nameFragment, String[] namesofstudents) {
        mNameFragment = nameFragment;
        mNameofstudents = namesofstudents;
    }

    @Override
    public int getCount() {
        return mNameofstudents.length;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mNameFragment);
        convertView = layoutInflater.inflate(R.layout.activity_inside_listview,parent,false);

        ListView listView = getView(position,convertView,parent).findViewById(R.id.namefragment);

        final TextView qName,qStream,qCollege;
        qName = convertView.findViewById(R.id.Name);
        qStream = convertView.findViewById(R.id.Stream);
        qCollege = convertView.findViewById(R.id.College);

        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //First Logic
                for (int i = 0; i <= mNameofstudents.length; i++) {

                    if (position == i && i <= 4) {

                        String Name = arrayObject.Name[i];
                        qName.setText(Name);

                        String Stream = arrayObject.Stream[0];
                        qStream.setText(Name);

                        String College = arrayObject.College[0];
                        qCollege.setText(Name);

                    }

                    else {
                        String Name = arrayObject.Name[5];
                        qName.setText(Name);

                        String Stream = arrayObject.Stream[1];
                        qStream.setText(Name);

                        String College = arrayObject.College[2];
                        qCollege.setText(Name);

                    }
                }

                //Second Logic
        /*for (int i=0;i<=mNameofstudents.length;i++){

            if (mNameofstudents[i].toString().matches(arrayObject.Name[i]) && mNameofstudents[i].toString() != "Jasjot"){

                String Name = arrayObject.Name[i];
                        qName.setText(Name);

                        String Stream = arrayObject.Stream[0];
                        qStream.setText(Name);

                        String College = arrayObject.College[0];
                        qCollege.setText(Name);
            }

            else {
                String Name = arrayObject.Name[5];
                        qName.setText(Name);

                        String Stream = arrayObject.Stream[1];
                        qStream.setText(Name);

                        String College = arrayObject.College[2];
                        qCollege.setText(Name);

            }
        }*/
            }
        });

        return convertView;
    }
}
