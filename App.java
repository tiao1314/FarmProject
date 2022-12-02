import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //create a arraylist of animals
        ArrayList<Animal> animals = new ArrayList<Animal>();

        // create a animal
        Animal a = new DairyCow("tiao", 1);
        Animal z = new DairyCow("op", 2);
        System.out.println(a);

        // add animal to arraylist
        animals.add(a);

        // create shed,milkingmachine, milktank, farm, animal
        // create shed
        Shed b = new Shed(1, "room1", animals);
       
        // create milktank
        MilkTank c = new MilkTank( 2000);
        // create milkingmachine
        MilkingMachine milkingMachine = new MilkingMachine();
        // link milkingmachine to milktank
        milkingMachine.setMilkTank(c);
        
        b.installMilkingMachine(milkingMachine);

        // get c
        System.out.println(c);

        System.out.println(milkingMachine.tank.getCustomerSpecificCapacity());
        System.out.println("difference between capacity and current volume: " );
        // milk the animal
        b.milkAnimal(a);
        System.out.println(milkingMachine.tank.getCustomerSpecificCapacity());
        b.milkAnimal(a);
        
        System.out.println(milkingMachine.tank.getCustomerSpecificCapacity());
        b.milkAnimal(a);
        b.milkAnimal(a);
        b.milkAnimal(a);
        b.milkAnimal(a);
        b.milkAnimal(a);
        b.milkAnimal(a);
        b.milkAnimal(z);
        System.out.println(milkingMachine.tank.getCustomerSpecificCapacity());
        
        System.out.println(milkingMachine);
        
        

        

        
    }
}