package com.diozaas.facebooklogindesign;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class RegName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
//        getActionBar().setDisplayHomeAsUpEnabled(true);
//        Toolbar mtoolbar = (Toolbar) findViewById(R.id.toolbar);
//        mtoolbar.setTitle(getString(R.string.app_name));
//        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Name");
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorWhite)));
//        final Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
//        upArrow.setColorFilter(getResources().getColor(R.color.grey), PorterDuff.Mode.SRC_ATOP);
//        getSupportActionBar().setHomeAsUpIndicator();
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.reg_name);
    }

    public void regGender(View view) {
        Intent i = new Intent(RegName.this, RegGender.class);
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent backPrev = new Intent(RegName.this, MainActivity.class);
        startActivity(backPrev);
        return true;
    }
}
