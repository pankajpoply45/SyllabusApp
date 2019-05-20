package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class rts extends AppCompatActivity {
    
    PDFView rts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rts);

        rts= (PDFView) findViewById(R.id.pdfrts);
        rts.fromAsset("rts.pdf").load();
    }
}
