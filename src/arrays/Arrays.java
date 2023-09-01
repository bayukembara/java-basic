package arrays;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
//        * this is array is not working
        int[] numbers;
        numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 3;
        numbers[3] = 6;
        numbers[4] = 10;
        System.out.println("Sum : " + (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]));

//        * and this is the alternative

        int[] numberz = {4,6,-3,-2,10};
        numberz[1] = 12;
        System.out.println("--------------------------------");
        System.out.println("New sum :" + (numberz[0] + numberz[1] + numberz[2] + numberz[3] + numberz[4]));




//        int[] age = {24, 14, 8, 12, 16, 19, 36,40};
//        int size = age.length;
//
////        * bubblesort
////        * 1st indentified the anchor point for exchange
//        int i,j,temp;
////      * 2nd make a looping to compare index i less than array length then loop
//        for(i =0; i < size; i++){
////        *3rd make a looping and make a j variable and compare j with length array - index i and - 1
//            for(j=0;j<size-i-1;j++){
////              *4th make a compare if array index j more than array j + 1 then
////              * make a temp value array index j and array index j make a value array index j + 1 and the last array j + 1 set the value to temp;
//                if(age[j]>age[j+1]){
//                    temp = age[j];
//                    age[j] = age[j+1];
//                    age[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(("The array after sorting is:"));
//        for(i=0;i<size;i++){
//            System.out.println(age[i]);
//        }
//    }
    }
}
