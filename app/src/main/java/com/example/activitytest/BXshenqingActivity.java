package com.example.activitytest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.other.GmimaActivity;

public class BXshenqingActivity extends AppCompatActivity {
    private String name;
    private String quyu;
    private String xuehao;
    private String qinshi;
    private String phone;
    private String content;
    private String leibie;

    private String[] list1 = {"请选择","水","电","网络维护","门禁","其他"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bxshenqing_layout);

        Intent intent = getIntent();
        xuehao = intent.getStringExtra("zhanghao");
        final EditText nameEdit = (EditText) findViewById(R.id.edit_name);
        final EditText quyuEdit = (EditText) findViewById(R.id.edit_quyu);
        final EditText xuehaoEdit = (EditText) findViewById(R.id.edit_xuehao);
        final EditText qinshiEdit = (EditText) findViewById(R.id.edit_qinshihao);
        final EditText phoneEdit = (EditText) findViewById(R.id.edit_phone);
        final EditText contentEdit = (EditText) findViewById(R.id.edit_content);
        xuehaoEdit.setText(xuehao);
        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        final ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                leibie = (String) spinner1.getSelectedItem();
            }

            public void onNothingSelected(AdapterView<?> arg0){

            }
        });
        Button button = (Button) findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameEdit.getText().toString();
                quyu = quyuEdit.getText().toString();
                xuehao = xuehaoEdit.getText().toString();
                qinshi = qinshiEdit.getText().toString();
                phone = phoneEdit.getText().toString();
                content = contentEdit.getText().toString();
                if(TextUtils.isEmpty(name)){
                    Toast.makeText(BXshenqingActivity.this,"请输入姓名",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(quyu)){
                    Toast.makeText(BXshenqingActivity.this,"请输入宿舍区",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(xuehao)){
                    Toast.makeText(BXshenqingActivity.this,"请输入学号",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(qinshi)){
                    Toast.makeText(BXshenqingActivity.this,"请输入宿舍号",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(phone)){
                    Toast.makeText(BXshenqingActivity.this,"请输入手机号",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(content)){
                    Toast.makeText(BXshenqingActivity.this,"请输入报修内容",Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(BXshenqingActivity.this);
                    dialog.setTitle("报修申请成功。");
                    dialog.getContext();
                    dialog.setCancelable(false);
                    dialog.setPositiveButton("是", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(BXshenqingActivity.this, BXzhuangtaiActivity.class);
                            startActivity(intent);
                        }
                    });
                    dialog.show();
                }
            }
        });
    }
}
