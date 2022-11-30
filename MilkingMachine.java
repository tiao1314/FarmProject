package FarmProject;



public class MilkingMachine {
    
    MilkTank mt;

    //method public MilkingMachine()
    public MilkingMachine() {
    }

    //method MilkTank getMilkTank() returns the connected milk tank or null if the tank isn’t installed
    public MilkTank getMilkTank() {
        return mt;
    }

    //method void setMilkTank(MilkTank tank) installs the milk tank
    public void setMilkTank(MilkTank tank) {
        this.mt = tank;
    }

    //method void milk(IMilkable milkable) milks the cow and fills the connected milk tank; the method returns an IllegalStateException if no tank has been installed
    public void milk(Milkable milkable) {
        if (mt == null) {
            throw new IllegalStateException("No tank installed");
        }
        mt.addToTank(milkable.milk());
    }

    
    

    


    

    
}
