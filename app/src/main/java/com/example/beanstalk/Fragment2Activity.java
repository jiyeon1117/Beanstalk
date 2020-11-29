package com.example.beanstalk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Fragment2Activity extends AppCompatActivity {

    // 컴퓨터 자격증 정보
    ArrayList<CertificateData> CerDateList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2);

        // 검색창 제외 메뉴바 (모든 FragmentActivity 상단에 복붙하세요.

        Button btn_1 = (Button) findViewById(R.id.btn_menu1);
        Button btn_2 = (Button) findViewById(R.id.btn_menu2);
        Button btn_3 = (Button) findViewById(R.id.btn_menu3);
        Button btn_4 = (Button) findViewById(R.id.btn_menu4);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment2Activity.this, Fragment1Activity.class);
                startActivity(intent);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment2Activity.this, Fragment2Activity.class);
                startActivity(intent);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment2Activity.this, Fragment3Activity.class);
                startActivity(intent);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment2Activity.this, Fragment4Activity.class);
                startActivity(intent);
            }
        });
        this.InitializeCerData();

        ListView listView = (ListView) findViewById(R.id.com_listview);
        final ListViewAdapter listViewAdapter = new ListViewAdapter(this, CerDateList);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "선택 " + CerDateList.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void InitializeCerData() {
        CerDateList = new ArrayList<CertificateData>();
        CerDateList.add(new CertificateData("3D프린터개발산업기사", "과학기술정보통신부, 산업통상자원부", 19400, 81000));
        CerDateList.add(new CertificateData("3D프린터운용기능사", "과학기술정보통신부, 산업통상자원부", 14500, 27000));
        CerDateList.add(new CertificateData("로봇소프트웨어개발기사", "산업통상자원부", 19400, 30300));

    }
}
