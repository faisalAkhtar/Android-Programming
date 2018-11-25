package com.example.prac06;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toRed(View view) {
        RelativeLayout r = (RelativeLayout) findViewById(R.id.bg);
        r.setBackgroundColor(Color.RED);
    }

    public void toGreen(View view) {
        RelativeLayout r = (RelativeLayout) findViewById(R.id.bg);
        r.setBackgroundColor(Color.GREEN);
    }

    public void toBlue(View view) {
        RelativeLayout r = (RelativeLayout) findViewById(R.id.bg);
        r.setBackgroundColor(Color.BLUE);
    }
}
