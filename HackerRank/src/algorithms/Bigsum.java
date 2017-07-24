package algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bigsum {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        
        String[] arr;
        String temp = input.nextLine();
        arr = temp.split(" ");
        
        long sum = 0;
        for(int i=0; i<n; i++){
            sum += Long.parseLong(arr[i]);
        }
        
        System.out.println(sum);
    }
    
}
