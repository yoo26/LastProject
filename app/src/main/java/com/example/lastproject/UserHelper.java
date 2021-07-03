package com.example.lastproject;

public class UserHelper {
    String nama, phone, date;

    public UserHelper() {

    }

    public UserHelper(String nama, String phone, String date) {
        this.nama = nama;
        this.phone = phone;
        this.date = date;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
