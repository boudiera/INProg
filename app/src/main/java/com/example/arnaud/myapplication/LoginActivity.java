package com.example.arnaud.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.arnaud.myapplication.R;

/**
 * Created by Arnaud on 27/03/2016.
 */
public class LoginActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_login);

        EditText addEmail = (EditText) findViewById(R.id.editTextAddressemail);
        EditText passeword = (EditText) findViewById(R.id.editTextPasseword);
        CheckBox resteConnecte = (CheckBox) findViewById(R.id.checkConnecte);
        TextView mdpOublie = (TextView) findViewById(R.id.Txtmdpoublie);
        Button login = (Button)findViewById(R.id.btnlogin);
        Button inscrpition = (Button) findViewById(R.id.btninscription);


    }


}
