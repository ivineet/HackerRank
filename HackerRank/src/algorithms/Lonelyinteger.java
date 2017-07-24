package algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lonelyinteger {

    static int lonelyinteger(int[] a) {
        
        int result = 0;
        for(int i=0; i<a.length; i++){
            result = result ^ a[i];  
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        in.nextLine();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}

