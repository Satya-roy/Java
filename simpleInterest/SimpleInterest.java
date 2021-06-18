package simpleInterest;
import java.util.Scanner;

public class SimpleInterest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int principal = sc.nextInt();
		float interest = sc.nextFloat();
		int time = sc.nextInt();
		
		float si = principal* interest*time/100;
		
		System.out.println("simple interest is "+ si);
	}
}
