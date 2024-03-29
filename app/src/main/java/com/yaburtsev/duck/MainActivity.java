package com.yaburtsev.duck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void imageView() {
        ImageView photo = findViewById(R.id.photo);
        int image = R.drawable.duck;
        String description = "This is the duck!";
        photo.setImageResource(image);
        photo.setContentDescription(description);
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

    public void spinner() {
        Spinner spinner = findViewById(R.id.spinner);
        String selected = String.valueOf(spinner.getSelectedItem());
    }

    public void onImageButtonClick(View view) {
        Intent intent = new Intent(this, ScrollActivity.class);
        startActivity(intent);
    }

    public void onButtonClick(View view) {
        int duration = Toast.LENGTH_SHORT;
        String text = "Button was clicked!";
        Toast.makeText(this, text, duration).show();
    }
}
