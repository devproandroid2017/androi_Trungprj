package com.example.trung_pc.demoandroid;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Locale;

public class SettingActivity extends AppCompatActivity {

    TextView txtSetting;
    Switch mASwitch;
    Button btnApply;
    //private Locale locale;
    private Locale locale=Locale.ENGLISH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        txtSetting= (TextView) findViewById(R.id.txtSetting);
        mASwitch= (Switch) findViewById(R.id.Switchlanguage);
        btnApply= (Button) findViewById(R.id.btnApply);
        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Configuration mConfiguration= getBaseContext().getResources().getConfiguration();
                if(mASwitch.isChecked()){
                     //locale=Locale.ENGLISH;
                    locale=new Locale("en_US");
                }
                else {
                    locale=new Locale("vi_VN");
                }
                mConfiguration.setLocale(locale);
                getApplicationContext().createConfigurationContext(mConfiguration);
            }
        });
    }
}
