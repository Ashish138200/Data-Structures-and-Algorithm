package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={20,35,-15,7,55,1,-22};
        MS(arr,0,arr.length);
        for(int j=0;j<arr.length;j++) {
            System.out.print(arr[j] + " ");
        }
    }
    public static void MS(int [] arr,int start,int end){
        //base condition
        if(end - start<2){
            return;
        }
        int mid = (start+end)/2;
//--------------------------------------------<Splitting>---------------------------------------------------------------
        MS(arr,start,mid); //left
        MS(arr,mid,end); //right
//-------------------------X--------------------------------------------------------------X-----------------------------
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start,int mid,int end){
        int[] temp = new int[end-start];
        if(arr[mid-1]<= arr[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int ti = 0;
        while(i<mid && j<end){
            // because MS is     | stable that's why we've this equals
            temp[ti++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        //handling the remaining elements which we haven't traversed
        // the elements which will be greatest(in the right partition) will not be copied in the temp array because then
        // we'll over-writing it in the arr and doing more job and vice-versa is not true because the elements in the
        // right partition gonna change their positions
        System.arraycopy(arr,i,arr,start+ti,mid - i);
        //                |  |  |
        //         {srcArr}{firstIndex}{destArr}
        System.arraycopy(temp,0,arr,start,ti);
        //
        //
    }
}
