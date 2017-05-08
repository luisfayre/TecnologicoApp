package com.luisfayre.tecnologico.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisfayre.tecnologico.R;

/**
 * Created by luisf on 29/04/2017.
 */
public class FragmentoMaterias extends Fragment{
    public FragmentoMaterias() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmentotres, container, false);
    }
}
