package FarmProject;



public class MilkTank {
//    private String dairyCowMilkTank;
//    private String goatMilkTank;
    private int standardCapacity = 2000;
    private int customerCapacity;
    MilkingMachine mc;

    public MilkTank(int customerCapacity) {
        this.customerCapacity = customerCapacity;
    }
    

    public MilkTank() {
    }

    public int getStandardCapacity() {
        return standardCapacity;
    }

    public double freeSpace()
    {
        return standardCapacity - customerCapacity;
    }
       
    public void addToTank(double amount) 
    {
        customerCapacity += amount;
    }
    
    public double getFromTank(double amount) 
    {
        customerCapacity -= amount;
        return amount;
    }
    
    public MilkTank getConnectedTank()
    {
        return null;
    }
    

    @Override
    public String toString() {
        return "MilkTank{" + "standardCapacity=" + standardCapacity + ", customerCapacity=" + customerCapacity + '}';
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
