package com.example.acer.lyrics;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import com.example.acer.lyrics.SongType.English;
import com.example.acer.lyrics.SongType.Hindi;
import com.example.acer.lyrics.SongType.Latest;
import com.example.acer.lyrics.SongType.Sinhala;

public class Menu extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

    }

  public void method(View view){

      startActivity(new Intent(getApplicationContext(), English.class));

        }

    public void onClickMethod(View view) {
        if (view.getId() == R.id.tag1) {
            startActivity(new Intent(getApplicationContext(), Latest.class));
        }
        if (view.getId() == R.id.tag4) {
            startActivity(new Intent(getApplicationContext(), Hindi.class));
        }
        if (view.getId() == R.id.tag5) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/11hfW2l5pMNb-8TCz1TrcF1_C2BPXgKtI?usp=sharing"));
            startActivity(browserIntent);
        }
        if (view.getId() == R.id.tag3)
            startActivity(new Intent(getApplicationContext(), Sinhala.class));
    }}
