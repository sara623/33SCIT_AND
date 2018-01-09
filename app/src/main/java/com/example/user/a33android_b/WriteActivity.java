package com.example.user.a33android_b;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;

public class WriteActivity extends AppCompatActivity {

    private ImageButton btnStartdate;
    private TextView startdateText;

    private int sYear;
    private int sMonth;
    private int sDate;

    static final int Date_Dialog_ID = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        /* 시작일 */
        btnStartdate = (ImageButton) findViewById(R.id.btnStartdate);
        startdateText = (TextView) findViewById(R.id.startdateText);


        btnStartdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(Date_Dialog_ID);
            }
        });

        final Calendar calendar = Calendar.getInstance();
        sYear = calendar.get(calendar.YEAR);
        sMonth = calendar.get(calendar.MONTH);
        sDate = calendar.get(calendar.DATE);

        updateDate(); // 텍스트뷰에 날짜 표시하는 메소드 불러오기
    }

    /* 텍스트뷰에 날짜를 나타내는 메소드 */
    public void updateDate() {
        String str = sYear + "년" + sMonth + "월" + sDate + "일";
        startdateText.setText(str);
    }

    /* 설정한 날짜로 변경하기 위한 메소드 */
    private DatePickerDialog.OnDateSetListener sDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
            /* 멤버필드 갱신 */
            sYear = year;
            sMonth = month;
            sDate = day;

            updateDate(); // 텍스트뷰를 갱신하기 위해 호출
        }
    };

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case Date_Dialog_ID:
                return new DatePickerDialog(this, sDateSetListener, sYear,sMonth, sDate);
        }
        return null;
    }

    /* 취소버튼 (되돌아가기) */
    public void btnReturn(View view) {
        finish();
    }
}
