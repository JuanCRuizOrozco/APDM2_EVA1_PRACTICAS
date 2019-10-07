package com.example.eva1_1_fragmentos;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlueFragment extends Fragment {

    @Override
    public void onDetach() {
        super.onDetach();
        Log.wtf("blue","onDetach");
    }

    public BlueFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.wtf("blue","onattach");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.wtf("blue","onPause");
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, container, false);
    }

}
