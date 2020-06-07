package Sorting;

public class FactorialByR {
    public static void main(String[] args) {
        System.out.println(ifact(5));
        System.out.println(rfact(0));
    }
    public static int ifact(int n){
        if(n == 0){
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }
        return fact;
    }
    public static int rfact(int n){
        if(n == 0){
            return 1;
        }
        //this is the base condition if we do not define this condition then the method is gonna keep calling
        // itself again and again and eventually an error occurred saying "STACK OVERFLOW" because a call stack
        // only have certain amount of memory allocated to it.
        //For ending the recursion(breaking condition/ base case)
        return n * rfact(n-1);
    }
}
