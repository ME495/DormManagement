package com.example.xgly;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.activitytest.ActivityCollector;
import com.example.activitytest.BaseActivity;
import com.example.activitytest.LoginActivity;
import com.example.activitytest.R;
import com.example.other.CGongGaoActivity;
import com.example.other.GmimaActivity;

public class XglyActivity extends BaseActivity implements View.OnClickListener{
    private String mima;
    protected long exitTime;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.out_item:
                Intent intent = new Intent(XglyActivity.this, LoginActivity.class);
                startActivity(intent);
                XglyActivity.this.finish();
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xgly_layout);
        Intent intent = getIntent();
        mima = intent.getStringExtra("mima");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN){
            if ((System.currentTimeMillis()-exitTime) > 2000){
                exitTime=System.currentTimeMillis();
            } else {
                Intent intent = new Intent(this,LoginActivity.class);
                startActivity(intent);
                this.finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button_1:
                Intent intent1 = new Intent(this, FGonggaoActivity.class);
                startActivity(intent1);
                break;
            case R.id.button_2:
                Intent intent2 = new Intent(this,SushequActivity.class);
                startActivity(intent2);
                break;
            case R.id.button_3:
                Intent intent3 = new Intent(this,GLiadminActivity.class);
                startActivity(intent3);
                break;
            case R.id.button_4:
                Intent intent4 = new Intent(this,GliXSActivity.class);
                startActivity(intent4);
                break;
            case R.id.button_5:
                Intent intent5 = new Intent(XglyActivity.this, GmimaActivity.class);
                intent5.putExtra("mima",mima);
                startActivity(intent5);
                break;
            case R.id.button_6:
                Intent intent6 = new Intent(this, CGongGaoActivity.class);
                startActivity(intent6);
                break;
            default:
                break;
        }
    }
}