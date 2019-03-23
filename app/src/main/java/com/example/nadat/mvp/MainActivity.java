package com.example.nadat.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements IContract.IView {
    private IContract.IPresenter mIPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIPresenter = new MainPresenter(this);
        mIPresenter.showToast();
    }

    @Override
    public void onTrue() {
        Toast.makeText(this, "TRUE", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFalse() {
        Toast.makeText(this, "FALSE", Toast.LENGTH_SHORT).show();
    }
}
