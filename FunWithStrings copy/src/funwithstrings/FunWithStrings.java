/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithstrings;

import java.util.Scanner;

public class FunWithStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isPalindrome = true;
        StringBuilder text = new StringBuilder();
        System.out.print("Enter a sentence/word and I will test to see if it is a palindrome: ");
        String input = in.nextLine();
        text.append(input);
        StringBuilder textReversed = new StringBuilder();
        textReversed.append(input).reverse();
        System.out.println(text);
        System.out.println(textReversed);
        if(text.toString().equals(textReversed.toString())) System.out.println("Palindrome!!");
        for (int i = 0; i < input.length(); i++) {
            if (text.charAt(i) != textReversed.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("original: " + text + " length: "+text.length());
        System.out.println("reversed: " + textReversed);
        if (isPalindrome) {
            System.out.println(text + " is a palindrome! ");
        }
        else
            System.out.println(text + " is not a palindrome, try again :-) ");
    }

}
