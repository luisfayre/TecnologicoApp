package com.luisfayre.tecnologico;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by luisf on 29/04/2017.
 */
public class Fragmentodos extends Fragment {
    public Fragmentodos() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmentodos, container, false);
    }
}
