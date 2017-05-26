package com.example.trung_pc.demoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText edtID,edtPasswork;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtID= (EditText) findViewById(R.id.edtUser);
        edtPasswork= (EditText) findViewById(R.id.edtPasswork);
        btnlogin= (Button) findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(clickListener);

    }
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.btnLogin){

            }
            if (v.getId()==R.id.btnSetting){
                Intent mIntent=new Intent(LoginActivity.this,SettingActivity.class);
                startActivity(mIntent);
            }
        }
    };
}
