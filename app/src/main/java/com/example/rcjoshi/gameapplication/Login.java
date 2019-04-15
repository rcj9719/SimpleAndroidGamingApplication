package com.example.rcjoshi.gameapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Login extends AppCompatActivity {

    AppCompatButton mLogin;
    ImageView mProflogo;
    EditText mUser;
    //EditText mPassword;
    Uri uri;
    Bitmap bitmap;
    String picpath="";
    int count=1;
    /*@Override
    public void onBackPressed()
    {
        if (count>1)
        {
            Intent i = new Intent(Intent.ACTION_MAIN);
            i.addCategory(Intent.CATEGORY_HOME);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this, "Tap again to close", Toast.LENGTH_SHORT).show();
            count++;
        }
    }
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLogin = (AppCompatButton) findViewById(R.id.loginbtn);
        mProflogo= (ImageView) findViewById(R.id.proflogo);
        mUser = (EditText) findViewById(R.id.username);
        //mPassword = (EditText) findViewById(R.id.password);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mUser.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Field is blank", Toast.LENGTH_SHORT).show();
                }
                else if (picpath.equals(""))
                {
                    picpath="drawable/logo.jpg";
                    SharedPreferences sd = getSharedPreferences("logindata", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = sd.edit();
                    ed.putString("pic", picpath);
                    ed.putString("username", mUser.getText().toString());
                    ed.commit();

                    Intent iMain = new Intent(Login.this, MainActivity.class);
                    startActivity(iMain);
                    mUser.setText("");

                    /*
                    To create an intent on a button click to open a web site in a browesr, we use:
                    Intent iMain = new Intent(Intent.ACTION_VIEW);
                    iMain.setData(uri.parse("https://www.google.com"));
                    */

                }
                else
                {
                    SharedPreferences sd = getSharedPreferences("logindata", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = sd.edit();
                    ed.putString("pic", picpath);
                    ed.putString("username", mUser.getText().toString());
                    ed.commit();

                    Intent iMain = new Intent(Login.this, MainActivity.class);
                    startActivity(iMain);
                    mUser.setText("");
                }
            }
        });

        mProflogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iGallery = new Intent();
                iGallery.setType("image/*");
                iGallery.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(iGallery,"Select Picture"),7);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode==RESULT_OK && requestCode==7)
        {
            try {
                uri = data.getData();
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),uri);
                mProflogo.setImageBitmap(bitmap);
                mProflogo.setMaxHeight(200);
                mProflogo.setMaxWidth(200);
                picpath = uri.toString();

            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
