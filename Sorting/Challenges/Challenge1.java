/*
Modify the merge sort algorithm so that it sorts integers in DESCENDING order
*/
package Sorting.Challenges;
//(✷‿✷)
public class Challenge1 {
    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        mS(arr,0,arr.length);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void mS(int[] arr,int start,int end){
        if (end-start<2){
            return;
        }
        int mid = (start+end)/2;
        mS(arr,start,mid);
        mS(arr,mid,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start,int mid,int end){
        if (arr[mid-1]>=arr[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int ti = 0;
        int[] temp = new int[end-start];
        while (i<mid && j<end){
            temp[ti++]= arr[i] >= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr,i,arr,start+ti,mid - i);
        System.arraycopy(temp,0,arr,start,ti);
    }
}
