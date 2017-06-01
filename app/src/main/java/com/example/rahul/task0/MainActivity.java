package com.example.rahul.task0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a=0;
    public void onButtonClick(View v) {
        TextView t1 = (TextView)findViewById(R.id.textView2);
        a+=1;
        t1.setText(Integer.toString(a));
    }

}