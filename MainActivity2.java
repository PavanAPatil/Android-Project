package com.example.demoproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText username,password;
    Button btnlogin;
    Spinner s1;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        username=(EditText) findViewById(R.id.username1);
        password=(EditText) findViewById(R.id.password1);
        btnlogin=(Button) findViewById(R.id.btnsignin1);
        s1=(Spinner)findViewById(R.id.spinner2);
        DB=new DBHelper(this);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.usertype,R.layout.support_simple_spinner_dropdown_item);
        s1.setAdapter(adapter);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String item = s1.getSelectedItem().toString();
                if (item.equals("Student")) {

                    if (user.equals("") || pass.equals(""))
                        Toast.makeText(MainActivity2.this, "Please Enter all the fields", Toast.LENGTH_SHORT).show();
                    else {
                        Boolean checkuserpass = DB.checkusernamepasswordS(user,pass,item);
                        if (checkuserpass == true) {
                            Toast.makeText(MainActivity2.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                            startActivity(intent);

                        } else {
                            Toast.makeText(MainActivity2.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();

                        }
                    }

                }
                if (item.equals("Teacher")) {

                    if (user.equals("") || pass.equals(""))
                        Toast.makeText(MainActivity2.this, "Please Enter all the fields", Toast.LENGTH_SHORT).show();
                    else {
                        Boolean checkuserpass = DB.checkusernamepasswordT(user,pass,item);
                        if (checkuserpass == true) {
                            Toast.makeText(MainActivity2.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                            startActivity(intent);

                        } else {
                            Toast.makeText(MainActivity2.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();

                        }
                    }

                }
            }
        });
    }


    }
