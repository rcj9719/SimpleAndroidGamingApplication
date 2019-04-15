package com.example.rcjoshi.gameapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatButton mBtn00,mBtn01,mBtn02,mBtn10,mBtn11,mBtn12,mBtn20,mBtn21,mBtn22;
    int cnt=0;


    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Exit");
        //alert.setIcon(R.)
        alert.setMessage("Do you want to exit or reset?");
        alert.setPositiveButton("Reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                reset();
            }
        });
        alert.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alert.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn00= (AppCompatButton) findViewById(R.id.b00);
        mBtn01= (AppCompatButton) findViewById(R.id.b01);
        mBtn02= (AppCompatButton) findViewById(R.id.b02);
        mBtn10= (AppCompatButton) findViewById(R.id.b10);
        mBtn11= (AppCompatButton) findViewById(R.id.b11);
        mBtn12= (AppCompatButton) findViewById(R.id.b12);
        mBtn20= (AppCompatButton) findViewById(R.id.b20);
        mBtn21= (AppCompatButton) findViewById(R.id.b21);
        mBtn22= (AppCompatButton) findViewById(R.id.b22);

        mBtn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt<=9 && mBtn00.getText().toString().equals(""))
                {
                    if (cnt%2==0)
                        mBtn00.setText("U");
                    else
                        mBtn00.setText("ME");
                    cnt++;
                    checkWin();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Already filled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBtn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt<=9 && mBtn01.getText().toString().equals(""))
                {
                    if (cnt%2==0)
                        mBtn01.setText("U");
                    else
                        mBtn01.setText("ME");
                    cnt++;
                    checkWin();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Already filled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBtn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt<=9 && mBtn02.getText().toString().equals(""))
                {
                    if (cnt%2==0)
                        mBtn02.setText("U");
                    else
                        mBtn02.setText("ME");
                    cnt++;
                    checkWin();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Already filled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt<=9 && mBtn10.getText().toString().equals(""))
                {
                    if (cnt%2==0)
                        mBtn10.setText("U");
                    else
                        mBtn10.setText("ME");
                    cnt++;
                    checkWin();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Already filled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt<=9 && mBtn11.getText().toString().equals(""))
                {
                    if (cnt%2==0)
                        mBtn11.setText("U");
                    else
                        mBtn11.setText("ME");
                    cnt++;
                    checkWin();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Already filled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt<=9 && mBtn12.getText().toString().equals(""))
                {
                    if (cnt%2==0)
                        mBtn12.setText("U");
                    else
                        mBtn12.setText("ME");
                    cnt++;
                    checkWin();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Already filled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt<=9 && mBtn20.getText().toString().equals(""))
                {
                    if (cnt%2==0)
                        mBtn20.setText("U");
                    else
                        mBtn20.setText("ME");
                    cnt++;
                    checkWin();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Already filled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt<=9 && mBtn21.getText().toString().equals(""))
                {
                    if (cnt%2==0)
                        mBtn21.setText("U");
                    else
                        mBtn21.setText("ME");
                    cnt++;
                    checkWin();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Already filled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt<=9 && mBtn22.getText().toString().equals(""))
                {
                    if (cnt%2==0)
                        mBtn22.setText("U");
                    else
                        mBtn22.setText("ME");
                    cnt++;
                    checkWin();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Already filled", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void checkWin()
    {
        if ((mBtn00.getText().toString().equals(mBtn01.getText().toString()))&& (mBtn00.getText().toString().equals(mBtn02.getText().toString())))
        {
            if (mBtn00.getText().toString().equals("U"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
            else if (mBtn00.getText().toString().equals("ME"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
        }
        else if ((mBtn10.getText().toString().equals(mBtn11.getText().toString()))&& (mBtn10.getText().toString().equals(mBtn12.getText().toString())))
        {
            if (mBtn10.getText().toString().equals("U"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
            else if (mBtn10.getText().toString().equals("ME"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
        }
        else if ((mBtn20.getText().toString().equals(mBtn21.getText().toString()))&& (mBtn20.getText().toString().equals(mBtn22.getText().toString())))
        {
            if (mBtn20.getText().toString().equals("U"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
            else if (mBtn20.getText().toString().equals("ME"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
        }
        else if ((mBtn00.getText().toString().equals(mBtn10.getText().toString()))&& (mBtn00.getText().toString().equals(mBtn20.getText().toString())))
        {
            if (mBtn00.getText().toString().equals("U"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
            else if (mBtn00.getText().toString().equals("ME"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
        }
        else if ((mBtn01.getText().toString().equals(mBtn11.getText().toString()))&& (mBtn01.getText().toString().equals(mBtn21.getText().toString())))
        {
            if (mBtn01.getText().toString().equals("U"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
            else if (mBtn01.getText().toString().equals("ME"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
        }
        else if ((mBtn02.getText().toString().equals(mBtn12.getText().toString()))&& (mBtn02.getText().toString().equals(mBtn22.getText().toString())))
        {
            if (mBtn02.getText().toString().equals("U"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
            else if (mBtn02.getText().toString().equals("ME"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
        }
        else if ((mBtn00.getText().toString().equals(mBtn11.getText().toString()))&& (mBtn00.getText().toString().equals(mBtn22.getText().toString())))
        {
            if (mBtn00.getText().toString().equals("U"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
            else if (mBtn00.getText().toString().equals("ME"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
        }
        else if ((mBtn20.getText().toString().equals(mBtn11.getText().toString()))&& (mBtn20.getText().toString().equals(mBtn02.getText().toString())))
        {
            if (mBtn20.getText().toString().equals("U"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
            else if (mBtn20.getText().toString().equals("ME"))
            {
                Intent iWin = new Intent(MainActivity.this,Win.class);
                startActivity(iWin);
                reset();
            }
        }
        else if (cnt==9)
        {
            Intent iDraw = new Intent(MainActivity.this,GameDraw.class);
            startActivity(iDraw);
            reset();
        }
    }
    public void reset()
    {
        mBtn01.setText("");
        mBtn00.setText("");
        mBtn01.setText("");
        mBtn02.setText("");
        mBtn10.setText("");
        mBtn11.setText("");
        mBtn12.setText("");
        mBtn20.setText("");
        mBtn21.setText("");
        mBtn22.setText("");
        cnt=0;
    }
}
