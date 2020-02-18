package com.example.duck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecycleViewAdapter.ItemClickListener{

    MyRecycleViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");
        animalNames.add("Cat");

    }
    CheckBox checkbox = findViewById(R.id.checkbox_yellow);
    boolean checked = checkbox.isChecked();

    if (checked){
        //do something
    }



    public void onToggleButtonClicked(View view) {

        boolean on = ((ToggleButton) view).isChecked();
        if (on) {

            System.out.print("hokey");

        } else {

            System.out.print("not ok");

        }
    }

    public void onSwitchClicked(View view) {

        boolean on = ((Switch)view).isChecked();

        if(on){
            //on
        }else{
            //off
        }
    }



}
