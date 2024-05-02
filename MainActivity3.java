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

public class MainActivity3 extends AppCompatActivity {

    ImageButton im1,im2,im3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        im1=(ImageButton) findViewById(R.id.imageButton13);
        im2=(ImageButton) findViewById(R.id.imageButton12);
        im3=(ImageButton)findViewById(R.id.imageButton16);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(i);
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity69.class);
                startActivity(i);
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity79.class);
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