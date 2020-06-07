package ArrayAndBigONotation;

public class Array {

    public static void main(String[] args) {
	    int[] intArray = new int[7]; //size cannot be changed at runtime.

	    intArray[0] = 20;
	    intArray[1] = 35;
	    intArray[2] = -15;
	    intArray[3] = 7;
	    intArray[4] =55;
	    intArray[5] = 1;
	    intArray[6] = -22;

	    for (int i = 0; i < intArray.length; i++) {
	        System.out.println(intArray[i]);
        }
    }
}
