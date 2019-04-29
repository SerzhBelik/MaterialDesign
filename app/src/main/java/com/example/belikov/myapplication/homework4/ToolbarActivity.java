package com.example.belikov.myapplication.homework4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

import com.example.belikov.myapplication.R;

public class ToolbarActivity extends AppCompatActivity {
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progressBar = findViewById(R.id.progress_horizontal);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClickShow(View view){
        int progress = 0;
        progressBar.setMax(100);
        progressBar.setVisibility(View.VISIBLE);
        for (int i = 0; i <= 100000000; i++){

            if (i%1000000 == 0 && i != 0){
                progress++;
                progressBar.setProgress(progress);
            }

        }
    }

    public void onClickHide(View view){
        progressBar.setVisibility(View.INVISIBLE);
    }

}
