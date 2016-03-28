package com.example.arnaud.myapplication;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Arnaud on 22/03/2016.
 */


public class OngletRecherche extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_item_recherche);
        TextView texteView2 = (TextView) findViewById(R.id.textRecherche);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "font1.TTF");
        texteView2.setTypeface(font2);

    }
}