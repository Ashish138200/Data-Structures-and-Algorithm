/*
Change Insertion Sort so that it uses recursion
*/
package Sorting.Challenges;
//(✷‿✷)
public class Challenge2 {
    public static void main(String[] args) {
        int[] arr={20,35,-15,7,55,1,-22};
        iS(arr,7);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void iS(int[] arr,int numItems){
        if (numItems<2){
            return;
        }
        iS(arr,numItems-1);
        int newElement = arr[numItems-1];
        int i;
        for (i = numItems-1; i > 0 && arr[i-1] > newElement; i--) {
            arr[i] = arr[i-1];
        }
        arr[i] = newElement;
    }
}
