package com.baidu.ocr.demo;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    private TextView infoTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        infoTextView = (TextView)findViewById(R.id.textView);
        imageView = (ImageView)findViewById(R.id.imageView);

        infoTextView.setBackgroundColor(Color.argb(255,0,0,0));
        infoTextView.setText(getIntent().getStringExtra("txt"));
        //imageView.setImageBitmap(BitmapFactory.decodeFile(getIntent().getStringExtra("jpg")));
    }
}
