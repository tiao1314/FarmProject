/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author tiao
 */

//implements Comparable<Animal> down below
 abstract class Animal {

    private String name;
    private int id;

    //constructors
    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //no arg constructor
    public Animal() {
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //toString
    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", id=" + id + '}';
    }




    





}