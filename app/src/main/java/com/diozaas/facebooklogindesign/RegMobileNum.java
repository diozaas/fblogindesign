package com.diozaas.facebooklogindesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegMobileNum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Mobile Number");
        setContentView(R.layout.reg_mobile_num);
    }

    public void regPassword(View view) {
        Intent i = new Intent(RegMobileNum.this, RegPassword.class);
        startActivity(i);
    }
}
