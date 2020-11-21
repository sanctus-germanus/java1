package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;
    

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getRe() {
        return a;
    }

    public int getIm() {
        return b;
    }

    public String toString() {
        return getRe() + "+" + getIm() + "i";
    }

    public ComplexNum add(ComplexNum num) {
        return new ComplexNum(a + num.getRe(),b + num.getIm());
    }

    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum(a - num.getRe(),b - num.getIm());
    }

    public ComplexNum mul(ComplexNum num) {
        return new ComplexNum(a*num.getRe()-b*num.getIm(),b*num.getRe() + a*num.getIm());

    }

    public ComplexNum div(ComplexNum num) {
        int c = a*num.getRe()+b*num.getIm();
        int d = b* num.getRe()+a* num.getIm();
        return new ComplexNum(c/(num.getRe()* num.getRe()+ num.getIm()*num.getIm()),d/(num.getRe()* num.getRe()+ num.getIm()*num.getIm()));
    }
}
