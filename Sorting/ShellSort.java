package Sorting;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr={20,35,-15,7,55,1,-22};
        ShS(arr);
    }
    public static void ShS(int[] arr){
        for (int gap = arr.length/2; gap >0 ; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;
                while(j>= gap && arr[j-gap] > newElement){
                    arr[j] = arr[j-gap];
                    j -= gap;
                }
                arr[j]=newElement;
            }
        }
        for(int j=0;j<arr.length;j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
