package inputoutput;

import java.util.Scanner;

public class BasicInput {
	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = inputNumber.nextInt();
		System.out.println("You entered: " + number);

		Scanner inputText = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		String text = inputText.next();
		System.out.println("You entered: "+ text);
		inputText.close();
	}
}
