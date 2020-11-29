package com.example.beanstalk;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity {

    Button menu1, menu2, menu3, menu4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu1 = (Button) findViewById(R.id.btn_menu1);
        menu2 = (Button) findViewById(R.id.btn_menu2);
        menu3 = (Button) findViewById(R.id.btn_menu3);
        menu4 = (Button) findViewById(R.id.btn_menu4);

        menu2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, Fragment1_1.class);
                startActivity(intent);
                Toast.makeText(MenuActivity.this, "다음창으로 넘어갑니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
