package FarmProject;



public class Shed {
    
    private int id;
    private String room;
    MilkingMachine mc;

    public Shed(int id, String room, MilkingMachine mc) {
        this.id = id;
        this.room = room;
        this.mc = mc;
    }

    public Shed() {
    }

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

    public MilkingMachine getMc() {
        return mc;
    }




    public void setMc(MilkingMachine mc) {
        this.mc = mc;
    }

    public Shed getMilkTank()
    {
        return new Shed();
    }

    public void installMilkingMachine(MilkingMachine milkingMachine) 
    {
        this.mc = milkingMachine;
    }
    
    //method public void milkAnimal(Animal animal) milks the animal with the milking machine, the method throws an IllegalStateException if the milking machine is not installed
    public void milkAnimal(Animal animal) 
    {
        if (mc == null) {
            throw new IllegalStateException("No milking machine installed");
        }
        mc.milk((Milkable) animal);
    }

    //method public void milkAnimal(Collection<Animal> animals) milks the herd of animals with the milking machine, the method throws an IllegalStateException if the milking machine is not installed
    public void milkAnimal(Animal[] animals) 
    {
        if (mc == null) {
            throw new IllegalStateException("No milking machine installed");
        }
        for (Animal animal : animals) {
            mc.milk((Milkable) animal);
        }
    }
    
    
        
    
    

    @Override
    public String toString() {
        return "Shed{" + "id=" + id + ", room=" + room + ", mc=" + mc + '}';
    }
    
    
    
    
    
}
