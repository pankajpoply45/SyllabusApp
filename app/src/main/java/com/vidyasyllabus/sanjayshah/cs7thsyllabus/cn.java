package com.vidyasyllabus.sanjayshah.cs7thsyllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cn extends AppCompatActivity {
    PDFView cn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cn);

        cn= (PDFView) findViewById(R.id.pdfcn);
        cn.fromAsset("cn.pdf").load();
    }
}
