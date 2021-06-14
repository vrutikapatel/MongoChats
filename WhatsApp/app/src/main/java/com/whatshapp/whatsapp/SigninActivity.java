package com.whatshapp.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {

    private EditText country_code;
    private EditText number;
    private Spinner spinner;
    private Button nextBtn;

    private Toolbar toolbar;
    private TextView actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Toolbar toolbar = findViewById(R.id.toolbar);
        actionBar=findViewById(R.id.actionbar);
        setSupportActionBar(toolbar);

        country_code=findViewById(R.id.country_code);
        number=findViewById(R.id.number);
        spinner=findViewById(R.id.spinner);
        nextBtn=findViewById(R.id.profilenext_btn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SigninActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}