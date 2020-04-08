package com.diozaas.facebooklogindesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegBirthDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Birthday");
        setContentView(R.layout.reg_birth_date);
    }

    public void regMobileNum(View view) {
        Intent i = new Intent(RegBirthDate.this, RegMobileNum.class);
        startActivity(i);
    }
}
