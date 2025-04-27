package java;
import java.util.*;
import java.io.*;
public class gamewithintegers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        while(testcases--!=0){
            int n = s.nextInt();
            if(n%3==0){
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}