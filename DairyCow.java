/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author tiao
 */
public class DairyCow extends Animal implements Milkable {

    private int udders;
    
    
    public DairyCow(String name, int id) {
        super(name, id);
        this.udders = udderCapacity();
    }

    //no arg constructor
    public DairyCow() {
    }

    //getters and setters

    public int getUdders() {
        return udders;
    }

    public void setUdders(int udders) {
        this.udders = udders;
    }

    //  Udder capacity is a random value between 20 and 40
        public int udderCapacity() {
        int udderCapacity = (int) (Math.random() * 20 + 20);
        

        return udderCapacity;
        
    }

    // creates a new cow with a random name
    public DairyCow DairyCow()
    {
        return new DairyCow();
    }

    // cow method
    public DairyCow Cow(String name)
    {
        return new DairyCow();
    }

    //string getName method
    public String getName(String name)
    {
        return name;
    }
    
    //getCapacity method
    public double getCapacity()
    {
        return udders;
    }
    
    
    

    //toString
    @Override
    public String toString() {
        return "DairyCow{" + "udders=" + udders + '}';
    }

    @Override
    public double milk() {
        return this.udders;
    }

    

    

}
