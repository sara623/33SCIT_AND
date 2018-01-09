package com.example.user.a33android_b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainBtnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_btn);
    }

    /* 게시판 페이지 연결 */
    public void clickBoard(View view) {
        Intent intent = new Intent(MainBtnActivity.this, BoardActivity.class);
        startActivity(intent);
    }

    /* 목표작성 페이지 연결 */
    public void clickWrite(View view) {
        Intent intent2 = new Intent(MainBtnActivity.this, WriteActivity.class);
        startActivity(intent2);
    }
}
