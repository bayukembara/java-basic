package Methods;

import java.util.Scanner;

public class methodExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        show(number1, number2);
        int a = add(number1,number2);
        int b = min(number1,number2);
        System.out.println(" Sum of Numbers: " + a );
        System.out.println(" Minimum of Numbers: " + b );
    }
//    * display numbers.
    public static void show(int num1, int num2){
        System.out.println("You entered : " + num1 +" and "+ num2);
    }
//    * return the sum of two parameters
    public static int add(int num1,int num2){
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }
//    * return the minimum of two parameters
    public static int min(int num1,int num2){
        return num1> num2 ? num2 : num1;
    }

//
}
