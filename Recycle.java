package com.soyoung.sopt_19th_3.ch1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.soyoung.sopt_19th_3.R;

import java.util.ArrayList;

public class Recycle extends AppCompatActivity {

    Button btn;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    ArrayList<itemData> dataSet = new ArrayList<itemData>(); //뿌려줄 데이터들

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        dataSet.add(new itemData(R.drawable.ic__teach_mypage, "title1", "안드로이드1"));
        dataSet.add(new itemData(R.drawable.ic_hobby_mypage, "title2", "안드로이드2"));
        dataSet.add(new itemData(R.drawable.ic_ready_mypage, "title3", "안드로이드3"));
        dataSet.add(new itemData(R.drawable.ic__teach_mypage, "title4", "안드로이드4"));
        dataSet.add(new itemData(R.drawable.ic_hobby_mypage, "title5", "안드로이드5"));
        dataSet.add(new itemData(R.drawable.ic_ready_mypage, "title6", "안드로이드6"));
        dataSet.add(new itemData(R.drawable.ic__teach_mypage, "title7", "안드로이드7"));
        dataSet.add(new itemData(R.drawable.ic_hobby_mypage, "title8", "안드로이드8"));
        dataSet.add(new itemData(R.drawable.ic_ready_mypage, "title9", "안드로이드9"));
        dataSet.add(new itemData(R.drawable.ic__teach_mypage, "title10", "안드로이드10"));

        final ch1Adapter ch1Adapter = new ch1Adapter(dataSet, clickEvent);

        recyclerView.setAdapter(ch1Adapter);

        /*btn = (Button)findViewById(R.id.btn) ;
        btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int count;
                count = ch1Adapter.getCount();

                // 아이템 추가.
                itemData.add("LIST" + Integer.toString(count + 1));

                // listview 갱신
                ch1Adapter.notifyDataSetChanged();
            }
        }) ;*/


    }

    public View.OnClickListener clickEvent = new View.OnClickListener() {  //어댑터에 전달해줘서 어댑터가 실행
        public void onClick(View v) {
            int itemPosition = recyclerView.getChildPosition(v);
            String temp = dataSet.get(itemPosition).content;
            Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
        }
    };
}
