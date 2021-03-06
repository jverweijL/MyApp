package com.example.jan.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.liferay.mobile.screens.auth.login.LoginListener;
import com.liferay.mobile.screens.auth.login.LoginScreenlet;
import com.liferay.mobile.screens.context.User;

public class Login extends AppCompatActivity implements LoginListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((EditText) findViewById(R.id.liferay_login)).setText("burger@overheid360.nl");
        ((EditText) findViewById(R.id.liferay_password)).setText("liferay");

        LoginScreenlet loginScreenlet = (LoginScreenlet) findViewById(R.id.login);
        loginScreenlet.setListener(this);
    }

    @Override
    public void onLoginSuccess(User user) {
        Toast.makeText(Login.this,"Login succes",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void onLoginFailure(Exception e) {
        Toast.makeText(Login.this, "Login failed!", Toast.LENGTH_SHORT).show();

    }
}
