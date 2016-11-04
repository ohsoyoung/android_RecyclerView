package com.soyoung.sopt_19th_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> dataSet; //뿌려줄 데이터들

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView)findViewById(R.id.listView); //객체 초기화
        dataSet = new ArrayList<String>();

        dataSet.add("안드로이드1");
        dataSet.add("안드로이드2");
        dataSet.add("안드로이드3");
        dataSet.add("안드로이드4");
        dataSet.add("안드로이드5");
        dataSet.add("안드로이드6");
        dataSet.add("안드로이드7");
        dataSet.add("안드로이드8");
        dataSet.add("안드로이드9");
        dataSet.add("안드로이드10");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, dataSet); //기본적으로 제공하는 레이아웃 형식
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(getApplicationContext(), dataSet.get(i) + "이 클릭이 되었습니다.", Toast.LENGTH_LONG).show(); //String으로 형변환
            }
        });

    }
}
