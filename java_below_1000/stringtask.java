package java;
//Problem 118A

import java.util.*;
import java.io.*;
public class stringtask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String e = s.nextLine();
        int g = e.length();
        int i = 0;
        while(i<e.length()){
            if(Character.toLowerCase(e.charAt(i)) == 'a' || Character.toLowerCase(e.charAt(i)) == 'e' || Character.toLowerCase(e.charAt(i)) == 'i'|| Character.toLowerCase(e.charAt(i)) == 'o'|| Character.toLowerCase(e.charAt(i)) == 'u'){
                e = e.substring(0, i) + e.substring(i+1);
            } else if(e.charAt(i) != '.'){
                e = e.substring(0, i) + Character.toLowerCase(e.charAt(i)) + e.substring(i+1);
                e = e.substring(0,i) + '.' + e.substring(i);
                i++;
            }
            i++;
        }
        System.out.println(e);
    }
}