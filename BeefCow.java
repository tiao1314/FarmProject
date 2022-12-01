/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author tiao
 */
public class BeefCow extends Animal {

    // weight age pedigree

    private int weight;
    private int age;
    private String pedigree;


    //constructors
    public BeefCow(String name, int id, int weight, int age, String pedigree) {
        super(name, id);
        this.weight = weight;
        this.age = age;
        this.pedigree = pedigree;
    }

    //no arg constructor

    public BeefCow() {
    }

    //getters and setters

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    //toString
    @Override
    public String toString() {
        return "BeefCow{" + "weight=" + weight + ", age=" + age + ", pedigree=" + pedigree + '}';
    }

   

}
