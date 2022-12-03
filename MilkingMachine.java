/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author tiao
 */
public class MilkingMachine {

    MilkTank tank;
    

    public MilkingMachine() {
    }

    // MilkTank getMilkTank() returns the connected milk tank or null if the tank isn’t installed
    public MilkTank getMilkTank() {
        return tank;
    }

    
    // getter and setter for the tank

    public void setMilkTank(MilkTank tank) {
        this.tank = tank;
    }


    // doesnt work for some reason 

    // public void getMilkTank(MilkTank tank) {
    //     return tank;
    // }

    // void milk(Milkable milkable) milks the cow and fills the connected milk tank; the method returns an IllegalStateException if no tank has been installed

    // fixed the milk bc i used the wrong method name for 
    public void milk(Milkable milkable) {
        if (tank == null) {
            // if tank is null throw exception but with text message
            throw new IllegalStateException("No tank installed");
        }
        else {
            // we are adding tank if they are milkable
            tank.addToTank(milkable.milk());
        }
            
        }
            
    

    // toString()
    @Override
    public String toString() {
        return "MilkingMachine{" + "tank=" + tank + '}';
    }









    
    

    
}
