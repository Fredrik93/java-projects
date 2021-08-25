package class_exercises;

import java.util.*;

public class exerc_1 {

	public static int square(int num, int num2) {
		int mult = num * num2;
		return mult * mult;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number ");
		int num1 = scan.nextInt();
		System.out.println("And the second ");
		int num2 = scan.nextInt();

		System.out.println(square(num1, num2) + " is the num");
	}

}
