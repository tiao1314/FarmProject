package FarmProject;


import java.util.ArrayList;


public class Farm {
    private int id;
    private String owner;
    private ArrayList<Animal> animals;
    
    Shed shed;

    public Farm(int id, String owner, ArrayList<Animal> animals, Shed shed) {
        this.id = id;
        this.owner = owner;
        this.animals = animals;
        this.shed = shed;
    }

    

    

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

    @Override
    public String toString() {
        return "Farm{" + "id=" + id + ", owner=" + owner + ", animals=" + animals + ", shed=" + shed + '}';
    }

    

    
    
    
    
    
}

