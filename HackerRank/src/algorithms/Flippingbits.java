package algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Flippingbits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        //Read total input
        int N = scan.nextInt();
        scan.nextLine();
        
        long[] in = new long[N];
        long maxValue = ((long)(Math.pow(2,32))-1);
        int i=0;
        
        while(scan.hasNextLine()){
            in[i] = scan.nextLong();
            in[i] = maxValue^in[i];
            System.out.println(in[i]);
            
           if(scan.hasNextLine())
            scan.nextLine();
            i++;
        }    
    }
}