package com.anbn.pinout;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    // нарисуем экран
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    // метод нажатия на кнопку
    public void onClickButtonAbout (View v) {
        //Intent intent = new  Intent(this, MainActivity.class);
        //startActivity(MainActivity.class);
        onBackPressed();// возврат на предыдущий activity
    }

}