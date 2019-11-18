package com.example.buttonnav.models;

import com.example.buttonnav.ui.student.StudentsFragment;

public class Sutdents {
    private String name;
    private String age;
    private String gender;
    private String address;
    private int img;

    public Sutdents(String name, String age, String gender, String address, int img) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public int getImg() {
        return img;
    }
}
