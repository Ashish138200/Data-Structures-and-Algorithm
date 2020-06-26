package Searching;

import java.util.Arrays;

//(✷‿✷)
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        Arrays.sort(arr);
        System.out.println(BinarySearch(arr,-15));
        System.out.println(BinarySearch(arr,22));
        System.out.println(BinarySearch(arr,7));

    }
    public static int BinarySearch(int[] arr,int value){
        int mid = (int) arr.length/2;
        if (value == arr[mid]){
            return mid;
        }
        else if (value>arr[mid]){
            for (int i = mid+1; i < arr.length; i++) {
                if (arr[i] == value){
                    return i;
                }
            }
        }
        else {
            for (int i = 0; i < mid; i++) {
                if (arr[i] == value){
                    return i;
                }
            }
        }
        return -1;
    }
}
