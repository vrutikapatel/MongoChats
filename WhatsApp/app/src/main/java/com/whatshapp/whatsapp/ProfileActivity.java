package com.whatshapp.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView actionBar;

    private ImageView profileimageView;
    private EditText profileName;
    private Button profilenext_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toolbar toolbar = findViewById(R.id.toolbar);
        actionBar=findViewById(R.id.actionbar);
        setSupportActionBar(toolbar);

        profileimageView=findViewById(R.id.profileimageView);
        profileName=findViewById(R.id.your_name);
        profilenext_btn=findViewById(R.id.profilenext_btn);

        profilenext_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}