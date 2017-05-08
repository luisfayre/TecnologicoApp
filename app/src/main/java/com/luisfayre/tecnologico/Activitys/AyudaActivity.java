package com.luisfayre.tecnologico.Activitys;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.luisfayre.tecnologico.R;

/**
 * Created by luisf on 07/05/2017.
 */
public class AyudaActivity extends AppCompatPreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        addPreferencesFromResource(R.xml.help_comments);

    }
}