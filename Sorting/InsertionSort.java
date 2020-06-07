package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={20,35,-15,7,55,1,-22};
        IS(arr);
    }
    public static void IS(int[] arr){
        for (int fui = 1; fui < arr.length ; fui++) {
            int newElement = arr[fui];
            int i;
            for (i = fui; i > 0 && arr[i-1] > newElement; i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
