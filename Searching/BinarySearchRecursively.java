package Searching;

import java.util.Arrays;

public class BinarySearchRecursively {
    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        Arrays.sort(arr);
        System.out.println(BinarySearch(arr,-15));
        System.out.println(BinarySearch(arr,22));
        System.out.println(BinarySearch(arr,7));

    }
    public static int BinarySearch(int[] arr,int value) {
        return RBinarySearch(arr,0,arr.length,value);
    }
    public static int RBinarySearch(int[] arr,int start,int end,int value){
        if (start>=end){
            return -1;
        }
        int mid = (start+end)/2;
        if (arr[mid] == value){
            return mid;
        }
        else if(arr[mid]<value){
            return RBinarySearch(arr,mid+1,end,value);
        }
        else {
            return RBinarySearch(arr,0,mid,value);
        }
    }
}
