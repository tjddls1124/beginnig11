package com.example.tjddl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Main2Activity extends AppCompatActivity {
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        tabHost.addTab(tabHost.newTabSpec("A").setContent(R.id.tab1).setIndicator("코알라"));
        tabHost.addTab(tabHost.newTabSpec("B").setContent(R.id.tab2).setIndicator("등대"));
        tabHost.addTab(tabHost.newTabSpec("C").setContent(R.id.tab3).setIndicator("펭귄"));
        tabHost.addTab(tabHost.newTabSpec("D").setContent(R.id.tab1).setIndicator("튤립"));


    }
}
