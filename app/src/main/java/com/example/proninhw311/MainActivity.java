package com.example.proninhw311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        Button buttondev = findViewById(R.id.btn_division);
        Button buttoneq = findViewById(R.id.btn_equals);
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
