package decisionmaking;

import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
//        int number = 1;
//        do{
//            System.out.println(number + " ");
//            number++;
//        } while(number <=20);

        Scanner inputScanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("-----MENU-----");
            System.out.println("1. Apple");
            System.out.println("2. Banana");
            System.out.println("3. Cake");
            System.out.println("4. Exit");
            System.out.println("Select an option :");
            choice = inputScanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Apple");
                    break;
                case 2:
                    System.out.println("Banana");
                    break;
                case 3:
                    System.out.println("Cake");
                    break;
            }
        } while(choice != 4);
    }
}
