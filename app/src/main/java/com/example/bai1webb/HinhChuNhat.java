package com.example.bai1webb;

public class HinhChuNhat {
    private int rong,dai;

    public int chuvi(){
        return (dai + rong) *2;
    }
    public int dientich(){
        return dai*rong;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }
}
