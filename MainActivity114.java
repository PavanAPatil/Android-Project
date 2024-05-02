package com.example.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity114 extends AppCompatActivity {
ImageButton a,b,c,d,e,f,g,h,i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main114);
        a=(ImageButton)findViewById(R.id.imageButton2);
        b=(ImageButton)findViewById(R.id.imageButton3);
        c=(ImageButton)findViewById(R.id.imageButton4);
        d=(ImageButton)findViewById(R.id.imageButton5);
        e=(ImageButton)findViewById(R.id.imageButton6);
        f=(ImageButton)findViewById(R.id.imageButton7);
        g=(ImageButton)findViewById(R.id.imageButton8);
        h=(ImageButton)findViewById(R.id.imageButton9);
        i=(ImageButton)findViewById(R.id.imageButton10);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/playlist?list=PLDmB26UfHJY8lo-jmz_AvzhqWv0fIkveO");
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/playlist?list=PLeSgOle5Uc-SapwSjo4ScDh1ipi46JIut");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/playlist?list=PLrIYdN_jT7UrELTrpA6xcL9cpr0SEYeQ7");
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/playlist?list=PLrIYdN_jT7Upimg2vQIhKV8Z5UPU9LC20");
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/playlist?list=PLrIYdN_jT7UpMI5MzoqjwMMH8zyMHmYlC");
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/playlist?list=PLjm_mvBNlvBYry5LzWhCXsM_zPOXoNtkW");
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/playlist?list=PLjm_mvBNlvBZhNBUfRGTB9HnHEIdYO0_q");
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/playlist?list=PLjm_mvBNlvBY04nTWHnnnNKjvM1A07HxK");
                           }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/playlist?list=PLjm_mvBNlvBarSpkGyX6boID-UL8ZWeFQ");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}