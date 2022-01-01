package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void displayToastMsg(View v) {
        TextView tv = (TextView)findViewById(R.id.hello);
        toastMsg("The current number is " + tv.getText().toString());
    }

    public void addOne(View v)
    {
        TextView tv = (TextView)findViewById(R.id.hello);
        number = Integer.parseInt(tv.getText().toString()) + 1;
        tv.setText(Integer.toString(number));
        isNice(number);
    }

    public void random(View v){
        TextView tv = (TextView)findViewById(R.id.hello);
        Random rand = new Random();
        number = rand.nextInt(100) + 1;
        tv.setText(Integer.toString(number));
        isNice(number);
    }

    public void isNice(int num) {
        if (num == 69) {
            toastMsg("Nice");
        }
    }
}