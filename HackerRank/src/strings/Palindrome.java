package strings;

import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        StringBuilder sb = new StringBuilder(A);
        String B = sb.reverse().toString();
        
        if(B.equals(A)){
             System.out.println("Yes");
        }
        else{
             System.out.println("No"); 
        }
    }
}