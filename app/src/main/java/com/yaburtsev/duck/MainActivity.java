package com.yaburtsev.duck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToggleButtonClicked(View view) {
        ToggleButton toggleButton = (ToggleButton) view;

        if (toggleButton.isChecked()) {
            //on
        } else {
            //off
        }
    }

    public void onSwitchClicked(View view) {
        Switch switchView = (Switch) view;

        if (switchView.isChecked()) {
            //on
        } else {
            //off
        }
    }
}
