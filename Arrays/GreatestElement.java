package practice.Array;

public class GreatestElement {
  public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        
        int gretestEle=max(arr,0,arr.length);
        System.out.println(gretestEle);
    }

    static int max(int[] arr,int start,int end) {
        int maxValue=arr[start];
        for (int i = start; i <end ; i++) {
                     
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
}
