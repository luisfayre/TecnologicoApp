package com.luisfayre.tecnologico;

import android.preference.PreferenceActivity;
import android.os.Bundle;

public class AjustesActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.prefernces);

    }
}