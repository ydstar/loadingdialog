package com.dialog.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.loading.dialog.AndroidLoadingDialog;
import com.loading.dialog.IOSLoadingDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAndroidDialog(View view) {
        AndroidLoadingDialog iosLoadingDialog = new AndroidLoadingDialog().setOnTouchOutside(true);
        iosLoadingDialog.show(getFragmentManager(), "AndroidLoadingDialog");
    }

    public void showIOSDialog(View view) {
        IOSLoadingDialog iosLoadingDialog = new IOSLoadingDialog().setOnTouchOutside(true);
        iosLoadingDialog.show(getFragmentManager(), "iosLoadingDialog");
    }
}
