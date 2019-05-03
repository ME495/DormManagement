package com.example.activitytest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class HQ2 extends BaseActivity{
    private String zhanghao;
    private String quyu;
    private String qingshihao;
    private SharedPreferences pref;
    private TextView xingmingView;
    private TextView quyuView;
    private TextView xuehaoView;
    private TextView qinshihaoView;
    private EditText quyuEdit;
    private EditText qinshihaoEdit;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hq2_layout);
        Intent intent = getIntent();
        zhanghao = intent.getStringExtra("zhanghao");
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        xingmingView = (TextView) findViewById(R.id.edit_xingming);
        quyuView = (TextView) findViewById(R.id.edit_quyu);
        xuehaoView = (TextView) findViewById(R.id.edit_xuehao);
        qinshihaoView = (TextView) findViewById(R.id.edit_qinshihao);
        xuehaoView.setText(zhanghao);
        ArrayList<String> list = new ArrayList<>();
        list.add("学校安排");
        list.add("班级内部调整");
        list.add("退宿");
        final ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);
        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            public void onNothingSelected(AdapterView<?> arg0){

            }
        });
        Button tijiao = findViewById(R.id.button_1);
        tijiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HQ2.this, HQ1.class);
                startActivity(intent);
            }
        });

    }

}
