/*
* Using stack and a queue, determine whether a string is a palindrome
* Strings may contain punctuation and spaces.They should be ignored. Case should be ignored.
*/
package Queues.Challenge;

import ArrayAndBigONotation.Array;

import java.util.LinkedList;
//(✷‿✷)
public class Challenge {
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowercase = string.toLowerCase();
        for (int i = 0; i <lowercase.length() ; i++) {
            char c = lowercase.charAt(i);
            if (c>= 'a' && c<='z'){
                stack.push(c);
                queue.addLast(c);
            }
        }
        while(!stack.isEmpty()){
            if (!stack.pop().equals(queue.removeFirst())){
                return false;
            }
        }
        return true;
    }
}
