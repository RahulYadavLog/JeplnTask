package com.example.jeplntaskapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter{
    Context c;
    ArrayList<Spacecraft> spacecrafts;

    public CustomAdapter(Context c, ArrayList<Spacecraft> spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;
    }

    @Override
    public int getCount() {
        return spacecrafts.size();
    }

    @Override
    public Object getItem(int i) {
        return spacecrafts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view= LayoutInflater.from(c).inflate(R.layout.model,viewGroup,false);
        }

        final Spacecraft s= (Spacecraft) this.getItem(i);

        ImageView img= (ImageView) view.findViewById(R.id.image);

        img.setImageResource(s.getImage());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c, s.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}