package com.example.swikriti.fristmaterialdesign;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by swikriti on 8/7/2019.
 */

public class ContextualMenu extends AppCompatActivity {
    Button button;
    ActionMode actionMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contextual_menu);
        Toolbar mtoolbar=(Toolbar) findViewById(R.id.toolbar);
        mtoolbar.setTitle("Contextual Menu");
        mtoolbar.setSubtitle("by swikriti");
        button=(Button)findViewById(R.id.button);
        mtoolbar.inflateMenu(R.menu.menu_main);
        mtoolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String title=(String) item.getTitle();
                Toast.makeText(ContextualMenu.this,title+" selected!",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        //mtoolbar.setNavigationIcon(R.drawable.navmenu);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            mtoolbar.setElevation(10f);
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionMode= ContextualMenu.this.startActionMode(new ContextualCallback());

            }
        });



    }

    private class ContextualCallback implements ActionMode.Callback {
        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.contextual_menu,menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle("My Action Mode!");
            actionMode.setSubtitle("By Swikriti");

            return true;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {

        }
    }
}
