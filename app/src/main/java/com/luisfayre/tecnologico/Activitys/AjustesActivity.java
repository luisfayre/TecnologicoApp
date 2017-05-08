package com.luisfayre.tecnologico.Activitys;

import android.preference.PreferenceActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.luisfayre.tecnologico.R;

public class AjustesActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toolbar
        addPreferencesFromResource(R.xml.prefernces);

    }
}