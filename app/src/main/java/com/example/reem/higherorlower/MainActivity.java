package com.example.reem.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rn;
    int n;

    public void createToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }


    public void guess(View view){
        EditText num = findViewById(R.id.editText);
        Button guess = findViewById(R.id.button);



        Integer myNum = Integer.parseInt(num.getText().toString());

        if(n == myNum){
            createToast("That's right, Try again.");
            Random rn2 = new Random();
            n = rn.nextInt(20) + 1;

        }else if(myNum < n){
            createToast("Higher.");
        }else{
            createToast("Lower.");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         rn = new Random();
         n = rn.nextInt(20) + 1;
    }
}
