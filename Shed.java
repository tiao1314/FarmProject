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
    //multiple animals in a shed
    private ArrayList<Animal> animals;

    //link to MilkingMachine 
    MilkingMachine milkingMachine;
    Milkable milkable;

    //constructor
    public Shed(int id, ArrayList<Animal> animals) {
        this.id = id;
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

    //check if animal is milkable

    // checks the individual animal to see if it is milkable "inplements milkable"
    public void milkAnimal(Animal animal) {
        if (animal instanceof Milkable) {
            milkingMachine.milk((Milkable) animal); // casting animal to milkable
        } else {
            throw new IllegalStateException("Animal is not milkable");
        }
    }

    // public void milkAnimal(Collection<Animal> animals) milks the herd of animals with the
    //milking machine, the method throws an IllegalStateException if the milking machine is not
    //installed

    //milk all animals in the shed
    public void milkAnimal(ArrayList<Animal> animals) { // milk all animals in the shed
        for (Animal animal : animals) { // for each animal in the arraylist
            if (animal instanceof Milkable) { // check if animal is milkable
                milkingMachine.milk((Milkable) animal);// casting animal to milkable
            } else {
                throw new IllegalStateException("Animal is not milkable");
            }
        }
    }


    
    //Not sure how to do this 

    //toString
    @Override
    public String toString() {
        return "Shed{" + "id=" + id + ", animals=" + animals + '}';
    }




}
    


    




