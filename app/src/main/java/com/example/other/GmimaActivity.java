package com.example.other;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.activitytest.BaseActivity;
import com.example.activitytest.LoginActivity;
import com.example.activitytest.R;

public class GmimaActivity extends BaseActivity implements View.OnClickListener{
    private String Ymima;
    private String Xmima1;
    private String mima;
    private EditText edit_Ymima;
    private EditText edit_Xmima1;
    private EditText edit_Xmima2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gmima_layout);
        getSupportActionBar().hide();
        edit_Ymima = (EditText) findViewById(R.id.edit_ymima);
        edit_Xmima1 = (EditText) findViewById(R.id.edit_xmima1);
        edit_Xmima2 = (EditText) findViewById(R.id.edit_xmima2);
        Intent intent = getIntent();
        mima = intent.getStringExtra("mima");
        Button button = (Button) findViewById(R.id.button_1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Ymima = edit_Ymima.getText().toString();
        Xmima1 = edit_Xmima1.getText().toString();
        String Xmima2 = edit_Xmima2.getText().toString();
        if(TextUtils.isEmpty(Ymima)){
            Toast.makeText(this,"请输入原密码",Toast.LENGTH_SHORT).show();
            return;
        } else if(!Ymima.equals(mima) ){
            Toast.makeText(this,"输入的密码与原密码不一致",Toast.LENGTH_SHORT).show();
            return;
        } else if(TextUtils.isEmpty(Xmima1)){
            Toast.makeText(this,"请输入新密码",Toast.LENGTH_SHORT).show();
            return;
        }else if(Xmima1.length()<6){
            Toast.makeText(this,"请输入长度为6-16的新密码",Toast.LENGTH_SHORT).show();
            return;
        } else if(TextUtils.isEmpty(Xmima2)){
            Toast.makeText(this,"请输入确认密码",Toast.LENGTH_SHORT).show();
            return;
        } else if(!Xmima1.equals(Xmima2)){
            Toast.makeText(this,"两次输入的新密码不一致",Toast.LENGTH_SHORT).show();
            return;
        } else {
            mima = Xmima1;
            AlertDialog.Builder dialog = new AlertDialog.Builder(GmimaActivity.this);
            dialog.setTitle("修改密码成功。");
            dialog.setMessage("请重新登录!!!");
            dialog.getContext();
            dialog.setCancelable(false);
            dialog.setPositiveButton("是", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(GmimaActivity.this, LoginActivity.class);
                    intent.putExtra("mima",mima);
                    startActivity(intent);
                }
            });
            dialog.show();
        }
    }
}
