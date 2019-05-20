package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ecom extends AppCompatActivity {

    PDFView ecom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecom);

        ecom= (PDFView) findViewById(R.id.pdfecom);
        ecom.fromAsset("ecom.pdf").load();

       
    }
}
