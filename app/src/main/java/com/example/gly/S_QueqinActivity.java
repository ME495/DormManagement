package com.example.gly;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.activitytest.BaseActivity;
import com.example.activitytest.QueqinTitleFragment;
import com.example.activitytest.R;

public class S_QueqinActivity extends BaseActivity implements View.OnClickListener {
    private EditText editText1;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s__queqin_layout);
        editText1 = (EditText) findViewById(R.id.edit_title);
        editText2 = (EditText) findViewById(R.id.edit_content);
        Button button = (Button) findViewById(R.id.button_1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        QueqinTitleFragment queqinTitleFragment = new QueqinTitleFragment();
        String editTexttitle = editText1.getText().toString();
        String editTextcontent = editText2.getText().toString();
        if(TextUtils.isEmpty(editTexttitle)){
            Toast.makeText(this,"请输入标题",Toast.LENGTH_SHORT).show();
            return;
        }else if(TextUtils.isEmpty(editTextcontent)){
            Toast.makeText(this,"请输入内容",Toast.LENGTH_SHORT).show();
            return;
        }
        queqinTitleFragment.refresh(editTexttitle,editTextcontent);
        AlertDialog.Builder dialog = new AlertDialog.Builder(S_QueqinActivity.this);
        dialog.setTitle("上传成功！");
        dialog.getContext();
        dialog.setCancelable(false);
        dialog.setPositiveButton("是", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(S_QueqinActivity.this, GlyActivity.class);
                startActivity(intent);
            }
        });
        dialog.show();
    }
}
