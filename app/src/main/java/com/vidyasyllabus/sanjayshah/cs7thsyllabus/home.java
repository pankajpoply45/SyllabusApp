package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

   
    Button bdc, bai, bcrp, brts, bxml, becom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bdc = (Button) findViewById(R.id.dc);
        bai = (Button) findViewById(R.id.ai);
        bcrp = (Button) findViewById(R.id.crp);
        brts = (Button) findViewById(R.id.rts);
        bxml = (Button) findViewById(R.id.xml1);
        becom = (Button) findViewById(R.id.ecom);

        bdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(home.this, dc.class);
                startActivity(intent);

            }
        });

        bai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(home.this, ai.class);
                startActivity(intent);

            }
        });

        bcrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(home.this, crp.class);
                startActivity(intent);

            }
        });

        brts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(home.this, rts.class);
                startActivity(intent);

            }
        });

        bxml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(home.this, xml1.class);
                startActivity(intent);

            }
        });

        becom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(home.this, ecom.class);
                startActivity(intent);

            }
        });


    }
}


