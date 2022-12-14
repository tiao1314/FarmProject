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

    // id owner shed
    private int id;
    private String owner ;
    // multiple sheds in a farm
    private ArrayList<Shed> shed;
    private static int idcount = 1;

    //constructor
    public Farm(int id, String owner, ArrayList<Shed> shed) {
        this.id = id;
        this.owner = owner;
        this.shed = shed;
    }

    public Farm() {
    }

    //getters and setters
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

    public ArrayList<Shed> getShed() {
        return shed;
    }

    public void setShed(ArrayList<Shed> shed) {
        this.shed = shed;
    }

    //creates farm object and adds it to the array list
    public void addFarm(int id, String owner, ArrayList<Shed> shed){
        Farm farm = new Farm(id, owner, shed);
        Farm.addFarm(farm);
    }

    private static void addFarm(Farm farm) {
    }

    //toString
    @Override
    public String toString() {
        return "Farm{" + "id=" + id + ", owner=" + owner + ", shed=" + shed + '}';
    }



    

}
