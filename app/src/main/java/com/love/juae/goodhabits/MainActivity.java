package com.love.juae.goodhabits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ContactsAdapter adapter;
    ListView listview;
    TextView tv_date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listview);
        tv_date = (TextView) findViewById(R.id.tv_datestr);

        setupViews();
    }

    void setupViews() {

        // Setup RecyclerView, associated adapter, and layout manager.
        adapter = new ContactsAdapter();

        listview.setAdapter(adapter);

        adapter.addItem_check("새벽기도", "4시반 예배를 기준으로 함.", false);
        adapter.addItem_count("문제 풀이 갯수", "", 0);
        adapter.addItme_time("운동시간", "운동할때 시작 누르기", 0);
        // Setup button to append additional contacts.
        //      Button addMoreButton = (Button) findViewById(R.id.add_more_contacts);
    /*    addMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.addMoreContacts(Contact.createContactsList(5));
            }
        });
        */
    }
}
