package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.github.barteksc.pdfviewer.PDFView;

public class dc extends AppCompatActivity {

    PDFView dc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dc);

        dc= (PDFView) findViewById(R.id.pdfdc);
        dc.fromAsset("dc.pdf").load();
    }
}
