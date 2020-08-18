package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    protected EditText etxt3,etxt4;
    protected Button btc;
    private TextView txv;
    double tot = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        double v1 = i.getDoubleExtra(FirstActivity.EXTRA_NUMBER1,0);
        double v2 = i.getDoubleExtra(FirstActivity.EXTRA_NUMBER2,0);


        etxt3 = (EditText) findViewById(R.id.edtx3);
        etxt4 = (EditText) findViewById(R.id.edtx4);

        etxt3.setText(""+v1);
        etxt4.setText(""+v2);

        plusBtnClick(v1,v2);
        subBtnClick(v1,v2);
        mulBtnClick(v1,v2);
        DiveBtnClick(v1,v2);

    }
    protected void plusBtnClick(final double x,final double y){
        btc = (Button) findViewById(R.id.btnp);
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tot = x + y;
                txv = (TextView) findViewById(R.id.resultshow);
                txv.setText(""+ x + " + "+y+" = "+tot);
            }
        });
    }
    protected void subBtnClick(final double x,final double y){
        btc = (Button) findViewById(R.id.btns);
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tot = x - y;
                txv = (TextView) findViewById(R.id.resultshow);
                txv.setText(""+ x + " - "+y+" = "+tot);
            }
        });
    }
    protected void mulBtnClick(final double x,final double y){
        btc = (Button) findViewById(R.id.btnm);
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tot = x * y;
                txv = (TextView) findViewById(R.id.resultshow);
                txv.setText(""+ x + " * "+y+" = "+tot);
            }
        });
    }
    protected void DiveBtnClick(final double x,final double y){
        btc = (Button) findViewById(R.id.btnd);
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tot = x / y;
                txv = (TextView) findViewById(R.id.resultshow);
                txv.setText(""+ x + " / "+y+" = "+tot);
            }
        });
    }
}