package Sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//(✷‿✷)
public class BucketSort {
    public static void main(String[] args) {
        int[] arr= {54,46,83,66,95,32,43};
        BucketS(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void BucketS(int[] arr){
        List<Integer>[] buckets = new List[10];
        for (int i = 0; i <buckets.length ; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < arr.length; i++) {
            buckets[hash(arr[i])].add(arr[i]); // The index that we want of bucket where we are gonna put the value into
            //be at the hashed value
        }
        for (List bucket: buckets ){
            Collections.sort(bucket);
        }
        int j=0;
        for (int i = 0; i < buckets.length; i++) { //traversing the bucket array
            for(int value: buckets[i]){ //traversing the arraylist
                arr[j++] = value; //copying sorted value in original array
            }
        }
     }
     private static int hash(int value){
        return value/(int) 10;
     }
}
