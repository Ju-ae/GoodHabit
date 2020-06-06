package com.love.juae.goodhabits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ContactsAdapter adapter;
    ListView listview;
    TextView tv_date;
    Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listview);
        tv_date = (TextView) findViewById(R.id.tv_datestr);
        btn_add = (Button) findViewById(R.id.btn_add);
        setupViews();

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i = new Intent(MainActivity.this, AddContactActivity.class);
                startActivity(i);
            }
        });
    }



    void setupViews() {

        // Setup RecyclerView, associated adapter, and layout manager.
        adapter = new ContactsAdapter();

        listview.setAdapter(adapter);

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
