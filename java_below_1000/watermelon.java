package java;
import java.util.*;
import java.io.*;
public class watermelon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int e = s.nextInt();
        if(e%2==0&&e>2){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}