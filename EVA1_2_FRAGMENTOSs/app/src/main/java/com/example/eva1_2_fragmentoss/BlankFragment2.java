package com.example.eva1_2_fragmentoss;


import android.content.Context;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
       this.Contex=context;
    }

    public BlankFragment2() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        Button btn =ll.findViewById(R.id.button);
        btn.setOnContextClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(contex, "Mensaje del fragmento", Toast.LENGTH_SHORT).show();
                // Inflate the layout for this fragment
            }
        });
        return ll;


    }

}
