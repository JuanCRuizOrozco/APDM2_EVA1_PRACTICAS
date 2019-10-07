package com.example.eva1_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentManager fmManager;
    FragmentTransaction fmTrans;
    blueFragment brAzul;
    redFragment rfRojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fmManager = getSupportFragmentManager();
    }
    public void onClickBlue(View v){
        fmTrans = fmManager.beginTransaction();
        brAzul= new blueFragment();
        //fmTrans.replace(R.id.frmlayout,brAzul);
        //fmTrans.commit();
        fmTrans.setCustomAnimations(
                R.anim.enter_from_right,
                R.anim.exit_to_right,
                R.anim.enter_from_right,
                R.anim.exit_to_right
        );

        fmTrans.addToBackStack(null);
        fmTrans.add(R.id.frmlayout,brAzul,"BLANK_FRAGMENT");
        fmTrans.commit();
    }
    public void onClickred(View v){
        fmTrans = fmManager.beginTransaction();
        rfRojo= new redFragment();
        //fmTrans.replace(R.id.frmlayout,rfRojo);
        //fmTrans.commit();
        fmTrans.setCustomAnimations(
                R.anim.enter_from_right,
                R.anim.exit_to_right,
                R.anim.enter_from_right,
                R.anim.exit_to_right
        );

        fmTrans.addToBackStack(null);
        fmTrans.add(R.id.frmlayout,rfRojo,"BLANK_FRAGMENT");
        fmTrans.commit();
    }
}
