package edu.xcdq;

public class Main {

    public static void main(String[] args) {
        System.out.println(80*0.4+75*0.6);
        System.out.println(cale(80,90));
    }
    public static double cale(int pingshi,int qimo){
        return pingshi * 0.4 + qimo *0.6;
    }
}
