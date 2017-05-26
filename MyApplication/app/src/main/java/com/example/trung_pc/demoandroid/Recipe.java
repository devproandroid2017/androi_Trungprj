package com.example.trung_pc.demoandroid;

/**
 * Created by Trung-PC on 5/22/2017.
 */

public class Recipe {
    private String title;
    private String detail;
    private String fagimge;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getFagimge() {
        return fagimge;
    }

    public void setFagimge(String fagimge) {
        this.fagimge = fagimge;
    }

    public Recipe() {

    }

    public Recipe(String title, String detail, String fagimge) {

        this.title = title;
        this.detail = detail;
        this.fagimge = fagimge;
    }
}
