package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mrp extends AppCompatActivity {
    PDFView mrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mrp);

        mrp= (PDFView) findViewById(R.id.pdfmrp);
       mrp.fromAsset("mrp.pdf").load();
    }
}
