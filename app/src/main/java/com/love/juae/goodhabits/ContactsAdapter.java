package com.love.juae.goodhabits;

import android.content.Context;
import android.graphics.drawable.shapes.PathShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactsAdapter extends BaseAdapter {

    private List mContacts = new ArrayList<>();
    private HashMap<String, ContactItems> item_list = new HashMap<>();
    private ArrayList<String> key_list = new ArrayList<>();

    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    // ListViewAdapter의 생성자
    public ContactsAdapter() {

    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return item_list.size();
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_check, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title_tv);
        TextView subtitle_tv = (TextView) convertView.findViewById(R.id.subtitle);
        CheckBox check = (CheckBox) convertView.findViewById(R.id.check);
        TextView time = (TextView) convertView.findViewById(R.id.time);
        TextView count = (TextView) convertView.findViewById(R.id.count);

        String this_id = item_list.get(key_list.get(position)).get_type();
        ContactItems listViewItem = item_list.get(key_list.get(position));

        if (this_id.equals("time")) {
            time.setVisibility(View.VISIBLE);
            time.setText(listViewItem.get_time() + "");
        } else if (this_id.equals("check")) {
            check.setVisibility(View.VISIBLE);
            check.setChecked(listViewItem.get_check());
        } else if (this_id.equals("count")) {
            count.setVisibility(View.VISIBLE);
            count.setText(listViewItem.get_count() + "");
        }

        // 아이템 내 각 위젯에 데이터 반영
        titleTextView.setText(listViewItem.get_title());
        subtitle_tv.setText(listViewItem.get_subtitle());
        return convertView;
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position;
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int id) {
        return item_list.get(key_list.get(id));
    }

    public void addItem_count(String title, String subtitle, int count) {
        ContactItems item = new ContactItems();
        item.set_title(title);
        item.set_subtitle(subtitle);
        item.set_count(count);
        item.set_type("count");
        item_list.put(title, item);
        set_keylist();
    }


    public void addItem_check(String title, String subtitle, boolean check) {
        ContactItems item = new ContactItems();
        item.set_title(title);
        item.set_subtitle(subtitle);
        item.set_type("check");
        item.set_check(check);
        item_list.put(title, item);
        set_keylist();

    }

    public void addItme_time(String title, String subtitle, int time) {
        ContactItems item = new ContactItems();
        item.set_title(title);
        item.set_subtitle(subtitle);
        item.set_type("time");
        item.set_time(time);
        item_list.put(title, item);
        set_keylist();

    }

    private void set_keylist() {
        key_list = new ArrayList<>();
        for (Map.Entry<String, ContactItems> entry : item_list.entrySet()) {
            key_list.add(item_list.get(entry.getValue().get_title()).get_title());
        }
    }
}
