package com.example.swikriti.fristmaterialdesign;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void showStandaloneToolbar(View view){
        Intent intent=new Intent(this,StandaloneToolbar.class);
        startActivity(intent);


    }
    public  void showToolbarAsActionbar(View view){
        Intent intent=new Intent(this,ToolbarAsActionbar.class);
        startActivity(intent);


    }
    public  void showContextualMenu(View view){
        Intent intent=new Intent(this,ContextualMenu.class);
        startActivity(intent);


    }


}
