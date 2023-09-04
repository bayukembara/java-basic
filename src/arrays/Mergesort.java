package arrays;

public class Mergesort {

    public static void main(String[] args) {
        int[] array = {21,23,24,25,6,7,8,10,20,11,2,1,3};

        int[] merged = mergeSort(array,0,array.length -1);

        for(int val : merged){
            System.out.println(val + " ");
        }
    }
    public static int[] mergeTwoSortedArray(int[] one, int[] two){

        int[] sorted =  new int[one.length + two.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < one.length && j < two.length){
            if(one[i] < two[j]){
                sorted[k] = one[i];
                k++;
                i++;
            }else{
                sorted[k] = two[j];
                k++;
                j++;
            }
        }

        if (i == one.length){
            while (j < two.length){
                sorted[k] = two[j];
                k++;
                j++;
            }
        }

        if(j==two.length){
            while(i<one.length){
                sorted[k] = one[i];
                k++;
                i++;
            }
        }

        return sorted;
    }

    public static int[] mergeSort(int[] arr,int lo, int hi){
        if(lo == hi){
            int[] br = new int[1];
            br[0] = arr[lo];

            return br;
        }

        int mid = (lo + hi) /2;

        int[] fh = mergeSort(arr,lo,mid);
        int[] sh = mergeSort(arr,mid+1,hi);

        int[] merged = mergeTwoSortedArray(fh,sh);

        return merged;
    }
}
