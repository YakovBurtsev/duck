package com.yaburtsev.duck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

    public void onSugarCheckBoxClicked(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {

        } else {

        }
    }

    public void onMilkCheckBoxClicked(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {

        } else {

        }
    }

    public void radioButton() {
        RadioGroup radioGroup = findViewById(R.id.radio_group);
        int id = radioGroup.getCheckedRadioButtonId();
        if (id == -1){
            //no item selected
        } else{
            RadioButton radioButton = findViewById(id);
            radioButton.getText();
        }
    }
}
