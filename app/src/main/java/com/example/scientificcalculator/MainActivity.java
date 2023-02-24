package com.example.scientificcalculator

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero, buttonDot, buttonPi, buttonEquals, buttonPlus, buttonMinus, buttonMultiply, buttonDivision, buttonInverse, buttonSqrt, buttonSquare, buttonFactorial, buttonLn, buttonLog, buttonTan, buttonCos, buttonSin, buttonBracketOpen, buttonBracketClose, buttonClear, buttonAllClear;
    TextView textViewMain, textViewTop;
    String pi = "3.14159265";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //** hiding app bar ->
        Objects.requireNonNull(getSupportActionBar()).hide();

        //** Hiding the top status bar.
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);


        //** finding by Id ->
        buttonZero = findViewById(R.id.button_zero);
        buttonOne = findViewById(R.id.button_one);
        buttonTwo = findViewById(R.id.button_two);
        buttonThree = findViewById(R.id.button_three);
        buttonFour = findViewById(R.id.button_four);
        buttonFive = findViewById(R.id.button_five);
        buttonSix = findViewById(R.id.button_six);
        buttonSeven = findViewById(R.id.button_seven);
        buttonEight = findViewById(R.id.button_eight);
        buttonNine = findViewById(R.id.button_nine);


        buttonPi = findViewById(R.id.button_pi);
        buttonDot = findViewById(R.id.button_dot);
        buttonEquals = findViewById(R.id.button_equal);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonDivision = findViewById(R.id.button_divide);


        buttonInverse = findViewById(R.id.button_inverse);
        buttonSqrt = findViewById(R.id.button_sqrt);
        buttonSquare = findViewById(R.id.button_square);
        buttonFactorial = findViewById(R.id.button_factorial);
        buttonLn = findViewById(R.id.button_ln);
        buttonLog = findViewById(R.id.button_log);


        buttonSin = findViewById(R.id.button_sin);
        buttonCos = findViewById(R.id.button_cos);
        buttonTan = findViewById(R.id.button_tan);


        buttonBracketOpen = findViewById(R.id.button_bracket_poen);
        buttonBracketClose = findViewById(R.id.button_bracket_closed);


        buttonClear = findViewById(R.id.button_clear);
        buttonAllClear = findViewById(R.id.button_all_clear);


        textViewMain = findViewById(R.id.text_view_main);
        textViewTop = findViewById(R.id.text_view_top);


        //** on click listeners ->
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "0");
            }
        });


        buttonOne.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "1");
            }
        });


        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "2");
            }
        });


        buttonThree.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "3");
            }
        });


        buttonFour.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "4");
            }
        });


        buttonFive.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "5");
            }
        });


        buttonSix.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "6");
            }
        });


        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "7");
            }
        });


        buttonEight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "8");
            }
        });


        buttonNine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "9");
            }
        });


        buttonDot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + ".");
            }
        });


        buttonAllClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewMain.setText("");
                textViewTop.setText("");
            }
        });


        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //?? remove 1 value from the end ->
                String value = textViewMain.getText().toString();
                value = value.substring(0, value.length() - 1);
                textViewMain.setText(value);
            }
        });


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "+");
            }
        });


        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "-");
            }
        });


        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "×");
            }
        });


        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "÷");
            }
        });


        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                //** calculating sqrt ->
                String value = textViewMain.getText().toString();
                double sqrt = Math.sqrt(Double.parseDouble(value));
                textViewMain.setText(String.valueOf(sqrt));

                //** showing the under root sign with number at the top textView ->
                textViewTop.setText("√" + value);
            }
        });


        buttonBracketOpen.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "(");
            }
        });


        buttonBracketClose.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + ")");
            }
        });


        buttonPi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewTop.setText(buttonPi.getText());
                textViewMain.setText(textViewMain.getText() + pi);
            }
        });


        buttonSin.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "sin");
            }
        });


        buttonCos.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "cos");
            }
        });


        buttonTan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "tan");
            }
        });


        buttonInverse.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "^" + "(-1)");
            }
        });


        buttonFactorial.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(textViewMain.getText().toString());

                //** calculating factorial by the function made below ->
                int fact = factorial(value);
                textViewMain.setText(String.valueOf(fact));

                //** showing the ! sign with number at the top textView ->
                textViewTop.setText(value + "!");
            }
        });


        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double value = Double.parseDouble(textViewMain.getText().toString());
                double square = value * value;
                textViewMain.setText(String.valueOf(square));

                //** showing the ² sign with number at the top textView ->
                textViewTop.setText(value + "²");
            }
        });


        buttonLn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "ln");
            }
        });


        buttonLog.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textViewMain.setText(textViewMain.getText() + "log");
            }
        });


        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = textViewMain.getText().toString();

                String replacedString = value.replace('÷', '/').replace('×', '*');

                double result = eval(replacedString);
                textViewMain.setText(String.valueOf(result));
                textViewTop.setText(value);
            }
        });


    }


    //------------------------------------------------------------------------------------------------------------------------------------------------


    //?? factorial function ->
    int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }


    //------------------------------------------------------------------------------------------------------------------------------------------------


    //?? custom evaluation method for when user clicks on = button ->
    public static double eval(final String str) {
        return new Object() {
            int position = -1, character;

            void nextChar() {
                character = (++position < str.length()) ? str.charAt(position) : -1;
            }

            boolean calculate(int charToNum) {
                while (character == ' ') nextChar();
                if (character == charToNum) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (position < str.length()) throw new RuntimeException("Unexpected: " + (char) character);
                return x;
            }


            double parseExpression() {
                double number = parseTerm();
                for (; ; ) {

                    //** adding ->
                    if (calculate('+')) number += parseTerm(); // addition

                        //** subtraction ->
                    else if (calculate('-')) number -= parseTerm(); // subtraction
                    else return number;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    //** multiply ->
                    if (calculate('*')) x *= parseFactor(); // multiplication

                        //** divide ->
                    else if (calculate('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (calculate('+')) return parseFactor(); // unary plus
                if (calculate('-')) return -parseFactor(); // unary minus

                double result;
                int startPos = this.position;
                if (calculate('(')) { // parentheses
                    result = parseExpression();
                    calculate(')');
                } else if ((character >= '0' && character <= '9') || character == '.') { // numbers
                    while ((character >= '0' && character <= '9') || character == '.') nextChar();
                    result = Double.parseDouble(str.substring(startPos, this.position));
                } else if (character >= 'a' && character <= 'z') { // functions
                    while (character >= 'a' && character <= 'z') nextChar();
                    String func = str.substring(startPos, this.position);
                    result = parseFactor();

                    //** calculating named operators ->
                    switch (func) {
                        case "sqrt":
                            result = Math.sqrt(result);
                            break;
                        case "sin":
                            result = Math.sin(Math.toRadians(result));
                            break;
                        case "cos":
                            result = Math.cos(Math.toRadians(result));
                            break;
                        case "tan":
                            result = Math.tan(Math.toRadians(result));
                            break;
                        case "log":
                            result = Math.log10(result);
                            break;
                        case "ln":
                            result = Math.log(result);
                            break;
                        default:
                            throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char) character);
                }

                if (calculate('^')) result = Math.pow(result, parseFactor());

                return result;
            }
        }.parse();
    }

}
