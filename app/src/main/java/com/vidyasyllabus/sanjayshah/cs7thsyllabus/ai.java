package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ai extends AppCompatActivity {

    PDFView ai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);

        ai= (PDFView) findViewById(R.id.pdfai);
        ai.fromAsset("ai.pdf").load();
    }
}
