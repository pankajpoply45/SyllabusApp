package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fifthhome extends AppCompatActivity {

    Button bdaa, bdbs, bcn, bos, bmrp, bjava;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthhome);
        bdaa = (Button) findViewById(R.id.daa);
        bdbs = (Button) findViewById(R.id.dbs);
        bcn = (Button) findViewById(R.id.cn);
        bos = (Button) findViewById(R.id.os);
        bmrp = (Button) findViewById(R.id.mrp);
        bjava = (Button) findViewById(R.id.java);

        bdaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(fifthhome.this, daa.class);
                startActivity(intent);

            }
        });

        bdbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(fifthhome.this, dbs.class);
                startActivity(intent);

            }
        });

        bcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(fifthhome.this, cn.class);
                startActivity(intent);

            }
        });

        bos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(fifthhome.this, os.class);
                startActivity(intent);

            }
        });

        bmrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(fifthhome.this, mrp.class);
                startActivity(intent);

            }
        });

        bjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(fifthhome.this, java.class);
                startActivity(intent);

            }
        });


    }
}

