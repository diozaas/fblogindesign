package com.diozaas.facebooklogindesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RegPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Password");
        setContentView(R.layout.reg_password);
    }
}
