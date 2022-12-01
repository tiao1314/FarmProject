/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author tiao
 */
public class Goats extends Animal {

    private int udders;
    
    public Goats(String name, int id, int udders) {
        super(name, id);
        this.udders = udders;
    }

    //no arg constructor
    public Goats() {
    }

    //getters and setters

    public int getUdders() {
        return udders;
    }

    public void setUdders(int udders) {
        this.udders = udders;
    }

    // Goats can and they produce 2-3 litres of milk per day
    // math.random() * max 2 + 1 = 3  + min = 2
    public int udderCapacity() {
        int udderCapacity = (int) (Math.random() * 2 + 2);
        return udderCapacity;
    }
    

    //toString
    @Override
    public String toString() {
        return "DairyCow{" + "udders=" + udders + '}';
    }

    

    

}
