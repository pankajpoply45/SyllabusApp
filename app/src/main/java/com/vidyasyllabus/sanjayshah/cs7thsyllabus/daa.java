package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class daa extends AppCompatActivity {

    PDFView daa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daa);

        daa= (PDFView) findViewById(R.id.pdfdaa);
        daa.fromAsset("daa.pdf").load();
    }
}
