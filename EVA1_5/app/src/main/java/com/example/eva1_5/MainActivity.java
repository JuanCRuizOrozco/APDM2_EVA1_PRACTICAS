package com.example.eva1_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.example.eva1_5.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener {
    ItemFragment ifFragementLista;
    FragmentManager fmManager;
    DetallleFragment dfDetalle;
    //dfDetalle = new DetallleFragment();

    FragmentTransaction ftTrans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fmManager=getSupportFragmentManager();
        ifFragementLista = new ItemFragment();
        ftTrans = fmManager.beginTransaction();
        ftTrans.replace(R.id.frame,ifFragementLista);
        //ftTrans.add(R.id.frame,dfDetalle);
        ftTrans.commit();
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        Toast.makeText(this,item.content,Toast.LENGTH_LONG).show();
        dfDetalle = new DetallleFragment();
        dfDetalle.onMainToFrag(item);
        setContentView(R.layout.activity_main);
        fmManager=getSupportFragmentManager();
        ifFragementLista = new ItemFragment();
        ftTrans = fmManager.beginTransaction();
        ftTrans.replace(R.id.frame,ifFragementLista);
        ftTrans.add(R.id.frame,dfDetalle);
        ftTrans.addToBackStack(null);
        ftTrans.commit();
    }
}
