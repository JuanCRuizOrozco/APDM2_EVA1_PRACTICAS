package com.example.eva1_5;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eva1_5.dummy.DummyContent;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetallleFragment extends Fragment {
    TextView textView;


    public DetallleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vs = inflater.inflate(R.layout.fragment_detallle, container, false);
        textView = vs.findViewById(R.id.textView);
        return vs;
    }
    public void onMainToFrag(DummyContent.DummyItem di){
        textView.setText("hp");
    }

}
