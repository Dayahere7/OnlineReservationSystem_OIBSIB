

import java.util.Scanner;

public class OnlineReservationSystem {

		// TODO Auto-generated method stub
	

		

		    // Initialize variables for user login
		    static String username;
		    static String password;
		    

		    // Initialize variables for reservation form
		    static int vehicleNumber;
		    static char vehicleName;
		    static String classType;
		    static String from;
		    static String to;
		    static String dateOfJourney;

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        

		        // Login form
		        System.out.println("-------------------------------------------");
		        System.out.println("");
		        System.out.println("         ONLINE RESRVATION SYSTEM          ");
		        System.out.println("");
		        System.out.println("-------------------------------------------");
		        System.out.println("");
		        System.out.print("         enter    yourname :");
		        String inputUsername = sc.nextLine();
		        System.out.print("        enter  your Dob as Password :");
		        String inputPassword = sc.nextLine();
		        System.out.println("");

		        if (!inputUsername.isEmpty()&&! inputPassword.isEmpty()) {
		            System.out.println("-------------------------------------------");

		            System.out.println("          Login successfully...            ");
		        } else {
		            System.out.println("");
		            System.out.println("        Invalid login credentials...        ");
		            System.out.println("");

		           
		        }

		        // Reservation system
		        System.out.println("-------------------------------------------");
		        System.out.println("");
		        System.out.println("Please fill the details for your reservation :");
		        System.out.println("");

		        System.out.print("vehicle number: ");
		        vehicleNumber = sc.nextInt();

		        System.out.println("");
		        System.out.print("vehicle name: ");
		        vehicleName = sc.next().charAt(0);

		        System.out.println("");
		        System.out.print("Class type: ");
		        classType = sc.next();

		        System.out.println("");
		        System.out.print("From: ");
		        from = sc.next();

		        System.out.println("");
		        System.out.print("To: ");
		        to = sc.next();

		        System.out.println("");
		        System.out.print("Date of journey: ");
		        dateOfJourney = sc.next();
		        System.out.println("");

		        // Print ticket
		        System.out.println("-------------------------------------------");
		        System.out.println("");
		        System.out.println("            TICKET DETAILS                ");
		        System.out.println("");
		        System.out.println("-------------------------------------------");
		        System.out.println("");
		        System.out.println("vehicle Number: " + vehicleNumber);
		        System.out.println("vehicle Name: " + vehicleName);
		        System.out.println("Class Type: " + classType);
		        System.out.println("From: " + from);
		        System.out.println("To: " + to);
		        System.out.println("Date of Journey: " + dateOfJourney);
		        System.out.println("");
		        System.out.println("-------------------------------------------");
		        System.out.println("");
                System.out.println(" ur reservation succesfully completed");
                System.out.println("-------------------------------------------");
                
		        // Cancellation form
                System.out.println("if u want to cancel the reservation if yes plz enter/type the cancel");
                String userinput=sc.next();
                if(userinput.equalsIgnoreCase("cancel")) {
                	System.out.println("ur reservation system cancelled stoped");
                	System.out.println("Happy journey to you");
                }
                else {
		        System.out.println("Enter PNR number to cancel a reservation: ");
		        String pnrNumber = sc.next();
		        System.out.println("");
		        System.out.println("Do you want to cancel this ticket (OK/Cancel): ");
		        String confirmation = sc.next();
		        if (confirmation.equalsIgnoreCase("OK")) {
		            System.out.println("");
		            System.out.println("Reservation cancelled successfully...");
		        } else {
		            System.out.println("Reservation not cancelled...");
		        }

		        sc.close();
		    }
		
	}
}


