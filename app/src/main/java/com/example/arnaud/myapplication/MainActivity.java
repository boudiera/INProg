package com.example.arnaud.myapplication;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends TabActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, OngletEvenements.class);

        spec = tabHost
                .newTabSpec("Evenements")
                .setIndicator("Evenements du Jour !")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, OngletRecherche.class);
        spec = tabHost
                .newTabSpec("Recherche")
                .setIndicator("Recherche")
                .setContent(intent);
        tabHost.addTab(spec);


        tabHost.setCurrentTab(0);
        tabHost.getTabWidget().setDividerDrawable(R.drawable.side_nav_bar);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getLayoutInflater().inflate(R.layout.evenements,null);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.mes_evenements) {

        } else if (id == R.id.mon_compte) {
            Intent intent_mon_compte = new Intent(this,MonCompteActivity.class);
            startActivity(intent_mon_compte);
        }
        else if (id == R.id.nav_login){
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);

        }
        //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
