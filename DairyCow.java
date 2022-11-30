/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author tiao
 */
public class DairyCow {

    
    // id, name, udders

    private int id;
    private String name;
    private double udders;

    //constructor
    public DairyCow(int id, String name, double udders) {
        this.id = id;
        this.name = name;
        this.udders = udders;
    }

    //getters and setters

    public DairyCow() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUdders() {
        return udders;
    }

    public void setUdders(double udders) {
        this.udders = udders;
    }

    // udder capacity is a random number between 20 and 40
    public double udders()
    {
        return 20 + (40 - 20) * Math.random();
    }

    //DairyCow method
    public DairyCow DairyCow()
    {
        return new DairyCow();
    }

    //Cow method
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

    @Override
    public String toString() {
        return "DairyCow{" + "id=" + id + ", name=" + name + ", udders=" + udders + '}';
    }

}
