package Searching;
//(✷‿✷)
// O(n)
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        System.out.println(LS(arr,-15));
        System.out.println(LS(arr,22));
    }
    public static int LS(int[] arr,int value){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
