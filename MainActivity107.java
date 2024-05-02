
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

public class MainActivity107 extends AppCompatActivity {
    EditText username,password,repassword;
    Button signup,signin;
    DBHelper DB;
    Spinner sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main107);

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        repassword=(EditText) findViewById(R.id.repassword);
        signup=(Button) findViewById(R.id.btnsignup);
        signin=(Button) findViewById(R.id.btnsignin);
        sp=(Spinner)findViewById(R.id.spinner);

        DB=new DBHelper(this);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.usertype,R.layout.support_simple_spinner_dropdown_item);
        sp.setAdapter(adapter);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();
                String item = sp.getSelectedItem().toString();
                if (item.equals("Student")) {

                    if (user.equals("") || pass.equals("") || repass.equals(""))
                        Toast.makeText(MainActivity107.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                    else {
                        if (pass.equals(repass)) {
                            Boolean checkuser = DB.checkusernameS(user,item);
                            if (checkuser == false) {
                                Boolean insert = DB.insertDataS(user,pass,item);
                                if (insert == true) {
                                    Toast.makeText(MainActivity107.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                                    startActivity(intent);

                                } else {
                                    Toast.makeText(MainActivity107.this, "Registration Failed", Toast.LENGTH_SHORT).show();

                                }
                            } else {
                                Toast.makeText(MainActivity107.this, "User Already Exists!!!Please Sign In", Toast.LENGTH_SHORT).show();

                            }
                        } else {
                            Toast.makeText(MainActivity107.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                        }
                    }

                }
                if (item.equals("Teacher")) {

                    if (user.equals("") || pass.equals("") || repass.equals(""))
                        Toast.makeText(MainActivity107.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                    else {
                        if (pass.equals(repass)) {
                            Boolean checkuser = DB.checkusernameT(user,item);
                            if (checkuser == false) {
                                Boolean insert = DB.insertDataT(user,pass,item);
                                if (insert == true) {
                                    Toast.makeText(MainActivity107.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(getApplicationContext(), MainActivity111.class);
                                    startActivity(intent);

                                } else {
                                    Toast.makeText(MainActivity107.this, "Registration Failed", Toast.LENGTH_SHORT).show();

                                }
                            } else {
                                Toast.makeText(MainActivity107.this, "User Already Exists!!!", Toast.LENGTH_SHORT).show();

                            }
                        } else {
                            Toast.makeText(MainActivity107.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                        }
                    }

                }

            }
        });


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);

            }
        });
    }

    }





