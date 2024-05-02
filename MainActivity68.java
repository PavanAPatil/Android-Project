package com.example.demoproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;
public class MainActivity68 extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main68);
        pdfView=(PDFView) findViewById(R.id.pdfView);
        int lesposition=getIntent().getIntExtra("key_position",0);
        if(lesposition==0){
            pdfView.fromAsset("sci21.pdf").load();
        }
        if(lesposition==1){
            pdfView.fromAsset("sci22.pdf").load();
        }
        if(lesposition==2){
            pdfView.fromAsset("sci23.pdf").load();
        }
        if(lesposition==3){
            pdfView.fromAsset("sci24.pdf").load();
        }
        if(lesposition==4){
            pdfView.fromAsset("sci25.pdf").load();
        }
        if(lesposition==5){
            pdfView.fromAsset("sci26.pdf").load();
        }
        if(lesposition==6){
            pdfView.fromAsset("sci27.pdf").load();
        }
        if(lesposition==7){
            pdfView.fromAsset("sci28.pdf").load();
        }
        if(lesposition==8){
            pdfView.fromAsset("sci29.pdf").load();
        }
        if(lesposition==9){
            pdfView.fromAsset("sci210.pdf").load();
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