package com.example.clinics.beauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.clinics.R;

public class beauty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty);
        Intent intent=getIntent();
       // String result=intent.getStringExtra("name");
        //Toast.makeText(beauty.this,result,Toast.LENGTH_LONG).show();
    }

    public void bookat(View view) {
        Intent in = new Intent ( this, beautyb.class );
        startActivity ( in );
    }
}