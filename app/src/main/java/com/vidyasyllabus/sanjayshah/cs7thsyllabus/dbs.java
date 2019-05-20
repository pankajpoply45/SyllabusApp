package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class dbs extends AppCompatActivity {
    PDFView dbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbs);

        dbs= (PDFView) findViewById(R.id.pdfdbs);
        dbs.fromAsset("dbs.pdf").load();
    }
}
