package com.example.duck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
