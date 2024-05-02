package com.example.demoproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Handler h=new Handler();
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,MainActivity107.class);
                startActivity(i);
                finish();

            }
        },3000);

        Calendar calendar=Calendar.getInstance();
        int Hours=calendar.get(Calendar.HOUR_OF_DAY);
        if(Hours>0 && Hours<12){
            t1.setText("Good Morning");
        }
        else if(Hours>=12 && Hours<17){
            t1.setText("Good Afternoon");
        }
        else if(Hours>=17 && Hours<21){
            t1.setText("Good Evening");
        }
       else{
            t1.setText("Good Night");
        }
        SimpleDateFormat dateFormat;
       String date;
       dateFormat=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
       date=dateFormat.format(calendar.getTime());
       t2.setText(date);
    }


}