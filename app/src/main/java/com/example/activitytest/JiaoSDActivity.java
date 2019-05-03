package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class JiaoSDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jiaosd_layout);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:

            break;
            default:
                break;
        }
    }
}
