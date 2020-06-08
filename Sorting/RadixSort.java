package Sorting;
//(✷‿✷)
public class RadixSort {
    public static void main(String[] args) {
        int[] arr= {1330,4586,1594,4725,5729,8792};
        RS(arr,10,4);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void RS(int[] arr,int radix,int width){
        for (int i = 0; i < width; i++) {
            RSS(arr,i,radix);
        }
    }
    public static void RSS(int[] arr,int pos,int radix){
        int numItems = arr.length;
        int[] c = new int[radix];
        for (int value: arr){
            c[getDigit(pos,value,radix)]++;
        }
        //Adjust the count array
        for (int j = 1; j < radix ; j++) {
            c[j] += c[j-1];
        }
        int[] temp = new int[numItems];
        for (int ti = numItems-1; ti >=0 ; ti--) {
            temp[--c[getDigit(pos,arr[ti],radix)]] = arr[ti];
        }
        for(int ti = 0; ti< numItems ;ti++){
            arr[ti] = temp[ti];
        }
    }
    public static int getDigit(int pos,int value,int radix) {
        return value/(int) Math.pow(radix,pos)%radix;
    }
}
