package com.example.beanstalk;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {
    public MyDBHelper(Context context){
        super(context, "com_certificate", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String table = "create table com_certificate ( event varchar(20), name varchar(30) primary key, part varchar(30), agency varchar(30), written_fees integer, practical_fees integer );";
        sqLiteDatabase.execSQL(table);
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '3D프린터개발산업기사', '과학기술정보통신부, 산업통상자원부', '한국산업인력공단', 19400, 81000)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '3D프린터운용기능사', '과학기술정보통신부, 산업통상자원부', '한국산업인력공단', 14500, 27000)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '로봇소프트웨어개발기사', '산업통상자원부', '한국산업인력공단', 19400, 30300)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '로봇하드웨어개발기사', '산업통상자원부', '한국산업인력공단', 19400, 54300)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '멀티미디어콘텐츠제작전문가', '과학기술정보통신부', '한국산업인력공단', 19400, 26300)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '정보관리기술사', '과학기술정보통신부', '한국산업인력공단', 67800, 87100)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '정보처리기능사', '과학기술정보통신부', '한국산업인력공단', 14500, 17200)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '정보처리기사', '과학기술정보통신부', '한국산업인력공단', 19400, 22600)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '정보처리산업기사', '과학기술정보통신부', '한국산업인력공단', 19400, 20800)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '컴퓨터시스템응용기술사', '과학기술정보통신부', '한국산업인력공단', 67800, 87100)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '워드프로세서', '고용노동부', '대한상공회의소', 15700, 17800)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '컴퓨터활용능력1급', '고용노동부', '대한상공회의소', 17800, 21000)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '컴퓨터활용능력2급', '고용노동부', '대한상공회의소', 19400, 20800)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '빅데이터분석기사', '통계청, 과학기술정보통신부', '한국데이터산업진흥원', 80000, 70000)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '정보보안기사', '과학기술정보통신부', '한국인터넷진흥원', 18800, 21900)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '정보보안산업기사', '과학기술정보통신부', '한국인터넷진흥원', 18800, 20200)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '게임그래픽전문가', '문화체육관광부', '한국콘텐츠진흥원', 18000, 23900)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '게임기획전문가', '문화체육관광부', '한국콘텐츠진흥원', 18000, 23500)");
        sqLiteDatabase.execSQL("INSERT INTO com_certificate VALUES ('컴퓨터', '게임프로그래밍전문가', '문화체육관광부', '한국콘텐츠진흥원', 18000, 22700)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists com_certificate");
        onCreate(sqLiteDatabase);
    }
}