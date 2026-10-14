package Main_course.project_GaragarageSysem;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        try {

             System.out.println("Welcome to Rehman Hakat Garage");

             // Customer details

             System.out.println("Enter customer name:");
             String name = sc.nextLine();
             System.out.println("Enter car number:");
             String carNo = sc.nextLine();

             System.out.println("Enter car type (Hatchback/Sedan/SUV):");
             String carType = sc.nextLine();

             Customer customer = new Customer(name, carNo, carType);

             // Available services

             Service[] services = 

             {
                new Service(1, "Car Wash", 300),
                new Service(2, "Oil Change", 400),
                new Service(3, "Brake Check", 150),
                new Service(4, "Coolant Change", 300),
                new Service(5, "Full Service", 1000),
                
            };

             boolean[] selected = new boolean[services.length];

              // Service Selection
            

             while (true) {

                System.out.println("\nAvailable Services: ");

                // Print  all services //

                for (Service s : services) {
                    System.out.println(
                        s.getId() + ". " +
                        s.getName() + " - ₹" +
                        s.getPrice()
                    );
                }

             System.out.println("6. Generate Bill");

             System.out.println("Select Service ID:");

             int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:if(choice == 1 ){
                        System.out.println(services[choice - 1].getName() +" selected successfully.");
                          selected[choice - 1] = true;
                          break;
                    }
                          continue;

                    case 2:if (choice == 2) {
                        System.out.println(services[choice - 1].getName() +" selected successfully.");
                          selected[choice - 1] = true;
                          break;
                    }
                          continue;

                    case 3:if(choice == 3){
                        System.out.println(services[choice - 1].getName() +" selected successfully.");
                         selected[choice - 1] = true;
                         break;
                    }    
                          continue; 

                    case 4:if(choice == 4){
                        System.out.println(services[choice - 1].getName() +" selected successfully.");
                          selected[choice - 1] = true;
                          break;
                    }                       
                          continue;
                    case 5:if (choice == 5) {
                        System.out.println(services[choice - 1].getName() +" selected successfully.");
                          selected[choice - 1] = true;
                          break;
                    }
                          continue;
                            
                          //Final billing
  
                    case 6:int total = BillCalculator.calculatorTotal(services, selected);
                         System.out.println("\n ...... Final bill ......");
                         System.out.println("Cutomer Name  " + customer.getName());
                         System.out.println("Car no " + customer.getCarNumber());
                         System.out.println("Car Type " + customer.getCarType());
                         System.out.println("\n Services Availed");
                          
                        for(int i=0;i<selected.length;i++) 
                          {
                            if (selected[i]) {
                              System.out.println(" Press "+services[i].getId()+ "  : " +
                                services[i].getName()  + "  - ₹ " 
                                + services[i].getPrice());
                                
                            }
                          }
                         System.out.println("........................");
                         System.out.println("Total Amount " + total);
                         System.out.println("Thank you! Visit Again ..");
                         return ;
                         

                    default: if (choice < 0 || choice > services.length) {
                        throw new Exception("Invalid service selection");
                    }
                }
                             
            }


        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

