package com.example.duck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToggleButtonClicked(View view){

        boolean on = ((ToggleButton)view).isChecked();
            if(on){
                System.out.println("Button is clicked");
            }else{
                System.out.println("Button is not clicked");

        }
    }
}
