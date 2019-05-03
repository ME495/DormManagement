package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HuanqinActivity extends AppCompatActivity {
    private String zhanghao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hq_layout);
        Intent intent = getIntent();
        zhanghao = intent.getStringExtra("zhanghao");
    }

    public void onClick(View view){
        switch(view.getId()) {
            case R.id.button_1:
                Intent intent1 = new Intent(HuanqinActivity.this, HQ2.class);
                startActivity(intent1);
                break;
            case R.id.button_2:
                Intent intent2 = new Intent(HuanqinActivity.this, HQ1.class);
                intent2.putExtra("zhanghao",zhanghao);
                startActivity(intent2);
                break;
            default:
                break;
        }

    }
}
