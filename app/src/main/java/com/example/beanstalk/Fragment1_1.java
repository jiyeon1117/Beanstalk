package com.example.beanstalk;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Fragment1_1 extends AppCompatActivity {
//    ArrayList<CertificateData> CerDateList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment1_1);
//        this.InitializeCerData();

//        final ListView listView = (ListView) findViewById(R.id.ListView);
//        final ListViewAdapter listViewAdapter = new ListViewAdapter(this, CerDateList);
//        listView.setAdapter(listViewAdapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(), "자격증 " + CerDateList.get(i).getName(), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

//    private void InitializeCerData() {
//        CerDateList = new ArrayList<CertificateData>();
//        CerDateList.add(new CertificateData("3D프린터개발산업기사", "과학기술정보통신부, 산업통상자원부", 19400, 81000));
//        CerDateList.add(new CertificateData("3D프린터운용기능사", "과학기술정보통신부, 산업통상자원부", 14500, 27000));
//        CerDateList.add(new CertificateData("로봇소프트웨어개발기사", "산업통상자원부", 19400, 30300));
//    }
}