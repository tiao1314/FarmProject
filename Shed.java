/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author tiao
 */
public class Shed {
    // id , room , animals
    private int id;
    private String room;
    //multiple animals in a shed
    private ArrayList<Animal> animals;

    //link to MilkingMachine 
    MilkingMachine milkingMachine;

    //constructor
    public Shed(int id, String room, ArrayList<Animal> animals) {
        this.id = id;
        this.room = room;
        this.animals = animals;
    }

    //no arg constructor
    public Shed() {
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }   

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    //public Shed getMilkTank() returns the shed’s milk tank
    // dont need to go straight to the milkitank bc milkingmachine has milkingtank linked to it
    public MilkingMachine getMilkTank() {
        return milkingMachine;
    }

    //public void installMilkingMachine(MilkingMachine milkingMachine) installs 
    // a milking machine and connects it to the shed’s milk tank
    //creating a milking machine 
    public void installMilkingMachine(MilkingMachine milkingMachine) {
        this.milkingMachine = milkingMachine;
    }

    //public void milkAnimal(Animal animal) milks the animal with the milking machine, the
    //method throws an IllegalStateException if the milking machine is not installed
    // milk animal method searches for the animal in the shed and milks it
    public void milkAnimal(Shed animals) {
        if (milkingMachine == null) {
            throw new IllegalStateException("Milking machine is not installed");
        }
        milkingMachine.milk(animals);
    }

    // public void milkAnimal(Collection<Animal> animals) milks the herd of animals with the
    //milking machine, the method throws an IllegalStateException if the milking machine is not
    //installed
    
    //Not sure how to do this 

    //toString
    @Override
    public String toString() {
        return "Shed{" + "id=" + id + ", room=" + room + ", animals=" + animals + '}';
    }




}
    


    




