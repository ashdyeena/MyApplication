package com.example.ashdyeena.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class RegisterActivity extends ActionBarActivity {

    protected EditText RegUsername;
    protected EditText RegUserEmail;
    protected EditText RegUserPassword;
    protected Button btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //initialize

        RegUsername = (EditText)findViewById(R.id.usernameRegEditText);
        RegUserEmail = (EditText)findViewById(R.id.EmailRegEditText);
        RegUserPassword = (EditText)findViewById(R.id.PasswordRegEditText);
        btnSignUp = (Button)findViewById(R.id.SignUpbutton);

        // listen to sign up button


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
