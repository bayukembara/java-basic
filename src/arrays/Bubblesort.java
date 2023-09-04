package arrays;

public class Bubblesort {

    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,8,8,9,10,20,21};

        int arrLength = array.length;

        int i,j,temp;

        for(i=0;i<arrLength;i++){
            for(j=0;j<arrLength-i-1;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(" The array after sorting is ");
        for(i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
