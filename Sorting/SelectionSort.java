package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={20,35,-15,7,55,1,-22};
        SS(arr);
    }
    public static void SS(int[] arr){
        for (int lui = arr.length-1; lui >0 ; lui--) {
            int largest = 0;
            for (int i = 0; i <= lui ; i++) {
                if(arr[i] > arr[largest]){
                    largest=i;
                }
            }
            swap(arr,largest,lui);
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
