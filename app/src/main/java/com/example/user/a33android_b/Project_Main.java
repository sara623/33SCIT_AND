package com.example.user.a33android_b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Project_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project__main);
    }

    public void btnCancel(View view) {
        finish();
    }

    public void btnOk(View view) {
        Intent intent = new Intent(Project_Main.this, MainBtnActivity.class);
        startActivity(intent);
    }
}
