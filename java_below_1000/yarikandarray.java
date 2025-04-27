package java;
import java.util.*;
import java.io.*;
public class yarikandarray {
    public static ArrayList<Integer> takenIndex = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        while(testcases--!=0){
            takenIndex.clear();
            int n = s.nextInt();
            String prompt = s.next();
            
            ArrayList<Integer> sums = new ArrayList<Integer>();
            int[] str = new int[n];
            //check forward and backward until you can't, find sum, save indeces.
            //Don't find next highest number in saved indeces. Repeat for next highest number.
            //Find highest sum and print.
            for(int o = 0; o<n; o++){
                str[o]=prompt.charAt(o);
            }
            int maximum = maxFind(str,n);
            while(maxFind(str,n) != 0){
            int sum = 0;
                while(str[maximum]%2 == str[maximum-1]%2){
                    if(maximum != 0 && (str[maximum-1]+ str[maximum])>str[maximum]){
                        takenIndex.add(maximum);
                        sum += prompt.charAt(maximum);
                        maximum = maximum-1;
                    } else {
                        break;
                    }
                }
                while(str[maximum%2] == str[maximum+1]%2){
                    if(maximum != n-1 && (str[maximum+1]+ sum)>sum){
                        takenIndex.add(maximum);
                        sum+=prompt.charAt(maximum);
                        maximum = maximum+1;
                    } else {
                        break;
                    }
                }
            } 
        }
    }
    static int maxFind(int[] str, int n){
        int max = -Integer.MAX_VALUE;
            int maxIndex = 0;
            for(int i = 0; i<n;i++){
                if(str[i] > max && !takenIndex.contains(i)){
                    max = str[i];
                    maxIndex = i;
                }
            }
            return maxIndex;
    }
    
}