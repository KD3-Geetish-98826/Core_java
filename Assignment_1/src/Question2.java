import java.util.Scanner;

public class Question2 {
	
	public void printAvg(double n1, double n2) {
		double result = (n1 + n2) / 2;
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		Question2 que = new Question2();
		
		double num1;
		double num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Double/Decimal numbers ");
		
		System.out.print("Enter the 1st number : ");
		if(sc.hasNextDouble()) {
			if(!sc.hasNextInt()) {
				num1 = sc.nextDouble();
				System.out.print("Enter the 2nd number : ");
				if(sc.hasNextDouble()) {
					if(!sc.hasNextInt()) {
						num2 = sc.nextDouble();
						que.printAvg(num1, num2);
					}
					else {
						System.out.println("You Entered invalid value, please enter correct double/decimal value eg - 10.5");
					}
				}
			}
			else {
				System.out.println("You Entered invalid value, please enter correct double/decimal value eg - 10.5");
			}
		}
	}
}
