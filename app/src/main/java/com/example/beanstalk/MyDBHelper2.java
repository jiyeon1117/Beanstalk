package com.example.beanstalk;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper2 extends SQLiteOpenHelper {
    public MyDBHelper2(Context context){
        super(context, "certificate", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String table = "create table certificate ( event varchar(20), name varchar(30) primary key, part varchar(30), agency varchar(30), written_fees integer, practical_fees integer );";
        sqLiteDatabase.execSQL(table);
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('건설기계운전', '기중기운전기능사', '국토교통부', '한국산업인력공단', 14500, 30600)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('건설기계운전', '롤러운전기능사', '국토교통부', '한국산업인력공단', 14500, 25000)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('건설기계운전', '지게차운전기능사', '국토교통부', '한국산업인력공단', 14500, 25200)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('건설배관', '배관기능사', '고용노동부', '한국산업인력공단', 14500, 64300)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('건설배관', '배관기능장', '고용노동부', '한국산업인력공단', 34400, 79900)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('건설배관', '배관산업기사', '고용노동부', '한국산업인력공단', 19400, 75900)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('건축', '건축산업기사', '국토교통부', '한국산업인력공단', 19400, 28700)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('건축', '유리시공기능사', '국토교통부', '한국산업인력공단', NULL, 65100)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('건축', '타일기능사', '국토교통부', '한국산업인력공단', NULL, 63000)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('경영', '사회조사분석사1급', '통계청', '한국산업인력공단', 19400, 34000)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('경영', '소비자전문상담사1급', '공정거래위원회', '한국산업인력공단', 19400, 20800)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('경영', '컨벤션기획사1급', '문화체육관광부', '한국산업인력공단', 19400, 27300)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('금속.재료', '금속재료기능장', '산업통상자원부', '한국산업인력공단', 34400, 24800)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('금속.재료', '세라믹기술사', '과학기술정보통신부', '한국산업인력공단', 67800, 87100)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('금속.재료', '압연기능사', '고용노동부', '한국산업인력공단', 14500, 19600)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('금형.공작기계', '금형기술사', '산업통상자원부', '한국산업인력공단', 67800, 87100)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('금형.공작기계', '사출금형설계기사', '산업통상자원부', '한국산업인력공단', 19400, 30200)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('금형.공작기계', '프레스금형산업기사', '산업통상자원부', '한국산업인력공단', 19400, 38300)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('기계장비설비.설치', '건설기계정비산업기사', '국토교통부', '한국산업인력공단', 19400, 49100)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('기계장비설비.설치', '메카트로닉스기사', '고용노동부', '한국산업인력공단', 19400, 105900)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('기계장비설비.설치', '산업기계설비기술사', '과학기술정보통신부', '한국산업인력공단', 67800, 87100)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('기계제작', '컴퓨터응용선반기능사', '고용노동부', '한국산업인력공단', 14500, 36600)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('기계제작', '정밀측정기능사', '산업통상자원부', '한국산업인력공단', 14500, 26200)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('기계제작', '기계설계기사', '고용노동부', '한국산업인력공단', 19400, 37100)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('농업', '원예기능사', '농촌진흥청', '한국산업인력공단', 14500, 59400)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('농업', '유기농업산업기사', '농림축산식품부', '한국산업인력공단', 19400, 20800)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('농업', '화훼장식기사', '농림축산식품부', '한국산업인력공단', 19400, 56300)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('단조.주조', '원형기능사', '고용노동부', '한국산업인력공단', 14500, 40700)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('단조.주조', '주조기능사', '고용노동부', '한국산업인력공단', 14500, 64400)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('단조.주조', '주조산업기사', '고용노동부', '한국산업인력공단', 19400, 75200)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('도시.교통', '교통기사', '국토교통부', '한국산업인력공단', 19400, 22600)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('도시.교통', '교통기술사', '국토교통부', '한국산업인력공단', 67800, 87100)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('도시.교통', '교통산업기사', '국토교통부', '한국산업인력공단', 19400, 20800)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('도장.도금', '광고도장기능사', '고용노동부', '한국산업인력공단', 14500, 70000)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('도장.도금', '금속도장기능사', '고용노동부', '한국산업인력공단', 14500, 57100)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('도장.도금', '표면처리기능장', '고용노동부', '한국산업인력공단', 34400, 103800)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('디자인', '시각디자인기사', '산업통상자원부', '한국산업인력공단', 19400, 29900)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('디자인', '웹디자인기능사', '산업통상자원부', '한국산업인력공단', 14500, 20100)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('디자인', '컴퓨터그래픽스운용기능사', '산업통상자원부', '한국산업인력공단', 14500, 23700)");

        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('목재.가구.공예', '귀금속가공기능사', '고용노동부', '한국산업인력공단', 14500, 47900)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('목재.가구.공예', '보석가공기능사', '고용노동부', '한국산업인력공단', 14500, 40200)");
        sqLiteDatabase.execSQL("INSERT INTO certificate VALUES ('목재.가구.공예', '피아노조율산업기사', '고용노동부', '한국산업인력공단', 19400, 50200)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('보건.의료', '국제의료관광코디네이터', '보건복지부, 문화체육관광부', '한국산업인력공단', 19400, 20800)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('보건.의료', '임상심리사1급', '보건복지부', '한국산업인력공단', 19400, 20800)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('보건.의료', '임상심리사2급', '보건복지부', '한국산업인력공단', 19400, 20800)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('비파괴검사', '방사선비파괴검사기능사', '과학기술정보통신부', '한국산업인력공단', 14500, 35500)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('비파괴검사', '초음파비파괴검사기사', '과학기술정보통신부', '한국산업인력공단', 19400, 42800)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('비파괴검사', '침투비파괴검사산업기사', '과학기술정보통신부', '한국산업인력공단', 19400, 46400)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('사회복지.종교', '직업상담사1급', '고용노동부', '한국산업인력공단', 19400, 33900)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('사회복지.종교', '직업상담사2급', '고용노동부', '한국산업인력공단', 19400, 20800)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('생산관리', '포장기술사', '산업통상자원부', '한국산업인력공단', 67800, 87100)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('생산관리', '품질경영기사', '산업통상자원부', '한국산업인력공단', 19400, 22600)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('생산관리', '품질관리기술사', '산업통상자원부', '한국산업인력공단', 67800, 87100)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('섬유', '섬유디자인산업기사', '고용노동부', '한국산업인력공단', 19400, 57200)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('섬유', '의류기사', '고용노동부', '한국산업인력공단', 19400, 31800)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('섬유', '의류기술사', '과학기술정보통신부', '한국산업인력공단', 67800, 87100)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('숙박.여행.오락.스포츠', '스포츠경영관리사', '문화체육관광부', '한국산업인력공단', 19400, 20800)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('식품', '수산제조기술사', '해양수산부, 식품의약품안전처', '한국산업인력공단', 67800, 87100)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('식품', '식품기사', '식품의약품안전처', '한국산업인력공단', 19400, 22600)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('식품', '식품산업기사', '식품의약품안전처', '한국산업인력공단', 19400, 55400)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('안전관리', '가스산업기사', '산업통상자원부', '한국산업인력공단', 19400, 24100)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('안전관리', '인간공학기술사', '고용노동부', '한국산업인력공단', 67800, 87100)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('안전관리', '화재감식평가산업기사', '소방청', '한국산업인력공단', 19400, 20800)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('어업', '수산양식기능사', '해양수산부', '한국산업인력공단', 14500, 45700)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('어업', '어로산업기사', '해양수산부', '한국산업인력공단', 19400, 20800)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('어업', '어업생산관리기사', '해양수산부', '한국산업인력공단', 19400, 25000)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('에너지.기상', '기상감정기사', '기상청', '한국산업인력공단', 19400, 33900)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('에너지.기상', '기상예보기술사', '기상청', '한국산업인력공단', 67800, 87100)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('에너지.기상', '에너지관리기사', '산업통상자원부', '한국산업인력공단', 19400, 22600)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('영업.판매', '텔레마케팅관리사', '고용노동부', '한국산업인력공단', 19400, 20800)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('용접', '용접기능사', '고용노동부', '한국산업인력공단', 14500, 40000)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('용접', '용접기술사', '과학기술정보통신부', '한국산업인력공단', 67800, 87100)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('용접', '특수용접기능사', '고용노동부', '한국산업인력공단', 14500, 49500)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('운전.운송', '농기계운전기능사', '농촌진흥청', '한국산업인력공단', 14500, 23500)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('운전.운송', '철도운송산업기사', '국토교통부', '한국산업인력공단', 19400, 25000)");

        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('위험물', '위험물기능사', '소방청', '한국산업인력공단', 14500, 17200)");
        sqLiteDatabase.execSQL("INSERT INTO Certificate VALUES ('위험물', '위험물기능장', '소방청', '한국산업인력공단', 34400, 24800)");
        sqLiteDatabase.execSQL("");
        sqLiteDatabase.execSQL("");






        INSERT INTO Certificate VALUES ('위험물', '위험물산업기사', '소방청', '한국산업인력공단', 19400, 20800)

        INSERT INTO Certificate VALUES ("의복", "패션디자인산업기사", "고용노동부", "한국산업인력공단", 19400, 48900);
        INSERT INTO Certificate VALUES ("의복", "패션머천다이징산업기사", "산업통상자원부", "한국산업인력공단", 19400, 30000);
        INSERT INTO Certificate VALUES ("의복", "한복산업기사", "고용노동부", "한국산업인력공단", 19400, 49100);

        INSERT INTO Certificate VALUES ("이용.미용", "미용사(네일)", "보건복지부", "한국산업인력공단", 14500, 17200);
        INSERT INTO Certificate VALUES ("이용.미용", "미용사(메이크업)", "보건복지부", "한국산업인력공단", 14500, 17200);
        INSERT INTO Certificate VALUES ("이용.미용", "미용사(피부)", "보건복지부", "한국산업인력공단", 14500, 27300);

        INSERT INTO Certificate VALUES ("인쇄.사진", "사진기능사", "고용노동부", "한국산업인력공단", 14500, 52900);
        INSERT INTO Certificate VALUES ("인쇄.사진", "인쇄기능사", "고용노동부", "한국산업인력공단", 14500, 65400);
        INSERT INTO Certificate VALUES ("인쇄.사진", "전자출판기능사", "문화체육관광부", "한국산업인력공단", 14500, 27300);

        INSERT INTO Certificate VALUES ("임업", "산림기사", "산림청", "한국산업인력공단", 19400, 38300);
        INSERT INTO Certificate VALUES ("임업", "식물보호산업기사", "농촌진흥청", "한국산업인력공단", 19400, 47300);
        INSERT INTO Certificate VALUES ("임업", "임업종묘기능사", "산림청", "한국산업인력공단", 14500, 40800);

        INSERT INTO Certificate VALUES ("자동차", "그린전동자동차기사", "산업통상자원부", "한국산업인력공단", 19400, 22600);
        INSERT INTO Certificate VALUES ("자동차", "자동차정비기능사", "국토교통부", "한국산업인력공단", 14500, 41300);
        INSERT INTO Certificate VALUES ("자동차", "자동차차체수리기능사", "국토교통부", "한국산업인력공단", 14500, 60000);

        INSERT INTO Certificate VALUES ("전기", "건축전기설비기술사", "국토교통부", "한국산업인력공단", 67800, 87100);
        INSERT INTO Certificate VALUES ("전기", "전기기사", "산업통상자원부", "한국산업인력공단", 19400, 22600);
        INSERT INTO Certificate VALUES ("전기", "철도전기신호기능사", "국토교통부", "한국산업인력공단", 14500, 99600);

        INSERT INTO Certificate VALUES ("전자", "반도체설계산업기사", "산업통상자원부", "한국산업인력공단", 19400, 27800);
        INSERT INTO Certificate VALUES ("전자", "로봇소프트웨어개발기사", "산업통상자원부", "한국산업인력공단", 19400, 30300);
        INSERT INTO Certificate VALUES ("전자", "전자계산기기사", "과학기술정보통신부", "한국산업인력공단", 19400, 22600);

        INSERT INTO Certificate VALUES ("정보기술", "멀티미디어콘텐츠제작전문가", "과학기술정보통신부", "한국산업인력공단", 19400, 26300);
        INSERT INTO Certificate VALUES ("정보기술", "정보처리기능사", "과학기술정보통신부", "한국산업인력공단", 14500, 17200);
        INSERT INTO Certificate VALUES ("정보기술", "컴퓨터시스템응용기술사", "과학기술정보통신부", "한국산업인력공단", 67800, 87100);

        INSERT INTO Certificate VALUES ("제과.제빵", "떡제조기능사", "식품의약품안전처", "한국산업인력공단", 14500, 37300);
        INSERT INTO Certificate VALUES ("제과.제빵", "제과기능사", "식품의약품안전처", "한국산업인력공단", 14500, 29500);
        INSERT INTO Certificate VALUES ("제과.제빵", "제빵기능사", "식품의약품안전처", "한국산업인력공단", 14500, 33000);

        INSERT INTO Certificate VALUES ("조경", "조경기능사", "국토교통부", "한국산업인력공단", 14500, 30400);
        INSERT INTO Certificate VALUES ("조경", "조경기사", "국토교통부", "한국산업인력공단", 19400, 27100);
        INSERT INTO Certificate VALUES ("조경", "조경기술사", "국토교통부", "한국산업인력공단", 67800, 87100);

        INSERT INTO Certificate VALUES ("조리", "복어조리기능사", "식품의약품안전처", "한국산업인력공단", 14500, 35100);
        INSERT INTO Certificate VALUES ("조리", "양식조리기능사", "식품의약품안전처", "한국산업인력공단", 14500, 29600);
        INSERT INTO Certificate VALUES ("조리", "한식조리기능사", "식품의약품안전처", "한국산업인력공단", 14500, 26900);

        INSERT INTO Certificate VALUES ("조선", "동력기계정비기능사", "산업통상자원부", "한국산업인력공단", 14500, 33000);
        INSERT INTO Certificate VALUES ("조선", "전산응용조선제도기능사", "산업통상자원부", "한국산업인력공단", 14500, 24400);
        INSERT INTO Certificate VALUES ("조선", "조선산업기사", "산업통상자원부", "한국산업인력공단", 19400, 45900);

        INSERT INTO Certificate VALUES ("채광", "화약류관리기사", "경찰청", "한국산업인력공단", 19400, 46400);
        INSERT INTO Certificate VALUES ("채광", "화약류관리기술사", "경찰청", "한국산업인력공단", 67800, 87100);
        INSERT INTO Certificate VALUES ("채광", "화약류관리산업기사", "경찰청", "한국산업인력공단", 19400, 46100);

        INSERT INTO Certificate VALUES ("철도", "철도차량기술사", "국토교통부", "한국산업인력공단", 67800, 87100);
        INSERT INTO Certificate VALUES ("철도", "철도차량정비기능사", "국토교통부", "한국산업인력공단", 14500, 22000);
        INSERT INTO Certificate VALUES ("철도", "철도차량정비기능장", "국토교통부", "한국산업인력공단", 34400, 24800);

        INSERT INTO Certificate VALUES ("축산", "축산기능사", "농림축산식품부", "한국산업인력공단", 14500, 40700);
        INSERT INTO Certificate VALUES ("축산", "축산기사", "농림축산식품부", "한국산업인력공단", 19400, 22600);
        INSERT INTO Certificate VALUES ("축산", "축산기술사", "농림축산식품부", "한국산업인력공단", 67800, 87100);

        INSERT INTO Certificate VALUES ("토목", "항공사진기능사", "국토교통부", "한국산업인력공단", NULL, 52900);
        INSERT INTO Certificate VALUES ("토목", "토목시공기술사", "국토교통부", "한국산업인력공단", 67800, 87100);
        INSERT INTO Certificate VALUES ("토목", "해양조사산업기사", "해양수산부", "한국산업인력공단", 19400, 20800);

        INSERT INTO Certificate VALUES ("판금.제관.새시", "금속재창호기능사", "국토교통부", "한국산업인력공단", NULL, 68900);
        INSERT INTO Certificate VALUES ("판금.제관.새시", "판금제관산업기사", "고용노동부", "한국산업인력공단", 19400, 100900);
        INSERT INTO Certificate VALUES ("판금.제관.새시", "플라스틱창호기능사", "국토교통부", "한국산업인력공단", 14500, 79900);

        INSERT INTO Certificate VALUES ("항공", "항공기관기술사", "과학기술정보통신부", "한국산업인력공단", 67800, 87100);
        INSERT INTO Certificate VALUES ("항공", "항공기체기술사", "과학기술정보통신부", "한국산업인력공단", 67800, 87100);
        INSERT INTO Certificate VALUES ("항공", "항공장비정비기능사", "국토교통부", "한국산업인력공단", 14500, 34900);

        INSERT INTO Certificate VALUES ("화공", "바이오화학제품제조기사", "산업통상자원부", "한국산업인력공단", 19400, 44400);
        INSERT INTO Certificate VALUES ("화공", "화공기술사", "과학기술정보통신부", "한국산업인력공단", 67800, 87100);
        INSERT INTO Certificate VALUES ("화공", "화학분석기능사", "산업통상자원부", "한국산업인력공단", 14500, 38500);

        INSERT INTO Certificate VALUES ("환경", "대기환경산업기사", "환경부", "한국산업인력공단", 19400, 20800);
        INSERT INTO Certificate VALUES ("환경", "토양환경기술사", "환경부", "한국산업인력공단", 67800, 87100);
        INSERT INTO Certificate VALUES ("환경", "수질관리기술사", "환경부", "한국산업인력공단", 67800, 87100);

        sqLiteDatabase.execSQL("");
        sqLiteDatabase.execSQL("");
        sqLiteDatabase.execSQL("");

        sqLiteDatabase.execSQL("");
        sqLiteDatabase.execSQL("");
        sqLiteDatabase.execSQL("");

        sqLiteDatabase.execSQL("");
        sqLiteDatabase.execSQL("");
        sqLiteDatabase.execSQL("");

        sqLiteDatabase.execSQL("");
        sqLiteDatabase.execSQL("");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists com_certificate");
        onCreate(sqLiteDatabase);
    }
}
