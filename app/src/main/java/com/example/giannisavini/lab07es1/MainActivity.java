package com.example.giannisavini.lab07es1;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawerLateralLayout;
    private ActionBarDrawerToggle dwtToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inizializza Oggetti della view
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLateralLayout = (DrawerLayout) findViewById(R.id.dwl_drawer);
        drawerLateralLayout = (DrawerLayout) findViewById(R.id.dwl_drawer);
        
    }
}
