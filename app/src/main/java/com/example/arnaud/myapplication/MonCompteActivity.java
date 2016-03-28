package com.example.arnaud.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by Arnaud on 28/03/2016.
 */
public class MonCompteActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mon_compte);

        Button btnannuler = (Button)findViewById(R.id.btnannuler);

    }



}
