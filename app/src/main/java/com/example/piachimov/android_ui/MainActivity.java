package com.example.piachimov.android_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btnGoToUiActivity)
    Button btnGoToUiActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnGoToUiActivity})
    public void goToUiActivity(){
        Intent uiIntent = new Intent(this, UserProfileActivity.class);
        startActivity(uiIntent);
    }
}
