//Problem 118A

import java.util.*;
import java.io.*;
public class stringtask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String e = s.nextLine();
        int g = e.length();
        for(int i = 0; i< g; i++){
            if(Character.toLowerCase(e.charAt(i)) == 'a' || Character.toLowerCase(e.charAt(i)) == 'e' || Character.toLowerCase(e.charAt(i)) == 'i'|| Character.toLowerCase(e.charAt(i)) == 'o'|| Character.toLowerCase(e.charAt(i)) == 'u'){
                e = e.substring(0, i) + e.substring(i+1);
            } else if(e.charAt(i) != '.'){
                e = e.substring(0,i) + '.' + e.substring(i);
                e = e.substring(0, i) + Character.toLowerCase(e.charAt(i)) + e.substring(i+1);
                i++;
            } else {
                g++;
            }
        }
        System.out.println(e);
    }
}