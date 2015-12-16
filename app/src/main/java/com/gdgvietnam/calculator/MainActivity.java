package com.gdgvietnam.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btnSetting;
    Button btnBracketLeft;
    Button btnBracketRight;
    Button btnAllClear;
    Button btnDelete;

    Button btnN7;
    Button btnN8;
    Button btnN9;
    Button btnN6;
    Button btnN5;
    Button btnN4;
    Button btnN3;
    Button btnN2;
    Button btnN1;
    Button btnN0;

    Button btnDot;
    Button btnAdd;
    Button btnMinus;
    Button btnSub;
    Button btnMulti;

    Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btnSetting = (Button) findViewById(R.id.btn_setting);
        btnBracketLeft = (Button) findViewById(R.id.btn_bracket_left);
        btnBracketRight = (Button) findViewById(R.id.btn_bracket_right);
        btnAllClear = (Button) findViewById(R.id.btn_all_clear);
        btnDelete = (Button) findViewById(R.id.btn_delete);

        btnN7 = (Button) findViewById(R.id.btn_n7);
        btnN8 = (Button) findViewById(R.id.btn_n8);
        btnN9 = (Button) findViewById(R.id.btn_n9);
        btnN6 = (Button) findViewById(R.id.btn_n6);
        btnN5 = (Button) findViewById(R.id.btn_n5);
        btnN4 = (Button) findViewById(R.id.btn_n4);
        btnN3 = (Button) findViewById(R.id.btn_n3);
        btnN2 = (Button) findViewById(R.id.btn_n2);
        btnN1 = (Button) findViewById(R.id.btn_n1);
        btnN0 = (Button) findViewById(R.id.btn_n0);

        btnDot = (Button) findViewById(R.id.btn_dot);
        btnAdd = (Button) findViewById(R.id.btn_add);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnSub = (Button) findViewById(R.id.btn_sub);
        btnMulti = (Button) findViewById(R.id.btn_multi);

        btnResult = (Button) findViewById(R.id.btn_result);


        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result = (TextView) findViewById(R.id.tv_show_result);
                result.setText("Hello world");
            }
        });

    }
}
