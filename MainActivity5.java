package com.example.demoproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity5 extends AppCompatActivity {
    ImageButton img41,img42,img43,img44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        img41=(ImageButton) findViewById(R.id.imageButton);
        img42=(ImageButton) findViewById(R.id.imageButton11);
        img43=(ImageButton) findViewById(R.id.imageButton14);
        img44=(ImageButton) findViewById(R.id.imageButton15);


        img41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity6.class);
                startActivity(i);
            }
        });
        img42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity8.class);
                startActivity(i);
            }
        });
        img43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity10.class);
                startActivity(i);
            }
        });
        img44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity12.class);
                startActivity(i);
            }
        });

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