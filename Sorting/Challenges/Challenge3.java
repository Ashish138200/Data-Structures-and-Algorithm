/*
 Sort the following array using Radix Sort
*/
package Sorting.Challenges;
//(✷‿✷)
public class Challenge3 {
    public static void main(String[] args) {
        String[] arr={"bcdef","dbaqc","abcde","omadd","bbbbb"};
        rS(arr,26,5);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void rS(String[] arr,int radix,int width){
        for (int i = width-1; i >=0; i--) {
            rSS(arr,i,radix);
        }
    }
    public static void rSS(String[] arr, int pos, int radix){
        int numItems = arr.length;
        int[] c = new int[radix];
        for (String value: arr){
            c[getChar(pos,value)]++;
        }
        //Adjust the count array
        for (int j = 1; j < radix ; j++) {
            c[j] += c[j-1];
        }
        String[] temp = new String[numItems];
        for (int ti = numItems-1; ti >=0 ; ti--) {
            temp[--c[getChar(pos,arr[ti])]] = arr[ti];
        }
        for(int ti = 0; ti< numItems ;ti++){
            arr[ti] = temp[ti];
        }
    }
    public static int getChar(int pos, String value){
        return value.charAt(pos) - 'a';
    }
}
