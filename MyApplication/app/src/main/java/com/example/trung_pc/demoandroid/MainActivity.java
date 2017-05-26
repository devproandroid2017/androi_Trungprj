package com.example.trung_pc.demoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnChuyenList,btnChon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChuyenList= (Button) findViewById(R.id.btnChuyenList);
        btnChon= (Button) findViewById(R.id.btnChon);
        btnChuyenList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent=new Intent(MainActivity.this,ListViewExample.class);
                startActivity(mIntent);
            }
        });

    }
}
