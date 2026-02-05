package practice.Array;

public class smallestElement {
  public  static void main(String[] args) {
         int[] arr={};
      System.out.println(min(arr));
    }

    static int min(int[] arr) {

        if(arr==null||arr.length==0){
            throw new IllegalArgumentException("Array is empty");        }
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
