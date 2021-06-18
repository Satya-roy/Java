package userInput;
import java.util.Scanner;


public class ScannerUserInput {

	public static void main(String[] args) {
		
		//scanner class ka object bana rahe hai
		Scanner sc = new Scanner(System.in);
		
		
		
		String hello = sc.nextLine();
		
		System.out.println(hello);
	}

}
