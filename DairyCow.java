package FarmProject;



public class DairyCow extends Animal implements Milkable
{
    private int id; 
    private String name;
    private double udders;

    public DairyCow(int id, String name, double udders) {
        this.id = id;
        this.name = name;
        this.udders = udders;
    }

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
    
    public DairyCow DairyCow()
    {
        return new DairyCow();

    } 
    
    public DairyCow Cow(String name)
    {
        return new DairyCow();
    }
    
    public double udders()
    {
        return 20 + (40 - 20) * Math.random();
    }
   
    // method creates a new cow with a random name
    public DairyCow createCow()
    {
        String[] names = {"Bella", "Lilly", "Lola", "Lucy", "Molly", "Maggie", "Sadie", "Sophie", "Zoe", "Zoey"};
        int random = (int)(Math.random() * names.length);
        String name = names[random];
        return new DairyCow(0, name, udders());
    }

    //method creates a new cow of the given name
    public DairyCow createCow(String name)
    {
        return new DairyCow(0, name, udders());
    }

    //method String getName() 
    public String getName(DairyCow cow)
    {
        return cow.getName();
    }

    //method double getCapacity() returns the udder capacity
    public double getCapacity(DairyCow cow)
    {
        return cow.getUdders();
    }

    @Override
    public String toString() {
        return "DairyCows{" + "id=" + id + ", name=" + name + ", udders=" + udders + '}';
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
