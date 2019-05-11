package com.love.juae.goodhabits;

public class ContactItems {
    private boolean check;
    private int time;
    private int count;

    private String title;
    private String subtitle;
    private String type;

    //아이템 종류 총 3가지 :
    // 계수, 타이머(누적시간), 수행
    // id : 계수 - count, 타이며 - timer, 수행 : check

    public void set_type(String type) {
        this.type = type;
    }

    public void set_count(int count) {
        this.count = count;
    }

    public void set_check(boolean check) {
        this.check = check;
    }


    public void set_time(int time) {
        this.time = time;
    }

    public void set_title(String title) {
        this.title = title;
    }

    public void set_subtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public boolean get_check() {
        return this.check;
    }

    public int get_time() {
        return this.time;
    }

    public int get_count() {
        return this.count;
    }

    public String get_type() {
        return this.type;
    }

    public String get_title() {
        return this.title;
    }

    public String get_subtitle() {
        return this.subtitle;
    }
}
