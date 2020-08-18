package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    protected Button btn;
    protected EditText edtxt1;
    protected EditText edtxt2;

    public static final String EXTRA_NUMBER1= "com.example.intentsproj.EXTRA_NUMBER1";
    public static final String EXTRA_NUMBER2 = "com.example.intentsproj.EXTRA_NUMBER2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        OnOkbuttonclick();
    }
    protected void OnOkbuttonclick(){
        btn = (Button) findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(getApplicationContext(),"You just clicked the OK button",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
                t.show();
                OpenSecdAct();
            }
        });
    }
    protected void OpenSecdAct(){
        edtxt1 = (EditText) findViewById(R.id.edtx1);
        edtxt2 = (EditText) findViewById(R.id.edtx2);
        double value1 = Double.parseDouble(edtxt1.getText().toString());
        double value2 = Double.parseDouble(edtxt2.getText().toString());;

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(EXTRA_NUMBER1,value1);
        intent.putExtra(EXTRA_NUMBER2,value2);
        startActivity(intent);
    }


}