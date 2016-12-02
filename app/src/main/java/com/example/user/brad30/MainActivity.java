package com.example.user.brad30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = (TextView)findViewById(R.id.welcome);

        welcome.setText(R.string.mesg_welcome);


        Intent it = new Intent(this, MyService.class);
        startService(it);
    }
}
