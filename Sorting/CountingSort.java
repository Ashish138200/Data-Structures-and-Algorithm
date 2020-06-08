package Sorting;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr={2,5,9,8,2,8,7,10,4,3};
        CS(arr,1,10);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void CS(int[] arr,int min,int max){
        int[] c = new int[(max-min+1)];
        for (int i = 0; i < arr.length; i++) {
            c[arr[i]-min]++;
        }
        // for writing in the original array
        int j=0;
        for (int i = min; i <=max ; i++) {
            while (c[i-min]>0){
                arr[j++] = i;
                c[i-min]--;
            }
        }
    }
}
