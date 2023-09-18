package decisionmaking;

public class while_loop {
    public static void main(String[] args) {
//        int i = 5;
//        while (i>1){
//            System.out.println(i);
//            i++;
//        };

//        Factorial loop
        int i = 1, facto = 1;

        while (i <= 5){
            facto *= i;
            System.out.println(i + "! " + "= " + facto);
            i++;
        }

//        Infinite Loop
     int k = 100;
        while (k == 100){

        }
    }
}
