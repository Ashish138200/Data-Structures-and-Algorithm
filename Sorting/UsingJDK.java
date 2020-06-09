package Sorting;

import java.util.Arrays;

//(✷‿✷)
public class UsingJDK {
    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        //Arrays.parallelSort(arr);
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
