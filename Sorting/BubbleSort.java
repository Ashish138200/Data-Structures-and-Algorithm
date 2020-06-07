package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={20,35,-15,7,55,1,-22};
        BS(arr);
    }
    public static void BS(int[] arr){
        for (int lui = arr.length-1; lui>0; lui--){
            for(int i=0;i<lui;i++){
                if (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void swap(int[] arr,int i,int j){
        if (i==j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
