package edu.xcdq;

/**
 * @author xujinwei
 * @date 2021/4/22 14:49
 */
//类的封装  1 把属性私有化  2 用方法对外提供访问或设置
public class Person {
    private String name;
    private int age;
    private double high;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setHigh(double high){
        this.high = high;
    }
    public double getHigh(){
        return this.high;
    }
}
