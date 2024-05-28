//problem 1900A
import java.util.*;
import java.io.*;
public class coverinwater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        
        //if consecutive . is >= 2 and even, it takes 2. If >2 but odd, it takes 3. 
        //if <2, it takes number of consecutive ones added up.
        while(testcases--!=0){
            int n = s.nextInt();
            String rowString = s.next();
            int numDots = 0;
            if(rowString.contains("...")){
                System.out.println(2);
            } else if(!rowString.contains(".")){
                System.out.println(0);
            } else{
                for(int i = 0; i<n;i++){
                    if(rowString.charAt(i)=='.'){
                        numDots++;
                    }
                }
                System.out.println(numDots);
            }
        }
    }
}