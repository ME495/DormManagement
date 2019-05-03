package com.example.xgly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.activitytest.R;

public class SushequActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sushequ_layout);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_1:
                Intent intent1 = new Intent(SushequActivity.this, Sushe1.class);
                startActivity(intent1);
                break;
            case R.id.button_2:
                Intent intent2 = new Intent(SushequActivity.this, Sushe2.class);
                startActivity(intent2);
                break;
            case R.id.button_3:
                Intent intent3 = new Intent(SushequActivity.this, Sushe3.class);
                startActivity(intent3);
                break;
            case R.id.button_4:
                Intent intent4 = new Intent(SushequActivity.this, Sushe4.class);
                startActivity(intent4);
                break;
            default:
                break;
        }
    }
}
