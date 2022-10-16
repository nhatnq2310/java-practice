/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiTraiCay;

/**
 *
 * @author Administrator
 */
public class Fruit implements Comparable<Fruit> {
    String ID;
    String name;
    double price; 

    public Fruit() {
    }

    public Fruit(String ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" + "ID=" + ID + ", name=" + name + ", price=" + price + '}';
    }

    @Override
    public int compareTo(Fruit o) {
        return this.getID().compareTo(o.ID);
    }
    
}
