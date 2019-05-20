package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class os extends AppCompatActivity {
    PDFView os;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);

        os= (PDFView) findViewById(R.id.pdfos);
        os.fromAsset("os.pdf").load();
    }
}
