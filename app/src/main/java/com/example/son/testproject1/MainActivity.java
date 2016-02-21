package com.example.son.testproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Toast(MainActivity.this).makeText(MainActivity.this,"출력테스트",Toast.LENGTH_SHORT).show();
    }
}
