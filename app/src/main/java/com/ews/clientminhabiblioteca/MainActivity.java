package com.ews.clientminhabiblioteca;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ews.minhabiblioteca.CustomToast;
import com.ews.minhabiblioteca.Type;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = BuildConfig.URL;

    }

    public void errorClick(View view) {
        CustomToast.showToast(this, "Toast Library Adapter FIAP", Type.Error);
    }

    public void sucessClick(View view) {
        CustomToast.showToast(this, "Toast Library Adapter FIAP", Type.Success);
    }

    public void warningClick(View view) {
        CustomToast.showToast(this, "Toast Library Adapter FIAP", Type.Warning);
    }

    public void infoClick(View view) {
        CustomToast.showToast(this, "Toast Library Adapter FIAP", Type.Info);
    }

    public void defaultClick(View view) {
        CustomToast.showToast(this, "Toast Library Adapter FIAP", Type.Default);
    }
}
