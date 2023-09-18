package codewars;

public class findThePosition {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String alphabet = "a";
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] == alphabet){
                System.out.println("Position of alphabet: " +(i+1));
            }
        }
    }
}
