package com.example.giannisavini.lab07es1;

import android.os.PersistableBundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawerLateralLayout;
    private ActionBarDrawerToggle dwtToggle;

    private TextView txvElemento1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inizializza Oggetti della view
        txvElemento1 = (TextView) findViewById(R.id.txv_elemento1);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLateralLayout = (DrawerLayout) findViewById(R.id.dwl_drawer);

        dwtToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLateralLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLateralLayout.addDrawerListener(dwtToggle);
        drawerLateralLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED, GravityCompat.END);
        drawerLateralLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(View drawerView) {

            }

            @Override
            public void onDrawerClosed(View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });

    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);

        if(dwtToggle != null) {
            dwtToggle.syncState();
        }
    }

    private boolean isDrawerOpen() {
        //Vero se è stato instanziato, e se è aperto
        return drawerLateralLayout != null && drawerLateralLayout.isDrawerOpen(GravityCompat.START);
    }
    /**
     * Se il Drawer è aperto lo, chiude
     */
    private void closeDrawer() {
        if(isDrawerOpen()) {
            drawerLateralLayout.closeDrawer(GravityCompat.START);
        }
    }

    /**
     * Se viene premuto il tasto indietro di Android, si chiude il Drawer
     */
    @Override
    public void onBackPressed() {
        if(isDrawerOpen()) {
            Toast.makeText(MainActivity.this, "Chiusura drawer", Toast.LENGTH_SHORT).show();
            closeDrawer();
        } else {
            super.onBackPressed();
        }
    }
}
