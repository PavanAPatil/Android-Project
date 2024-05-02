package com.example.demoproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity41 extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main41);
        listView=(ListView) findViewById(R.id.listview1);
        String[] lessonname=getResources().getStringArray(R.array.Chapter17Name);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lessonname);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(MainActivity41.this,MainActivity42.class);
                i.putExtra("key_position",position);
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