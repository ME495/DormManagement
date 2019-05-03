package com.example.activitytest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gly.GlyActivity;
import com.example.xgly.XglyActivity;

public class LoginActivity extends BaseActivity {
    final String mima1 = "123456";
    private String mima2;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private EditText zhanghaoEdit;
    private EditText mimaEdit;
    private  Button denglu;
    private CheckBox remember;

    protected long exitTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        Intent intent = getIntent();
        mima2 = intent.getStringExtra("mima");
        if(mima2 == null){
            mima2 = mima1;
        }
        getSupportActionBar().hide();
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        zhanghaoEdit = findViewById(R.id.edit_zhanghao);
        mimaEdit = findViewById(R.id.edit_mima);
        remember = findViewById(R.id.remember);
        boolean isRemember = pref.getBoolean("rememberpass",false);
        if(isRemember){//将账号密码放在文本框中
            String zhanghao = pref.getString("zhanghao","");
            String mima = pref.getString("mima","");
            zhanghaoEdit.setText(zhanghao);
            mimaEdit.setText(mima);
            remember.setChecked(true);
        }
        Button denglu = findViewById(R.id.button_1);
        denglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zhanghao = zhanghaoEdit.getText().toString();
                String mima = mimaEdit.getText().toString();
                if(zhanghao.equals("2015551305")&&mima.equals(mima2)){
                    editor = pref.edit();
                    if(remember.isChecked()){
                        editor.putBoolean("rememberpass",true);
                        editor.putString("zhanghao",zhanghao);
                        editor.putString("mima",mima);
                    }else {
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent = new Intent(LoginActivity.this, XSActivity.class);
                    intent.putExtra("zhanghao",zhanghao);
                    intent.putExtra("mima",mima2);
                    startActivity(intent);
                    LoginActivity.this.finish();
                }else  if(zhanghao.equals("2016551305")&&mima.equals(mima2)){
                    editor = pref.edit();
                    if(remember.isChecked()){
                        editor.putBoolean("rememberpass",true);
                        editor.putString("zhanghao",zhanghao);
                        editor.putString("mima",mima);
                    }else {
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent = new Intent(LoginActivity.this, XSActivity.class);
                    intent.putExtra("zhanghao",zhanghao);
                    intent.putExtra("mima",mima2);
                    startActivity(intent);
                    LoginActivity.this.finish();
                } else if(zhanghao.equals("admin")&&mima.equals(mima2)){
                    editor = pref.edit();
                    if(remember.isChecked()){
                        editor.putBoolean("rememberpass",true);
                        editor.putString("zhanghao",zhanghao);
                        editor.putString("mima",mima);
                    }else {
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent = new Intent(LoginActivity.this, GlyActivity.class);
                    intent.putExtra("mima",mima2);
                    startActivity(intent);
                    LoginActivity.this.finish();
                } else if(zhanghao.equals("xitong")&&mima.equals(mima2)){
                    editor = pref.edit();
                    if(remember.isChecked()){
                        editor.putBoolean("rememberpass",true);
                        editor.putString("zhanghao",zhanghao);
                        editor.putString("mima",mima);
                    }else {
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent = new Intent(LoginActivity.this, XglyActivity.class);
                    intent.putExtra("mima",mima2);
                    startActivity(intent);
                    LoginActivity.this.finish();
                }
                else {
                    Toast.makeText(LoginActivity.this,"输入的账号或密码错误，请重新输入!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN){
            if ((System.currentTimeMillis()-exitTime) > 2000){
                Toast.makeText(LoginActivity.this,"再按一次退出程序",Toast.LENGTH_SHORT).show();
                exitTime=System.currentTimeMillis();
            } else {
                ActivityCollector.finishAll();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
}
