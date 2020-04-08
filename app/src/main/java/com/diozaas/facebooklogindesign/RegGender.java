package com.diozaas.facebooklogindesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegGender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Gender");
        setContentView(R.layout.reg_gender);
    }

    public void regBirthDate(View view) {
        Intent i = new Intent(RegGender.this, RegBirthDate.class);
        startActivity(i);
    }
}
