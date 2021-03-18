package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnSum;
    private Button btnSubtract;
    private Button btnMultiplication;
    private Button btnDivision;
    private Button btnEqual;
    private Button btnClear;
    private TextView txtResult;
    private Integer number1 = 0;
    private Integer number2 = 0;
    private Integer result;
    private String operation = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContent();
    }

    private void setContent(){
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnSum = findViewById(R.id.btnSum);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnDivision = findViewById(R.id.btnDivision);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
        txtResult = findViewById(R.id.txtResult);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnSum.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        txtResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn0){
            btnPressed("0");
        } else if (v.getId() == R.id.btn1) {
            btnPressed("1");
        } else if (v.getId() == R.id.btn2) {
            btnPressed("2");
        } else if (v.getId() == R.id.btn3) {
            btnPressed("3");
        } else if (v.getId() == R.id.btn4) {
            btnPressed("4");
        } else if (v.getId() == R.id.btn5) {
            btnPressed("5");
        } else if (v.getId() == R.id.btn6) {
            btnPressed("6");
        } else if (v.getId() == R.id.btn7) {
            btnPressed("7");
        } else if (v.getId() == R.id.btn8) {
            btnPressed("8");
        } else if (v.getId() == R.id.btn9) {
            btnPressed("9");
        }
        if (v.getId() == R.id.btnSum){
            sum();
        } else if (v.getId() == R.id.btnSubtract){
            subtract();
        } else if (v.getId() == R.id.btnMultiplication){
            multiplication();
        } else if (v.getId() == R.id.btnDivision){
            division();
        } else if (v.getId() == R.id.btnEqual){
            result();
        } else if (v.getId() == R.id.btnClear){
            clear();
        }
    }

    private void btnPressed(String caracter){
        txtResult.setText(txtResult.getText() + caracter);
    }

    private void clear(){
        txtResult.setText("");
    }

    private void result(){
        number2 = (Integer.parseInt((txtResult.getText().toString())));
        if (operation.equals("sum")){
            result = number1 + number2;
        } else if (operation.equals("substract")){
            result = number1 - number2;
        } else if (operation.equals("multiplication")){
            result = number1 * number2;
        } else if (operation.equals("division")){
            result = number1 / number2;
        }
        txtResult.setText(result.toString());
    }

    private void sum(){
        number1 = (Integer.parseInt(txtResult.getText().toString()));
        operation = "sum";
        clear();
    }

    private void subtract(){
        number1 = (Integer.parseInt(txtResult.getText().toString()));
        operation = "substract";
        clear();
    }

    private void multiplication(){
        number1 = (Integer.parseInt(txtResult.getText().toString()));
        operation = "multiplication";
        clear();
    }

    private void division(){
        number1 = (Integer.parseInt(txtResult.getText().toString()));
        operation = "division";
        clear();
    }


}