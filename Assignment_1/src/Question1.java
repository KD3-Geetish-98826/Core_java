import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter Number : ");
		num = sc.nextInt();
		
		System.out.println("Given Number : " + num );
		
		Integer i = new Integer(num);
		String b = i.toBinaryString(i);
		
		System.out.println("Binary equivalent : " + b);
		
		String c = i.toOctalString(i);
		
		System.out.println("Octal equivalent : " + c);
		
		String d = i.toHexString(i);
		
		System.out.println("Hexadecimal equivalent : " + d);
		
	}
	
}
