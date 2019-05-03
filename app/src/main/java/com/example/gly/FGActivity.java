package com.example.gly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.activitytest.R;

public class FGActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fg_layout);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                Intent intent1 = new Intent(this, C_xsHQ.class);
                startActivity(intent1);
                break;
            case R.id.button_2:
                Intent intent2 = new Intent(this, XG_sushe.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
