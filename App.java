import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // farm arraylist
        

        // Menu
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Welcome to the Farm Management System");
        System.out.println("====================================");
        System.out.println("1.  Add a new farm");
        System.out.println("2.  Print The deails of the farm");
        System.out.println("12. Exit the application");
        System.out.println("====================================");
        System.out.println("\n");
        System.out.println("Please enter your choice: ");
        

        int choice;

        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

        Farm f1 = new Farm();

        while(choice != 12){

            if (choice ==1){
                

                System.out.println("====================================");
                // auto generate id for farm
                int farmId = (int) (Math.random() * 100 + 1);
                System.out.println("Enter the farm owner: ");
                // store farm owner in farm arraylist
                String farmOwner = input.next();
                // add shed to farm
                int shedId = (int) (Math.random() * 100 + 1);
                // create a milk tankobject

                // classname objectname = new classname();
                System.out.println("\n");
                System.out.println("Enter the milk tank capacity: ");
                System.out.println("Cannot go above 2000 litres");
                //if milk tank capacity is greater than 2000 litres
                // ask user to enter a new value
                
                int milkTankCapacity = input.nextInt();
                MilkTank milkTank = new MilkTank(milkTankCapacity);

                // create a milking machine object
                MilkingMachine milkingMachine = new MilkingMachine();
                milkingMachine.setMilkTank(milkTank);

                System.out.println("What animal would you like to add to the shed?");
                System.out.println("====================================");
                System.out.println("Table of animals");
                System.out.println("1. BeefCow");
                System.out.println("2. Sheep");
                System.out.println("3. Goat");
                System.out.println("4. DairyCow");
                System.out.println("====================================");

                int animalChoice = input.nextInt();
                ArrayList <Animal> animals = new ArrayList<>();

                if (animalChoice == 1){

                    System.out.println("Enter BeefCow Name :");
                    String beefCowName = input.next();
                    // auto generate my beefcow id
                    int beefCowId = (int) (Math.random() * 100 + 1);
                    System.out.println("Enter BeefCow weight");
                    int beefCowWeight = input.nextInt();
                    System.out.println("Enter BeefCow age");
                    int beefCowAge = input.nextInt();
                    System.out.println("Enter BeefCow pedigree");
                    String beefCowPedigree = input.next();
                    Animal beef = new BeefCow(beefCowName,beefCowId,beefCowWeight,beefCowAge,beefCowPedigree);
                    animals.add(beef);
                }

                else if (animalChoice == 2){
                    
                    System.out.println("Enter Sheep Name :");
                    String sheepName = input.next();
                    // auto generate my beefcow id
                    int sheepId = (int) (Math.random() * 100 + 1);
                    System.out.println("Enter sheep weight");
                    int sheepWeight = input.nextInt();
                    System.out.println("Enter sheep age");
                    int sheepAge = input.nextInt();
                    System.out.println("Enter sheep pedigree");
                    String sheepPedigree = input.next();
                    
                    // animal class with a gien variable name = sheep class constructor
                    Animal sheep = new Sheep(sheepName,sheepId,sheepWeight,sheepAge,sheepPedigree);
                    animals.add(sheep);

                }

                else if (animalChoice == 3){

                    System.out.println("Enter Goat Name :");
                    String goatName = input.next();
                    // auto generate my beefcow id
                    int goatId = (int) (Math.random() * 100 + 1);
                    System.out.println("Enter sheep udder capacity");
                    int goatUdders = input.nextInt();
                    // animal class with a gien variable name = sheep class constructor
                    Animal goat = new Goats(goatName,goatId,goatUdders);
                    animals.add(goat);
                }

                else if (animalChoice ==4){

                    System.out.println("Enter DairyCow Name :");
                    String dairyCowName = input.next();
                    // auto generate my beefcow id
                    int dairyCowId = (int) (Math.random() * 100 + 1);
                    System.out.println("Enter dairyCow udder capacity");
                    
                    // animal class with a gien variable name = sheep class constructor
                    DairyCow dairyCow = new DairyCow(dairyCowName,dairyCowId);
                    dairyCow.udderCapacity();
                    animals.add(dairyCow);

                }

                
                Shed shed = new Shed(shedId, animals);
                shed.installMilkingMachine(milkingMachine);
                ArrayList <Shed> sheds = new ArrayList<>();
                sheds.add(shed);



                f1 = new Farm(farmId, farmOwner, sheds);

                System.out.println("====================================");




            }

            else if (choice == 2){

                System.out.println(f1);

            }

            else if (choice == 3){

                System.out.println("yet to be implemented");

                
            }

            else if (choice == 4){

                System.out.println("yet to be implemented");
                
            }

            else if (choice == 5){

                System.out.println("yet to be implemented");
                
            }

            else if (choice == 6){

                // print the details of the farm and animal
                



                
            }

            else if (choice == 7){

                System.out.println("yet to be implemented");
                
            }

            else if (choice == 8){

                System.out.println("yet to be implemented");
                
            }

            else if (choice == 9){

                System.out.println("yet to be implemented");
                
            }

            else if (choice == 10){

                System.out.println("yet to be implemented");
                
            }

            else if (choice == 11){

                System.out.println("yet to be implemented");
                
            }

            // dont need to do anything for choice 12 as it is the exit option

            // Menu to loop
            System.out.println("Welcome to the Farm Management System");
            System.out.println("====================================");
            System.out.println("1.  Add a new farm");
            System.out.println("2.  Print The deails of the farm");
            System.out.println("12. Exit the application");
            System.out.println("====================================");
            System.out.println("\n");
            System.out.println("Please enter your choice: ");
            System.out.println("\n");
            

            choice = input.nextInt();

        }


        

        

        






        
        
        

        
    }

    
}