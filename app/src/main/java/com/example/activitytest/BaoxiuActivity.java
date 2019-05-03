package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BaoxiuActivity extends AppCompatActivity {
    private String zhanghao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baoxiu_layout);

        Intent intent = getIntent();
        zhanghao = intent.getStringExtra("zhanghao");
    }

    public void onClick(View view){
        switch(view.getId()) {
            case R.id.button_1:
                Intent intent1 = new Intent(BaoxiuActivity.this, BXshenqingActivity.class);
                intent1.putExtra("zhanghao",zhanghao);
                startActivity(intent1);
                break;
            case R.id.button_2:
                Intent intent2 = new Intent(BaoxiuActivity.this, BXzhuangtaiActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }

    }
}
