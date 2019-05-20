package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class xml1 extends AppCompatActivity {

    PDFView xml1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml1);

        xml1= (PDFView) findViewById(R.id.pdfxml);
        xml1.fromAsset("xml.pdf").load();
    }
}
