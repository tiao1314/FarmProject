/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author tiao
 */
public class Farm {
    

    private int id;
    private String owner;
    private ArrayList<Animal> herds;

    Shed shed;

    public Farm(int id, String owner, ArrayList<Animal> animals, Shed shed) {
        this.id = id;
        this.owner = owner;
        this.animals = animals;
        this.shed = shed;
    }

    //constructor

    public Farm() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Shed getShed() {
        return shed;
    }

    public void setShed(Shed shed) {
        this.shed = shed;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    //override toString method
    @Override
    public String toString() {
        return "Farm{" + "id=" + id + ", owner=" + owner + ", animals=" + animals + ", shed=" + shed + '}';
    }
    

    

    
}
