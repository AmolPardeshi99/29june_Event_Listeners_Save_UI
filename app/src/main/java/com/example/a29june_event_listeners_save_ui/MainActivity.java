package com.example.a29june_event_listeners_save_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEtenter;
    private TextView mTvname;
    private Button mBtnclick;
    private String mStrname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        mEtenter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()>6){
                    Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                    mStrname = s.toString();
                }

            }
        });
        mBtnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvname.setText(mStrname);
                Toast.makeText(MainActivity.this,"Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }



    private void initViews(){

        mEtenter = findViewById(R.id.etEnter);
        mTvname = findViewById(R.id.tvShowname);
        mBtnclick = findViewById(R.id.btnClick);
    }


}