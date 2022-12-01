/**
 *
 * @author tiao
 */
public class MilkTank {

    private int standardCapacity = 2000;
    private int customerSpecificCapacity;

    //constructor
    public MilkTank(int customerSpecificCapacity) {
        this.customerSpecificCapacity = customerSpecificCapacity;
    }

    //no arg constructor
    public MilkTank() {
    }

    //getters and setters
    public int getStandardCapacity() {
        return standardCapacity;
    }

    public void setStandardCapacity(int standardCapacity) {
        this.standardCapacity = standardCapacity;
    }

    public int getCustomerSpecificCapacity() {
        return customerSpecificCapacity;
    }

    public void setCustomerSpecificCapacity(int customerSpecificCapacity) {
        this.customerSpecificCapacity = customerSpecificCapacity;
    }

    // get standard capacity
    public double getCapacity() {
        return standardCapacity;
    }

    // free space method
    public double freeSpace() {
        return standardCapacity - customerSpecificCapacity;
    }

    //addToTank method
    // if amount is bigger than freeSpace, then only freeSpace is added else amount is added
    public void addToTank(double amount) {
        if (amount > freeSpace()) {
            customerSpecificCapacity += freeSpace();
        } else {
            customerSpecificCapacity += amount;
        }
    }

    //getFromTank method
    public double getFromTank(double amount) {
        customerSpecificCapacity -= amount;
        return amount;
    }

    
    @Override
    public String toString() {
        return "MilkTank{" + "standardCapacity=" + standardCapacity + ", customerSpecificCapacity=" + customerSpecificCapacity + '}';
    }








    
    









}
