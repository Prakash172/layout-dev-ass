package com.tvs.androidlevelone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ScreenTwo extends AppCompatActivity {
    private Button mLoginBtn;
    private EditText mUsername, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);
        mLoginBtn = findViewById(R.id.login_btn);
        mUsername = findViewById(R.id.username_et);
        mPassword = findViewById(R.id.password_et);

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(mUsername.getText()) && !TextUtils.isEmpty(mPassword.getText())) {
                    if (mUsername.getText().toString().equals("admin") && mPassword.getText().toString().equals("12345")) {
                        Intent intent = new Intent(getApplicationContext(), ScreenThree.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    } else
                        Toast.makeText(ScreenTwo.this, "Enter username and password", Toast.LENGTH_SHORT).show();
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please Enter admin and 12345", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });
    }
}
