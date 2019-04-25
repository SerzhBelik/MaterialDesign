package com.example.belikov.myapplication.hw3;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.belikov.myapplication.R;

public class ButtonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottons_activity);

        FloatingActionButton fab = findViewById(R.id.floatingAB);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(ButtonsActivity.this, "FAB", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    public void onClickButton1(View v){
        Toast toast = Toast.makeText(this, "Button1", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickButton2(View v){
        Toast toast = Toast.makeText(this, "Button2", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickButton3(View v){
        Toast toast = Toast.makeText(this, "Button3", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickButton4(View v){
        Toast toast = Toast.makeText(this, "Button4", Toast.LENGTH_SHORT);
        toast.show();
    }
}
