package com.example.activitytest;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class XsusheActivity extends AppCompatActivity {
    private String quyu="琴湖";
    private String qingshihao;
    private String chuangweihao;
    private int a = 0;
    private int a1;

    private String[] list1 = {"请选择","琴湖","金翰林","北苑","南苑","兴湘"};
    private String[] list2_0 = {"请选择"};
    private String[] list2_1 = {"请选择","1-101","1-102","1-103","1-104","1-105","1-106","1-107","1-108","1-109","1-110","1-111","1-112","1-113","1-114","1-115","1-116","1-117","1-118","1-119","1-120","1-121","1-122","1-123","1-124","1-125","1-126","11-127","1-128","1-129","1-130"};
    private String[] list2_2= {"请选择","2-201","2-202","2-203","2-204","2-205","2-206","2-207","2-208","2-209","2-210","2-211","2-212","2-213","2-214","2-215","2-216","2-217","2-218","2-219","2-220","2-221","2-222","2-223","2-224","2-225","2-226","2-227","2-228","2-223","2-230"};
    private String[] list2_3 = {"请选择","3-301","3-302","3-303","3-304","3-305","3-306","3-307","3-308","3-309","3-310","3-311","3-312","3-313","3-314","3-15","3-316","3-317","3-318","3-319","3-320","3-321","3-322","3-323","3-324","3-325","3-326","3-327","3-328","3-329","3-330"};
    private String[] list2_4 = {"请选择","4-401","4-402","4-403","4-404","4-405","4-406","4-407","4-408","4-409","4-410","4-411","4-412","4-413","4-414","4-415","4-416","4-417","4-418","4-419","-420","4-421","4-422","4-423","4-424","4-425","4-426","4-427","4-428","4-429","4-430"};
    private String[] list2_5 = {"请选择","5-501","5-502","5-503","5-504","5-505","5-506","5-507","5-508","5-509","5-510","5-511","5-512","5-513","5-514","5-515","5-516","5-517","5-518","5-519","5-520","5-521","5-522","5-523","5-524","5-525","5-526","5-527","5-528","5-529","5-530"};
    private ArrayAdapter<String> adapter2;
    private ListView listView;
    private   Spinner spinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xsushe_layout);

        Intent intent = getIntent();
        a = intent.getIntExtra("a1",a1);
        ListView listView = (ListView) findViewById(R.id.list_view);
        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        final Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);

        final ArrayList<String> list3 = new ArrayList<>();
        list3.add("请选择");
        list3.add("1");
        list3.add("2");
        list3.add("3");
        list3.add("4");

        final ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                quyu = (String) spinner1.getSelectedItem();
                setQuyu(quyu);
            }

            public void onNothingSelected(AdapterView<?> arg0){

            }
        });
        adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list2_0);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       // listView.addHeaderView(new ViewStub(getApplicationContext()));
      //  listView.addFooterView(new ViewStub(getApplicationContext()));
       // listView.setAdapter(adapter2);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                qingshihao = (String) spinner2.getSelectedItem();
            }

            public void onNothingSelected(AdapterView<?> arg0){

            }
        });


        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                chuangweihao = (String) spinner3.getSelectedItem();

                //TextView chuangwei = (TextView) findViewById(R.id.chuangwei);
                //chuangwei.setText(adapter3.getItem(position));
            }

            public void onNothingSelected(AdapterView<?> arg0){

            }
        });


        Button button = (Button) findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a == 0){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(XsusheActivity.this);
                    dialog.setTitle("请确认是否为最终选择?");
                    dialog.setMessage("确定后无法重新选择！");
                    dialog.getContext();
                    dialog.setCancelable(false);
                    dialog.setPositiveButton("是", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if(quyu == "请选择" || qingshihao == "请选择"|| chuangweihao == "请选择"){
                                Toast.makeText(XsusheActivity.this,"选宿舍失败，请核对选宿信息",Toast.LENGTH_LONG).show();
                            }else {
                                a1 = 1;
                                AlertDialog.Builder dialog1 = new AlertDialog.Builder(XsusheActivity.this);
                                dialog1.setTitle("宿舍为:    "+quyu+qingshihao+"，"+chuangweihao+"号床位。");
                                dialog1.setMessage("恭喜选择宿舍成功！！！");
                                dialog1.getContext();
                                dialog1.setCancelable(false);
                                dialog1.setPositiveButton("是", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {

                                        Intent intent1 = new Intent(XsusheActivity.this,XsusheActivity.class);
                                        intent1.putExtra("a1",a1);
                                        startActivity(intent1);
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
                }else
                Toast.makeText(XsusheActivity.this,"您已选过，不能再继续选！",Toast.LENGTH_LONG).show();
            }
        });
    }
        private void setQuyu(String quyu){
             if(quyu.equals("请选择")){
                 adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list2_0);
             }else if(quyu.equals("琴湖")){
                 adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list2_1);
             }else if(quyu.equals("金翰林")){
                 adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list2_2);
             }else if(quyu.equals("北苑")){
                 adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list2_3);
             }else if (quyu.equals("南苑")){
                 adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list2_4);
             }else adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list2_5);
             spinner2.setAdapter(adapter2);
    ;
        }
}
