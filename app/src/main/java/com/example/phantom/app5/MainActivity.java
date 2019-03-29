package com.example.phantom.app5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b =(Button)findViewById(R.id.button);
        final RelativeLayout l=(RelativeLayout)findViewById(R.id.layout);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l.setBackgroundResource(R.mipmap.ic_launcher);
            }
        });
    }
}
