package com.example.jeplntaskapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


public class FragmentOne extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_one, container, false);

    GridView gv= (GridView) view.findViewById(R.id.gv);

      CustomAdapter  adapter=new CustomAdapter(getActivity(),getData());
        gv.setAdapter(adapter);
        return view;

    }
    private ArrayList getData()
    {
        ArrayList<Spacecraft> spacecrafts=new ArrayList<>();

        Spacecraft s=new Spacecraft();
        s.setImage(R.drawable.logoimg);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setImage(R.drawable.image3);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setImage(R.drawable.image4);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setImage(R.drawable.logoimg);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setImage(R.drawable.image3);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setImage(R.drawable.image4);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setImage(R.drawable.image3);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setImage(R.drawable.logoimg);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setImage(R.drawable.logoimg);
        spacecrafts.add(s);
        s=new Spacecraft();
        s.setImage(R.drawable.image4);
        spacecrafts.add(s);

        return spacecrafts;
    }
}