package decisionmaking;

public class for_each {
    public static void main(String[] args) {
        char[] letters = {'h','e','l','l','o'};
//        for(int i = 0; i < letters.length; i++) {
//            System.out.println(letters[i]);
//        }
//        * for each loops
//        for(char item : letters){
//            System.out.println(item);
//        }
//        * for each loops number
        int[] numbers = {6,4,3,5};
        int sum = 0;
        for(int num : numbers){
            sum += num;
            System.out.println(num);
        }
        System.out.println("Sum of the array " + sum);
    }
}
