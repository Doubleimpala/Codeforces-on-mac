import java.util.*;
import java.io.*;
public class blaura {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        int aBin = 0;
        int bBin = 0;
        int cBin = 0;
        
        while(testcases--!=0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            aBin = 0;
            bBin = 0;
            cBin = 0;
            if((a%2==0 && c%2 == 0)||(a%2==1&&c%2==1)){
                bBin=1;
            }
            if((b%2==0 && c%2==0)||(c%2==1 && b%2==1)){
                aBin = 1;
                
            }
            if((b%2==0 && a%2 == 0)||(b%2==1&&a%2==1)){
                cBin = 1;
            }
            
            System.out.println(aBin + " " + bBin + " " + cBin);
        }
    }
}