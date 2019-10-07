package com.example.eva1_3_comunicaciones_fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    rojoFragment rfRojo;
    azulFragment rfAzul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if(fragment.getClass()==rojoFragment.class){
            rfRojo = (rojoFragment) fragment;
        }else  if(fragment.getClass()==azulFragment.class){
            rfAzul = (azulFragment) fragment;
        }
    }
    public  void onFromFragToMain(String sender, String msg){
        if (sender.equals("BLUE")){

        }else{//Fragmento azul
            rfAzul.onFromMainToFrag(msg);
        }
    }
}
