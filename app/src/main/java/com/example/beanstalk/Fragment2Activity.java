package com.example.beanstalk;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

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

        CerDateList.add(new CertificateData("3D프린터개발산업기사", "한국산업인력공단", 19400, 81000));
        CerDateList.add(new CertificateData("3D프린터운용기능사", "한국산업인력공단", 14500, 27000));
        CerDateList.add(new CertificateData("로봇소프트웨어개발기사", "한국산업인력공단", 19400, 30300));
        CerDateList.add(new CertificateData("로봇하드웨어개발기사", "한국산업인력공단", 19400, 54300));
        CerDateList.add(new CertificateData("멀티미디어콘텐츠제작전문가", "한국산업인력공단", 19400, 26300));
        CerDateList.add(new CertificateData("정보관리기술사", "한국산업인력공단", 67800, 87100));
        CerDateList.add(new CertificateData("정보처리기능사", "한국산업인력공단", 14500, 17200));
        CerDateList.add(new CertificateData("정보처리기사", "한국산업인력공단", 19400, 22600));
        CerDateList.add(new CertificateData("정보처리산업기사", "한국산업인력공단", 19400, 20800));
        CerDateList.add(new CertificateData("컴퓨터시스템응용기술사", "한국산업인력공단", 67800, 87100));
        CerDateList.add(new CertificateData("워드프로세서", "대한상공회의소", 15700, 17800));
        CerDateList.add(new CertificateData("컴퓨터활용능력1급", "대한상공회의소", 17800, 21000));
        CerDateList.add(new CertificateData("컴퓨터활용능력2급", "대한상공회의소", 19400, 20800));
        CerDateList.add(new CertificateData("빅데이터분석기사", "한국데이터산업진흥원", 80000, 70000));
        CerDateList.add(new CertificateData("정보보안기사", "한국인터넷진흥원", 18800, 21900));
        CerDateList.add(new CertificateData("정보보안산업기사", "한국인터넷진흥원", 18800, 20200));
        CerDateList.add(new CertificateData("게임그래픽전문가", "한국콘텐츠진흥원", 18000, 23900));
        CerDateList.add(new CertificateData("게임기획전문가", "한국콘텐츠진흥원", 18000, 23500));
        CerDateList.add(new CertificateData("게임프로그래밍전문가", "한국콘텐츠진흥원", 18000, 22700));
    }
}
