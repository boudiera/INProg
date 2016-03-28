
package com.example.arnaud.myapplication;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Arnaud on 22/03/2016.
 */


public class OngletEvenements extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_item_evenments);
        TextView texteView = (TextView) findViewById(R.id.textEvenement);
        Typeface font = Typeface.createFromAsset(getAssets(), "font1.TTF");
        texteView.setTypeface(font);

    }
}