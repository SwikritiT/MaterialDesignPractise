package com.example.swikriti.fristmaterialdesign;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by swikriti on 8/7/2019.
 */

public class StandaloneToolbar extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        Toolbar mtoolbar=(Toolbar) findViewById(R.id.toolbar);
        mtoolbar.setTitle("Standalone Toolbar");
        mtoolbar.setSubtitle("by swikriti");
        mtoolbar.inflateMenu(R.menu.menu_main);
        mtoolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String title=(String) item.getTitle();
                Toast.makeText(StandaloneToolbar.this,title+" selected!",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        //mtoolbar.setNavigationIcon(R.drawable.navmenu);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            mtoolbar.setElevation(10f);
        }



    }


}
