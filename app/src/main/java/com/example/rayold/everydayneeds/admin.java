package com.example.rayold.everydayneeds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rayold.everydayneeds.R;
import com.example.rayold.everydayneeds.activities.DatabaseHelper;
import com.example.rayold.everydayneeds.activities.Login;
import com.example.rayold.everydayneeds.activities.Register;

public class admin extends AppCompatActivity {
    EditText service,hourlyRate;
    Button edit,add,delete;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        db = new DatabaseHelper(this);
        service= (EditText)findViewById(R.id.editService);
        hourlyRate = (EditText)findViewById(R.id.editHourlyPrice);
        edit = (Button)findViewById(R.id.buttonEdit);
        add = (Button)findViewById(R.id.buttonAdd);
        delete = (Button)findViewById(R.id.buttonDelete);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s1 = service.getText().toString();
                String s2 = hourlyRate.getText().toString();

                if (s1.equals("") || s2.equals("")) {
                    Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
                }else{
                    Boolean insert = db.insertService(s1, s2);
                    if (insert == true) {
                        Toast.makeText(getApplicationContext(), "Service Adding Successful", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Service Adding Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = service.getText().toString();
                if(s1.equals("")){
                    Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}


