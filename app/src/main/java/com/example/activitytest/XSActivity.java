package com.example.activitytest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.other.CGongGaoActivity;
import com.example.other.GmimaActivity;
import com.example.other.QueqinActivity;

public class XSActivity extends BaseActivity implements View.OnClickListener{
    private String mima;           //传密码
    private String zhanghao;
    private String quyu;
    private String qinshihao;
    private String Xzhanghao;     //判断是否为新生
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
                Intent intent = new Intent(XSActivity.this, LoginActivity.class);
                startActivity(intent);
                XSActivity.this.finish();
                break;
        }
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xs_layout);
        Intent intent = getIntent();
        mima = intent.getStringExtra("mima");
        zhanghao = intent.getStringExtra("zhanghao");
        Xzhanghao = zhanghao.substring(0,4);
        //Button button4 = (Button) findViewById(R.id.button_4);
        //Button button5 = (Button) findViewById(R.id.button_5);
        //button4.setOnClickListener(this);
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
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                AlertDialog.Builder dialog = new AlertDialog.Builder(XSActivity.this);
                dialog.setTitle("请确认是否为大一新生?");
                dialog.getContext();
                dialog.setCancelable(false);
                dialog.setPositiveButton("是", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(Xzhanghao.equals("2015")){
                            Intent intent = new Intent(XSActivity.this, XsusheActivity.class);
                            startActivity(intent);
                            //startActivityForResult(intent,1);
                        }else {
                            AlertDialog.Builder dialog1 = new AlertDialog.Builder(XSActivity.this);
                            dialog1.setTitle("  只限大一的选择，其他年级的可以选择申请宿舍调换。");
                            dialog1.getContext();
                            dialog1.setCancelable(false);
                            dialog1.setPositiveButton("是", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                            dialog1.show();
                            }
                        }
                });
                dialog.setNegativeButton("否", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
                break;
            case R.id.button_2:
                Intent intent2 = new Intent(XSActivity.this,BaoxiuActivity.class);
                intent2.putExtra("zhanghao",zhanghao);
                startActivity(intent2);
                break;
            case R.id.button_3:
                Intent intent3 = new Intent(XSActivity.this,JiaoSDActivity.class);
                startActivity(intent3);
                break;
            case R.id.button_4:
                Intent intent4 = new Intent(XSActivity.this, QueqinActivity.class);
                startActivity(intent4);
                break;
            case R.id.button_5:
                Intent intent5 = new Intent(XSActivity.this, HuanqinActivity.class);
                intent5.putExtra("zhanghao",zhanghao);
                //intent5.putExtra("quyu",quyu);
                //intent5.putExtra("qingshihao",qingshihao);
                startActivity(intent5);
                break;
            case R.id.button_6:
                Intent intent6 = new Intent(XSActivity.this, CGongGaoActivity.class);
                startActivity(intent6);
                break;
            case R.id.button_7:
                Intent intent7 = new Intent(XSActivity.this, GmimaActivity.class);
                intent7.putExtra("mima",mima);
                startActivity(intent7);
                break;
            default:
                break;
        }

    }
}
