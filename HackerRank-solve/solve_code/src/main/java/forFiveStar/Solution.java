/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forFiveStar;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        s = delLetters(s);
        
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        String[] words = s.split("[^a-zA-Z]+");
        
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static String delLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }
}