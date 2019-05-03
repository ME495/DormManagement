package com.example.other;

import org.litepal.crud.DataSupport;

public class Student extends DataSupport {
    private int xuehao;
    private String mima;
    private String name;
    private int sex;
    private int phone;
    private String banji;
    private String xueyuan;
    private String sushequ;
    private String sushe;

    public int getXuehao() {
        return xuehao;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public String getXueyuan() {
        return xueyuan;
    }

    public void setXueyuan(String xueyuan) {
        this.xueyuan = xueyuan;
    }

    public String getSushequ() {
        return sushequ;
    }

    public void setSushequ(String sushequ) {
        this.sushequ = sushequ;
    }

    public String getSushe() {
        return sushe;
    }

    public void setSushe(String sushe) {
        this.sushe = sushe;
    }
}
