package com.t3h.DuoiHinhBatChu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity  extends Activity implements View.OnClickListener{

    private Button btnstart,btnexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        initViews();
    }

    private void initViews() {
        btnstart = (Button) findViewById(R.id.btnstartmenu);
        btnexit = (Button) findViewById(R.id.btnexitmenu);
        btnstart.setOnClickListener(this);
        btnexit.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnstartmenu:
                Intent intent = new Intent();
                intent.setClass(MenuActivity.this,MyActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btnexitmenu:
                finish();
                break;

        }
    }
}
