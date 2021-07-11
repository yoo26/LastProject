package com.example.lastproject;

public class UserHelper {
    //Deklarasi
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
    } //Method Getter

    public void setNama(String nama) {
        this.nama = nama;
    } //Method Setter

    public String getPhone() {
        return phone;
    } //Method Getter

    public void setPhone(String phone) {
        this.phone = phone;
    } //Method Setter

    public String getDate() {
        return date;
    } //Method Getter

    public void setDate(String date) {
        this.date = date;
    } //Method Setter
}
