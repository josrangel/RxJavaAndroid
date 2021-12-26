package com.josrangel.rxjavaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.josrangel.rxjavaandroid.interfaces.MainPresenter;
import com.josrangel.rxjavaandroid.interfaces.MainView;

/**
 * Source:
 * https://www.adictosaltrabajo.com/2015/09/14/introduccion-a-rxjava-en-android/
 * https://medium.com/gradeup/simplest-rxjava-tutorial-for-android-262013ce3545
 */

public class MainActivity extends AppCompatActivity implements MainView {

    private TextView tvMain;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = findViewById(R.id.tv_main);

        presenter = new MainPresenterImpl(this);
        presenter.getListAnimals();
    }

    public void showData(String data) {
        tvMain.setText(data);
    }
}