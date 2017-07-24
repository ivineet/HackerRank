package strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/java-string-compare?h_r=next-challenge&h_v=zen
/*
 * Given a string, , and an integer, , complete the function so that it
 *  finds the lexicographically smallest and largest substrings of length k .
 */

public class SmaLarSubK {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        if(s.length() < k)
            return "";
        
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        
        for(int i=0; i <= s.length()-k; i++ ){
            if(smallest.compareTo(s.substring(i,i+3)) > 0){
                smallest = s.substring(i, i+k);
               // System.out.println(smallest);
            }
            
            if(largest.compareTo(s.substring(i,i+k)) < 0){
                largest = s.substring(i, i+k);
            }
            
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.nextLine();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
