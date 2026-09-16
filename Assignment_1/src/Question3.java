import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int quantity;
		double total = 0;
		
		while(true){

            System.out.println("\n--------- FOOD MENU ---------");
            System.out.println("1. Dosa       - ₹50");
            System.out.println("2. Samosa     - ₹20");
            System.out.println("3. Idli       - ₹40");
            System.out.println("4. Vada       - ₹30");
            System.out.println("5. Poha       - ₹30");
            System.out.println("6. Tea        - ₹15");
            System.out.println("7. Coffee     - ₹25");
            System.out.println("8. Misal      - ₹60");
            System.out.println("9. Pav Bhaji  - ₹80");
            System.out.println("10. Generate Bill");
            System.out.println("0. To exit the billing");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
		
		switch(choice) {
			case 0:
				System.out.println("Exiting billing...");
			    return;
			case 1: 
				System.out.print("Enter quantity: ");
			    quantity = sc.nextInt();
			    total += 50 * quantity;
			    break;
			case 2:
				 System.out.print("Enter quantity: ");
				 quantity = sc.nextInt();
				 total += 20 * quantity;
				 break;
			case 3:
				System.out.print("Enter quantity: ");
			    quantity = sc.nextInt();
			    total += 40 * quantity;
			    break;
			case 4:
				System.out.print("Enter quantity: ");
			    quantity = sc.nextInt();
			    total += 30 * quantity;
			    break;
			case 5:
				System.out.print("Enter quantity: ");
			    quantity = sc.nextInt();
			    total += 30 * quantity;
			    break;
			case 6:
				System.out.print("Enter quantity: ");
			    quantity = sc.nextInt();
			    total += 15 * quantity;
			    break;
			case 7:
				System.out.print("Enter quantity: ");
			    quantity = sc.nextInt();
			    total += 25 * quantity;
			    break;
			case 8:
				System.out.print("Enter quantity: ");
			    quantity = sc.nextInt();
			    total += 60 * quantity;
			    break;
			case 9:
				System.out.print("Enter quantity: ");
			    quantity = sc.nextInt();
			    total += 80 * quantity;
			    break;
			case 10:
				System.out.println("Total Bill: ₹" + total);
				break;
            default:
            	System.out.println("Invalid choice!");
            	
		}
	} 
	}
}
