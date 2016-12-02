package com.example.user.brad30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        int i = getIntent().getIntExtra("key1",-1);
        Log.v("brad", "i = " + i);
    }
}
