package com.love.juae.goodhabits;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class AddContactActivity extends AppCompatActivity {
    private EditText et_name;
    private Button btn_Tcount, btn_Tcheck, btn_Tstopwatch;
    private ArrayList<Button> btn_daylist = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcontact);
        et_name = (EditText) findViewById(R.id.et_name);
        btn_Tcount = (Button) findViewById(R.id.btn_Tcount);
        btn_Tcheck = (Button) findViewById(R.id.btn_Tcheck);
        btn_Tstopwatch = (Button) findViewById(R.id.btn_Tstopwatch);

        //daylist 순서 월(0) ~ 일(6)
        btn_daylist.add((Button) findViewById(R.id.btn_mon));
        btn_daylist.add((Button) findViewById(R.id.btn_tue));
        btn_daylist.add((Button) findViewById(R.id.btn_wed));
        btn_daylist.add((Button) findViewById(R.id.btn_thu));
        btn_daylist.add((Button) findViewById(R.id.btn_fri));
        btn_daylist.add((Button) findViewById(R.id.btn_sat));
        btn_daylist.add((Button) findViewById(R.id.btn_sun));

    }

}
