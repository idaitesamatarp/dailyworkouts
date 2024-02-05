package com.example.adi.dailyworkout.Model;

import android.widget.Button;

public class Work {
    private int image;
    private String judul,detail,go;

    public Work() {
    }

    public Work(String judul, String detail,int image, String go) {
        this.image = image;
        this.judul = judul;
        this.detail = detail;
        this.go = go;
    }

    //Getter
    public int getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }

    public String getDetail() {
        return detail;
    }

    public String getGo () { return go; }

    //Setter

    public void setImage(int image) {
        this.image = image;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setGo(String go) { this.go = go; }
}
