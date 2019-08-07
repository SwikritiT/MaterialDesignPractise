package com.example.swikriti.fristmaterialdesign;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

/**
 * Created by swikriti on 8/7/2019.
 */

public class ToolbarAsActionbar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        android.support.v7.widget.Toolbar mtoolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("Action Bar Toolbar");
        mtoolbar.setSubtitle("by Swikriti!");
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            mtoolbar.setElevation(10f);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.menu_main,menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg="";

        switch (item.getItemId()){
            case R.id.search:
                    msg=getString(R.string.search);
                    break;
            case R.id.setting:
                msg=getString(R.string.setting);
                break;
            case R.id.profile:
                msg=getString(R.string.profile);
                break;
            case R.id.help:
                msg=getString(R.string.help);
                break;
        }


        Toast.makeText(this, msg + " clicked !", Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
