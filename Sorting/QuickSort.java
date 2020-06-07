package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={20,35,-15,7,55,1,-22};
        QS(arr,0,arr.length);
        for(int j=0;j<arr.length;j++) {
            System.out.print(arr[j] + " ");
        }
    }
    public static void QS(int[] arr,int start,int end){
        if (end - start <2){
            return;
        }
        int pi = partition(arr,start,end);
        QS(arr,start,pi); //left sub-array
        QS(arr,pi+1,end); // right sub-array
    }
    public static int partition(int[] arr, int start, int end){
        // This is using the first element as the pivot
        int i=start;
        int j = end;
        int pivot = arr[start];
        while(i<j){
            // empty loop
            while (i<j && arr[--j]>=pivot);
            if (i<j){
                arr[i] = arr[j];
            }
            // Empty loop
            while (i<j && arr[++i]<= pivot);
            if(i<j){
                arr[j]= arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }
}
