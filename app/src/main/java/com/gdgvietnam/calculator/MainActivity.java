package com.gdgvietnam.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSetting = (Button) findViewById(R.id.btn_setting);
        Button btnBracketLeft = (Button) findViewById(R.id.btn_bracket_left);
        Button btnBracketRight = (Button) findViewById(R.id.btn_bracket_right);
        Button btnAllClear = (Button) findViewById(R.id.btn_all_clear);
        Button btnDelete = (Button) findViewById(R.id.btn_delete);

        Button btnN7 = (Button) findViewById(R.id.btn_n7);
        Button btnN8 = (Button) findViewById(R.id.btn_n8);
        Button btnN9 = (Button) findViewById(R.id.btn_n9);
        Button btnN6 = (Button) findViewById(R.id.btn_n6);
        Button btnN5 = (Button) findViewById(R.id.btn_n5);
        Button btnN4 = (Button) findViewById(R.id.btn_n4);
        Button btnN3 = (Button) findViewById(R.id.btn_n3);
        Button btnN2 = (Button) findViewById(R.id.btn_n2);
        Button btnN1 = (Button) findViewById(R.id.btn_n1);
        Button btnN0 = (Button) findViewById(R.id.btn_n0);

        Button btnDot = (Button) findViewById(R.id.btn_dot);
        Button btnAdd = (Button) findViewById(R.id.btn_add);
        Button btnMinus = (Button) findViewById(R.id.btn_minus);
        Button btnSub = (Button) findViewById(R.id.btn_sub);
        Button btnMulti = (Button) findViewById(R.id.btn_multi);

        Button btnResult = (Button) findViewById(R.id.btn_result);


        btnResult.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                TextView tvResult = (TextView) findViewById(R.id.tv_show_result);
                tvResult.setText("Hello World");
            }
        });

    }
}
