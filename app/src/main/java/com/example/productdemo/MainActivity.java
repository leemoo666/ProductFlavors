package com.example.productdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMain = findViewById(R.id.tvMain);
        tvMain.setText(BuildConfig.BASE_API_URL);
//        Log.i("lxm","base_url = "+BuildConfig.BASE_API_URL);
    }
}
