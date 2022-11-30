package FarmProject;



public class Goats extends Animal implements Milkable
{
    private int id; 
    private String name;
    private double udders;

    public Goats(int id, String name, double udders) {
        this.id = id;
        this.name = name;
        this.udders = udders;
    }

    public Goats() {
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
    
    
    
    
    

    @Override
    public int compareTo(Animal o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double milk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
