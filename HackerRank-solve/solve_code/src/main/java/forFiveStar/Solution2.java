/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forFiveStar;

import java.util.Scanner;

public class Solution2 {

    public static String getSmallestAndLargest(String s, int k) {
        String largest = "";
        
        for(int i=0; i<k; i++) {
            largest+=s.charAt(i);
        }
        
        String smallest = "";
        for(int i=(s.length()-k); i<s.length(); i++) {
            smallest+=s.charAt(i);
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        System.out.println(getSmallestAndLargest(s, k));
    }
}
