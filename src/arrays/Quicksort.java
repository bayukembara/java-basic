package arrays;

import java.util.Random;

public class Quicksort {

    public static void main(String[] args) {
        Random acak = new Random();
        int[] numbers = new int[10];

       for (int i = 0;i < numbers.length;i++){
           numbers[i] = acak.nextInt(100);
       }

        System.out.println("The array before sorting is:");
       for(int num : numbers){
           System.out.println(num + " ");
       }

        quickSort(numbers,0,numbers.length-1);
        System.out.println("The array after sorting is: ");
        for(int num : numbers){
            System.out.println(num + " ");
        }
    }

//    * Quicksort is 3 step that is only partition,quick sort and look the highest index

    public static void quickSort(int[] arr,int lowIndex,int highIndex){
        if (lowIndex < highIndex){
            int pivotIndex = partition(arr,lowIndex,highIndex);

            quickSort(arr,lowIndex,pivotIndex -1);
            quickSort(arr,pivotIndex + 1,highIndex);
        }
    }

    private static int partition(int[] arr, int lowIndex, int highIndex){
        int pivot = arr[highIndex];
        int i = lowIndex -1;
        for (int j = lowIndex ; j < highIndex ; j++){
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
//        * Swap arr[i+1] and arr[highIndex] /(the pivot)

        int temp = arr[i +1];
        arr[i+1]=arr[highIndex];
        arr[highIndex]=temp;
        return i+1;
    }
}
