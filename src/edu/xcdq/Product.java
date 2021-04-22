package edu.xcdq;

/**
 * @author xujinwei
 * @date 2021/4/22 15:01
 */
public class Product {
    private int id;
    private double price;
    private int count;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }
}
