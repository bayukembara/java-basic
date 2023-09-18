package decisionmaking;

public class for_loops {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10;i++){
//            System.out.println(i);
//        }

        int sum = 0;
        for(int k = 0; k<=10;k++){
            sum += k;
            System.out.println(k);
        }
        System.out.println("Sum of number " + sum);
//        * only + even number
        for(int k = 0; k<=10;k += 2){
            sum += k;
            System.out.println(k);
        }
        System.out.println("Sum of number " + sum);
    }
}
