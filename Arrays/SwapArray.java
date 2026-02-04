package practice.array;

import java.util.Arrays;

public class SwapArray {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        swap(arr,0,4);
    System.out.println(Arrays.toString(arr));

    }
    // Swaping function
    static void swap(int[] arr ,int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }


}
