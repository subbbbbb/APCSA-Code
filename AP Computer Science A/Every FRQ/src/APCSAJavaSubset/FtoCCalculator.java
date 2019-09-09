package APCSAJavaSubset;

import java.util.Scanner;

public class FtoCCalculator {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("F-C[1] or C-F[2]");
		int option = sc.nextInt();
		if(option == 1) {
			System.out.println("Enter your temperature in Farenheit::");
			double tempF = sc.nextDouble();
			System.out.println((tempF - 32)*(5.0/9.0));
		}
		else if(option == 2) {
			System.out.println("Enter your temperature in Celsius::");
			double tempC = sc.nextDouble();
			System.out.println((tempC + 32)*(9.0/5.0));
		}
		else System.out.println("Error: Please enter a 1 or a 2.");
	}
}
