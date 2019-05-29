package com.example.proninhw311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView inputdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputdata = findViewById(R.id.inputedText);

        Button button0 = findViewById(R.id.btn_0);
        Button button1 = findViewById(R.id.btn_1);
        Button button2 = findViewById(R.id.btn_2);
        Button button3 = findViewById(R.id.btn_3);
        Button button4 = findViewById(R.id.btn_4);
        Button button5 = findViewById(R.id.btn_5);
        Button button6 = findViewById(R.id.btn_6);
        Button button7 = findViewById(R.id.btn_7);
        Button button8 = findViewById(R.id.btn_8);
        Button button9 = findViewById(R.id.btn_9);
        Button buttonminus = findViewById(R.id.btn_minus);
        Button buttonplus = findViewById(R.id.btn_plus);
        Button buttonmult = findViewById(R.id.btn_multiplication);
        Button buttondiv = findViewById(R.id.btn_division);
        Button buttoneq = findViewById(R.id.btn_equals);
        button0.setOnClickListener(mClickListener);
        button1.setOnClickListener(mClickListener);
        button2.setOnClickListener(mClickListener);
        button3.setOnClickListener(mClickListener);
        button4.setOnClickListener(mClickListener);
        button5.setOnClickListener(mClickListener);
        button6.setOnClickListener(mClickListener);
        button7.setOnClickListener(mClickListener);
        button8.setOnClickListener(mClickListener);
        button9.setOnClickListener(mClickListener);
        buttonminus.setOnClickListener(mClickListener);
        buttonplus.setOnClickListener(mClickListener);
        buttonmult.setOnClickListener(mClickListener);
        buttondiv.setOnClickListener(mClickListener);
        buttoneq.setOnClickListener(mClickListener);
    }

    private View.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btn_0:
                    break;
                case R.id.btn_1:
                    break;
                case R.id.btn_2:
                    break;
                case R.id.btn_3:
                    break;
                case R.id.btn_4:
                    break;
                case R.id.btn_5:
                    break;
                case R.id.btn_6:
                    break;
                case R.id.btn_7:
                    break;
                case R.id.btn_8:
                    break;
                case R.id.btn_9:
                    break;
                case R.id.btn_minus:
                    break;
                case R.id.btn_plus:
                    break;
                case R.id.btn_multiplication:
                    break;
                case R.id.btn_division:
                    break;
                case R.id.btn_equals:
                    break;
                default:
                    break;
            }
        }
    };
}
