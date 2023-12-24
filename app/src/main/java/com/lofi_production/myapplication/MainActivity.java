package com.lofi_production.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();

    }
    private void init(){
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
    }

    public void Check(View view){

        Button btnCurrent = (Button) view;

        if (btnCurrent.getText().toString().equals("")){
            count++;

        if (flag == 0){
            btnCurrent.setText("X");
            flag =1;
        }else {
            btnCurrent.setText("O");
            flag = 0;
        }
        if (count>4){
            b1 = button1.getText().toString();
            b2 = button2.getText().toString();
            b3 = button3.getText().toString();
            b4 = button4.getText().toString();
            b5 = button5.getText().toString();
            b6 = button6.getText().toString();
            b7 = button7.getText().toString();
            b8 = button8.getText().toString();
            b9 = button9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                    Toast.makeText(this, "Winner is: "+b1, Toast.LENGTH_SHORT).show();
                    Restart();
                }
                else if (b4.equals(b5) && b5.equals(b6) && !b6.equals("")) {
                    Toast.makeText(this, "Winner is: "+b4, Toast.LENGTH_SHORT).show();
                    Restart();
                }
                else if (b7.equals(b8) && b8.equals(b9) && !b9.equals("")) {
                    Toast.makeText(this, "Winner is: "+b7, Toast.LENGTH_SHORT).show();
                    Restart();
                }
                else if (b1.equals(b4) && b4.equals(b7) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is: "+b1, Toast.LENGTH_SHORT).show();
                    Restart();
                }
                else if (b2.equals(b5) && b5.equals(b8) && !b8.equals("")) {
                    Toast.makeText(this, "Winner is: "+b2, Toast.LENGTH_SHORT).show();
                    Restart();
                }
                else if (b3.equals(b6) && b6.equals(b9) && !b9.equals("")) {
                    Toast.makeText(this, "Winner is: "+b3, Toast.LENGTH_SHORT).show();
                    Restart();
                }
                else if (b1.equals(b5) && b5.equals(b9) && !b9.equals(""))  {
                    Toast.makeText(this, "Winner is: "+b1, Toast.LENGTH_SHORT).show();
                    Restart();
                }
                else if (b3.equals(b5) && b5.equals(b7) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is: "+b3, Toast.LENGTH_SHORT).show();
                    Restart();
                } else if (!b1.equals("") && !b2.equals("") && !b3.equals("") &&
                           !b4.equals("") && !b5.equals("") && !b6.equals("") &&
                           !b7.equals("") && !b8.equals("") && !b9.equals(""))
                {
                    Toast.makeText(this, "Game is Draw", Toast.LENGTH_SHORT).show();
                    Restart();
                }
        }
        }
    }
    public void Restart(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        flag = 0;
        count = 0;
    }
}