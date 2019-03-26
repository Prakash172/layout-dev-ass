package com.tvs.androidlevelone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ScreenThree extends AppCompatActivity implements View.OnClickListener {

    EditText input;
//    Button clear;

    Button one,two,three,four,five,six,seven,eight,nine,zero,star,has,call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_three);
        one =findViewById(R.id.button_1);
        two =findViewById(R.id.button_2);
        three =findViewById(R.id.button_3);
        four =findViewById(R.id.button_4);
        five =findViewById(R.id.button_5);
        six =findViewById(R.id.button_6);
        seven =findViewById(R.id.button_7);
        eight =findViewById(R.id.button_8);
        nine =findViewById(R.id.button_9);
        zero =findViewById(R.id.button_0);
        star =findViewById(R.id.button_star);
        has =findViewById(R.id.button_has);
        call = findViewById(R.id.call_btn);
//        clear = findViewById(R.id.clear_btn);
        // to disable input
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM,
                WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);

        one.setText(Html.fromHtml(getResources().getString(R.string.one)));
        two.setText(Html.fromHtml(getResources().getString(R.string.two)));
        three.setText(Html.fromHtml(getResources().getString(R.string.three)));
        four.setText(Html.fromHtml(getResources().getString(R.string.four)));
        five.setText(Html.fromHtml(getResources().getString(R.string.five)));
        six.setText(Html.fromHtml(getResources().getString(R.string.six)));
        seven.setText(Html.fromHtml(getResources().getString(R.string.seven)));
        eight.setText(Html.fromHtml(getResources().getString(R.string.eight)));
        nine.setText(Html.fromHtml(getResources().getString(R.string.nine)));
        zero.setText(Html.fromHtml(getResources().getString(R.string.zero)));
        star.setText(Html.fromHtml(getResources().getString(R.string.star)));
        has.setText(Html.fromHtml(getResources().getString(R.string.has)));
        input = findViewById(R.id.input_et);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        star.setOnClickListener(this);
        has.setOnClickListener(this);
        input.setOnClickListener(this);
        call.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){

            case R.id.button_1:
                input.setText(input.getText().append("1"));
                break;
            case R.id.button_2:
                input.setText(input.getText().append("2"));
                break;
            case R.id.button_3:
                input.setText(input.getText().append("3"));
                break;
            case R.id.button_4:
                input.setText(input.getText().append("4"));

                break;
            case R.id.button_5:
                input.setText(input.getText().append("5"));

                break;
            case R.id.button_6:
                input.setText(input.getText().append("6"));

                break;
            case R.id.button_7:
                input.setText(input.getText().append("7"));

                break;
            case R.id.button_8:
                input.setText(input.getText().append("8"));

                break;
            case R.id.button_9:
                input.setText(input.getText().append("9"));

                break;
            case R.id.button_0:
                input.setText(input.getText().append("0"));

                break;
            case R.id.button_star:
                input.setText(input.getText().append("*"));

                break;
            case R.id.button_has:
                input.setText(input.getText().append("#"));

                break;
            case R.id.input_et:
                if(!TextUtils.isEmpty(input.getText())){
                    input.setText(input.getText().toString().substring(0,input.getText().toString().length()-1));
                }
            case R.id.call_btn:
                Toast.makeText(this, "Calling.....", Toast.LENGTH_SHORT).show();
        }
    }
}
