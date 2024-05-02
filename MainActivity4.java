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


public class MainActivity4 extends AppCompatActivity {
    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btn1=(ImageButton) findViewById(R.id.imageButton2);
        btn2=(ImageButton) findViewById(R.id.imageButton3);
        btn3=(ImageButton)findViewById(R.id.imageButton4);
        btn4=(ImageButton)findViewById(R.id.imageButton5);
        btn5=(ImageButton)findViewById(R.id.imageButton6);
        btn6=(ImageButton)findViewById(R.id.imageButton7);
        btn7=(ImageButton)findViewById(R.id.imageButton8);
        btn8=(ImageButton)findViewById(R.id.imageButton9);
        btn9=(ImageButton)findViewById(R.id.imageButton10);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity14.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity23.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity28.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity33.class);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity35.class);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity49.class);
                startActivity(i);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity65.class);
                startActivity(i);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity67.class);
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