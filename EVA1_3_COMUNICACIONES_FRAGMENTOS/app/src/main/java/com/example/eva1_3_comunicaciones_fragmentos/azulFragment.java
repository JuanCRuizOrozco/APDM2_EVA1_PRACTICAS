package com.example.eva1_3_comunicaciones_fragmentos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class azulFragment extends Fragment implements FragmentCom {


    public azulFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.fragment_azul,container, false);
        TextView textView = ll.findViewById(R.id.textView2);

        return ll;
        //vincular la etiqueta con esa madre
    }

    @Override
    public void onFromMainToFrag(String msg) {

    }
}
