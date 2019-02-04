package com.example.fourfunccalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Calculator calc = new Calculator();



    public void buttonClick(View view) {
        if (view.getId() == R.id.all_clear_button) {
            calc.allClear();
        } else if (view.getId() == R.id.clear_button) {
            calc.clear();
        } else if (view.getId() == R.id.seven_button) {
            calc.keyPress('7');
        } else if (view.getId() == R.id.eight_button) {
            calc.keyPress('8');
        } else if (view.getId() == R.id.nine_button) {
            calc.keyPress('9');
        } else if (view.getId() == R.id.plus_button) {
            calc.keyPress('+');
        } else if (view.getId() == R.id.four_button) {
            calc.keyPress('4');
        } else if (view.getId() == R.id.five_button) {
            calc.keyPress('5');
        } else if (view.getId() == R.id.six_button) {
            calc.keyPress('6');
        } else if (view.getId() == R.id.minus_button) {
            calc.keyPress('-');
        } else if (view.getId() == R.id.one_button) {
            calc.keyPress('1');
        } else if (view.getId() == R.id.two_button) {
            calc.keyPress('2');
        } else if (view.getId() == R.id.three_button) {
            calc.keyPress('3');
        } else if (view.getId() == R.id.times_button) {
            calc.keyPress('x');
        } else if (view.getId() == R.id.zero_button) {
            calc.keyPress('0');
        } else if (view.getId() == R.id.point_button) {
            calc.keyPress('.');
        } else if (view.getId() == R.id.equals_button) {
            calc.keyPress('=');
        } else if (view.getId() == R.id.divide_button) {
            calc.keyPress('/');
        } else {
            throw new RuntimeException("Unknown ID in buttonClick");
        }
        updateView();
    }

    public void updateView() {
        TextView display = findViewById(R.id.display);
        display.setText(String.format(Locale.US, "%s", calc.getDisplay()));
    }

}
