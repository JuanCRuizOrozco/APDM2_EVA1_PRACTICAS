package com.example.eva1_3_comunicaciones_fragmentos;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class rojoFragment extends Fragment implements FragmentCom {
    MainActivity ma;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ma =(MainActivity) getActivity();
    }

    public rojoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.fragment_rojo,container, false);
        Button button = ll.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ma.onFromFragToMain("RED", "Hola mundo");
            }
        });
        return ll;
    }

    @Override
    public void onFromMainToFrag(String msg) {

    }
}
