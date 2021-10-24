package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button clear;
    private Button equal;
    private Button plus;
    private Button div;
    private Button mult;
    private Button minus;
private TextView Result;
private TextView value;
private final char ADDITION='+';
    private final char MINUS='-';
    private final char DIVISION='/';
    private final char MULTIPLY='*';
    private Double val1=Double.NaN;
    private Double val2=Double.NaN;
    private char ACTION;
    private final char EQU=0;
    private Button Clear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.setText(value.getText().toString()+ "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.setText(value.getText().toString()+ "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.setText(value.getText().toString()+ "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.setText(value.getText().toString()+ "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.setText(value.getText().toString()+ "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.setText(value.getText().toString()+ "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.setText(value.getText().toString()+ "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.setText(value.getText().toString()+ "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.setText(value.getText().toString()+ "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.setText(value.getText().toString()+ "0");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
compute();
ACTION=ADDITION;
Result.setText(String.valueOf(val1) + '+');
value.setText(null);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION=MINUS;
                Result.setText(String.valueOf(val1) + '-');
                value.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=DIVISION;
                Result.setText(String.valueOf(val1) + '/');
                value.setText(null);

            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=MULTIPLY;
                Result.setText(String.valueOf(val1) + '*');
                value.setText(null);

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=EQU;
                Result.setText(Result.getText().toString()+ String.valueOf(val2) + '=' + String.valueOf(val1) );
                value.setText(null);


            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(value.getText().length()> 0){
                   CharSequence name=value.getText().toString();
                   value.setText(name.subSequence(0,name.length()-1));
               }
else{
    val1=Double.NaN;
    val2=Double.NaN;
    value.setText(null);
    Result.setText(null);
               }

            }
        });



    }

    void setupUIViews(){
        one=(Button)findViewById(R.id.btn1);
        two=(Button)findViewById(R.id.btn2);
        three=(Button)findViewById(R.id.btn3);
        four=(Button)findViewById(R.id.btn4);
        five=(Button)findViewById(R.id.btn5);
        six=(Button)findViewById(R.id.btn6);
        seven=(Button)findViewById(R.id.btn7);
        nine=(Button)findViewById(R.id.btn9);
        eight=(Button)findViewById(R.id.btn8);
        zero=(Button)findViewById(R.id.btn0);
        plus=(Button)findViewById(R.id.btnplus) ;
        minus=(Button)findViewById(R.id.btnminus) ;
        div=(Button)findViewById(R.id.btndiv) ;
        mult=(Button)findViewById(R.id.btnmultiply) ;
        equal=(Button)findViewById(R.id.btnequal) ;
        Result=(TextView)findViewById(R.id.Result) ;
        value=(TextView)findViewById(R.id.value);
        Clear=(Button)findViewById(R.id.btnclear);

    }
    void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(value.getText().toString());
            switch (ACTION){
                case ADDITION:
                    val1=val1+val2;
                    break;

                case MINUS:
                    val1=val1-val2;
                    break;

                case MULTIPLY:
                    val1=val1*val2;
                    break;

                case DIVISION:
                    val1=val1/val2;
                    break;

                case EQU:
                    break;

            }
        }

        else{
            val1=Double.parseDouble(value.getText().toString());
        }
    }
}