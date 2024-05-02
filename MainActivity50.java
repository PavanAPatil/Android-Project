package com.example.demoproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity50 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main50);
        int lesposition=getIntent().getIntExtra("key_position",0);
        if(lesposition==0){
            Intent i=new Intent(getApplicationContext(),MainActivity51.class);
            startActivity(i);
            finish();
        }
        if(lesposition==1){
            Intent i=new Intent(getApplicationContext(),MainActivity53.class);
            startActivity(i);
            finish();
        }
        if(lesposition==2){
            Intent i=new Intent(getApplicationContext(),MainActivity55.class);
            startActivity(i);
            finish();
        }
        if(lesposition==3){
            Intent i=new Intent(getApplicationContext(),MainActivity57.class);
            startActivity(i);
            finish();
        }
        if(lesposition==4){
            Intent i=new Intent(getApplicationContext(),MainActivity59.class);
            startActivity(i);
            finish();
        }
        if(lesposition==5){
            Intent i=new Intent(getApplicationContext(),MainActivity61.class);
            startActivity(i);
            finish();
        }
        if(lesposition==6){
            Intent i=new Intent(getApplicationContext(),MainActivity63.class);
            startActivity(i);
            finish();
        }


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent intent=new Intent(getApplicationContext(),MainActivity108.class);
                startActivity(intent);

                return true;
            case R.id.item2:
                Intent intent1=new Intent(getApplicationContext(),MainActivity109.class);
                startActivity(intent1);
                return true;
            case R.id.item3:
                Intent intent12=new Intent(getApplicationContext(),MainActivity110.class);
                startActivity(intent12);
                return true;
            case R.id.item4:
                Intent intent123=new Intent(getApplicationContext(),MainActivity114.class);
                startActivity(intent123);
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}