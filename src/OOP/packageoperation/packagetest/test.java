package OOP.packageoperation.packagetest;

//? Package that i make
import OOP.packageoperation.*;
//* Built in package
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 integers numbers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        multiply obj = new multiply();
        addition objAdd = new addition();

        System.out.println("Result : " + obj.multiply(number1,number2));
        System.out.println("Result : " + objAdd.add(number1,number2));
    }
}
