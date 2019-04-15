package com.example.rcjoshi.gameapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Win extends AppCompatActivity {


    Uri uri;
    //String mUname,mUpic;
    TextView mUsername;
    ImageView mImgView;
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);


        mImgView = (ImageView) findViewById(R.id.profpic);
        mUsername = (TextView) findViewById(R.id.Uname);
        SharedPreferences sd = getSharedPreferences("logindata", Context.MODE_PRIVATE);
        String mUname = sd.getString("username","");
        String mUpic = sd.getString("pic","");
        uri = uri.parse(mUpic);

        mUsername.setText(mUname);

        try
        {
            bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),uri);
            mImgView.setImageBitmap(bitmap);

        }
        catch(Exception ex)
        {
            Toast.makeText(getApplicationContext(), ""+ex, Toast.LENGTH_SHORT).show();
        }

    }
}
