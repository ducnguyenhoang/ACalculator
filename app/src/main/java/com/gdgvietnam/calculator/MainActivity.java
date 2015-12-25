package com.gdgvietnam.calculator;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import org.w3c.dom.Text;
import com.gdgvietnam.calculator.Expression;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    TextView tvResult;
        private String mToastWarning;
    private String mStrResult;
    private Expression mExpression;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStrResult = new String("");
        mToastWarning = "Invalid Enter";
        //Text View Result
        tvResult = (TextView) findViewById(R.id.tv_show_result);

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

        mStrResult = "";

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tvResult.setText(mStrResult);
                checkStrResult();
            }        });

        btnAllClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult = "";
                tvResult.setText(mStrResult);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStrResult.length() > 0) {
                    removeLastChar();
                    tvResult.setText(mStrResult);
                }
            }
        });

        btnBracketLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "(";
                tvResult.setText(mStrResult);
            }
        });

        btnBracketRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += ")";
                tvResult.setText(mStrResult);
            }
        });

        btnN0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "0";
            }
        });

        btnN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "1";
                tvResult.setText(mStrResult);
            }
        });

        btnN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "2";
                tvResult.setText(mStrResult);
            }
        });

        btnN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "3";
                tvResult.setText(mStrResult);
            }
        });

        btnN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "4";
                tvResult.setText(mStrResult);
            }
        });

        btnN5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "5";
                tvResult.setText(mStrResult);
            }
        });

        btnN6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "6";
                tvResult.setText(mStrResult);
            }
        });

        btnN7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "7";
                tvResult.setText(mStrResult);
            }
        });

        btnN8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "8";
                tvResult.setText(mStrResult);
            }
        });

        btnN9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "9";
                tvResult.setText(mStrResult);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStrResult.length() > 0)
                    if (checkCharacter('.')) {
                        mStrResult += ".";
                        tvResult.setText(mStrResult);
                    }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "+";
                tvResult.setText(mStrResult);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStrResult += "-";
                tvResult.setText(mStrResult);
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStrResult.length() > 0)
                    if (checkCharacter('*')) {
                        mStrResult += "*";
                        tvResult.setText(mStrResult);
                    }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStrResult.length() > 0)
                    if (checkCharacter('/')) {
                        mStrResult += "/";
                        tvResult.setText(mStrResult);
                    }
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void checkStrResult() {
        BigDecimal bigDecimalResult = null;
        Pattern expPattern = Pattern.compile("((\\d*\\.\\d+)*([\\+\\-\\*/\\(\\)]))");
        //mStrResult = mStrResult.replaceAll("\u0000","");
        Matcher matcher = expPattern.matcher(mStrResult);
        if(matcher.find()) {
            mExpression = new Expression(mStrResult);
            bigDecimalResult = mExpression.eval();
            tvResult.setText(bigDecimalResult.toString());
            mStrResult = "";
        } else {
            showToast(mToastWarning);
        }
    }
    /**
     * Show toast
    */
    protected void showToast(String toastMessage){
        Toast toast = Toast.makeText(getApplicationContext(),
                toastMessage,
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        ViewGroup group = (ViewGroup) toast.getView();
        TextView messageTextView = (TextView) group.getChildAt(0);
        messageTextView.setTextSize(25);
        toast.show();
    }

    private void removeLastChar() {
        mStrResult = mStrResult.substring(0, mStrResult.length() - 1);
    }

    private boolean checkCharacter(char c) {
        if (mStrResult.charAt(mStrResult.length() - 1) == c) {
            tvResult.setTextSize(tvResult.getTextSize()-1);
            return false;
        }else
            return true;

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.gdgvietnam.calculator/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.gdgvietnam.calculator/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}